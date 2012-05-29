package org.drykiss.android.app.agi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class AGIActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        getApplicationContext().startService(new Intent(this, AgiService.class));
    }
}
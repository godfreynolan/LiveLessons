package com.riis.logfiles;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

public class MainActivity extends Activity {

	public static final String APP_TAG = "com.riis.logfiles";
	public static final String PassportNumber = "W123456";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // todo - add code to enter passport number
        
        Log.d(APP_TAG, "Passport document #  - " + PassportNumber);
        
        
    }


}

package com.riis.noobfuscation;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

	public static final String API_KEY = "W123456";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        try {
        	  URL url = new URL("http://www.riis.com/" + API_KEY );
        	  HttpURLConnection con = (HttpURLConnection) url
        	    .openConnection();
        	  readStream(con.getInputStream());
        	  } catch (Exception e) {
        	  e.printStackTrace();
        	}
    }

	private void readStream(InputStream in) {
		// TODO Auto-generated method stub
		return;
	}
}


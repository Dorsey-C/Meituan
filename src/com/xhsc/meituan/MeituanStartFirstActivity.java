package com.xhsc.meituan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class MeituanStartFirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_start_activity_layout);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
					startActivity(new Intent(MeituanStartFirstActivity.this,MTuanLoginActivity.class));
					finish();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}).start();
		
		
	}
}

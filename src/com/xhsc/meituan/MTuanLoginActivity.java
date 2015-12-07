package com.xhsc.meituan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MTuanLoginActivity extends Activity {
	Button mLoginBtn;
	EditText mUserNameEdit,mPasswordEdit;
	ImageView mUserNameImagClear,mPasswordImagClear;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_meituan_login_activity);
		mLoginBtn = (Button)findViewById(R.id.second_activity_login_button);
		mUserNameEdit = (EditText)findViewById(R.id.login_username_editext);
		mPasswordEdit = (EditText)findViewById(R.id.login_password_editext);
		mUserNameImagClear = (ImageView)findViewById(R.id.login_clear_username_Imageview);
		mPasswordImagClear = (ImageView)findViewById(R.id.login_clear_password_Imageview);
	}
	
	public void loginBtnSucess(View v){
		String username = mUserNameEdit.getText().toString();
		String userPassword = mPasswordEdit.getText().toString();
		boolean isUserName = username.isEmpty();
		boolean isuserPassword = userPassword.isEmpty();
		if(isUserName&&isuserPassword){
			Toast.makeText(this, "登陆失败", Toast.LENGTH_SHORT);
			mUserNameEdit.setText("");
			mPasswordEdit.setText("");
			
			
		}else{
			Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT);
			startActivity(new Intent(MTuanLoginActivity.this, MTuanShowThreeActivity.class));
			finish();
		}
	}
}

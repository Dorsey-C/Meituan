package com.xhsc.meituan;



import com.xhsc.meituan.arraylistdata.MerchantTabTwoActivity;
import com.xhsc.meituan.tabfour.TabFourContentActivity;
import com.xhsc.meituan.tabthree.TabThreeActivity;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class MtuanMainActivity extends TabActivity implements OnCheckedChangeListener {
	private RadioGroup mRadioGroup;
	private TabHost mTabHost;
	private static final String TAB_ONE_TAG = "tab1";
	private static final String TAB_TWO_TAG = "tab2";
	private static final String TAB_THREE_TAG = "tab3";
	private static final String TAB_FOUR_TAG = "tab4";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.mtuan_mainactivity_layout);
		mRadioGroup = (RadioGroup) findViewById(R.id.tab_radio_group);
		mTabHost = getTabHost();

		TabSpec tabSpec1 = mTabHost.newTabSpec(TAB_ONE_TAG);
		tabSpec1.setIndicator("团购");
		tabSpec1.setContent(new Intent(this, MtuanFirstTabContentActivity.class));

		TabSpec tabSpec2 = mTabHost.newTabSpec(TAB_TWO_TAG);
		tabSpec2.setIndicator("商家");
		tabSpec2.setContent(new Intent(this, MerchantTabTwoActivity.class));

		TabSpec tabSpec3 = mTabHost.newTabSpec(TAB_THREE_TAG);
		tabSpec3.setIndicator("我的");
		tabSpec3.setContent(new Intent(this, TabThreeActivity.class));

		TabSpec tabSpec4 = mTabHost.newTabSpec(TAB_FOUR_TAG);
		tabSpec4.setIndicator("更多");
		tabSpec4.setContent(new Intent(this, TabFourContentActivity.class));

		mTabHost.addTab(tabSpec1);
		mTabHost.addTab(tabSpec2);
		mTabHost.addTab(tabSpec3);
		mTabHost.addTab(tabSpec4);

		mRadioGroup.setOnCheckedChangeListener(this);

		mTabHost.setOnTabChangedListener(new OnTabChangeListener() {

			@Override
			public void onTabChanged(String tabId) {
				Toast.makeText(MtuanMainActivity.this, "tabId " + tabId, Toast.LENGTH_SHORT);

			}
		});
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {

		switch (checkedId) {
		case R.id.tab_radio_deal_one:
			mTabHost.setCurrentTabByTag(TAB_ONE_TAG);
			break;

		case R.id.tab_radio_poi_two:
			mTabHost.setCurrentTabByTag(TAB_TWO_TAG);
			break;

		case R.id.tab_radio_user_three:
			mTabHost.setCurrentTabByTag(TAB_THREE_TAG);
			break;
		
		case R.id.tab_radio_more_four:
			mTabHost.setCurrentTabByTag(TAB_FOUR_TAG);
			break;
		default:
			break;
		}
		
	}
}

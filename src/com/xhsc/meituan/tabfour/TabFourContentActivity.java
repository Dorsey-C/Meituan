package com.xhsc.meituan.tabfour;

import com.xhsc.meituan.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class TabFourContentActivity extends Activity{

	ListView mlistViewOne,mListViewTwo ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_four_content_more_layout);
		mlistViewOne = (ListView)findViewById(R.id.tab_four_content_listview_one);
		TabFourListViewAdapter adapterOne = new TabFourListViewAdapter(this);
		mlistViewOne.setAdapter(adapterOne);
		TabFourInfoData data1 = new TabFourInfoData();
		adapterOne.setArrayList(data1.getArrayListDataOne());
		
		mListViewTwo = (ListView)findViewById(R.id.tab_four_content_listview_two);
		
		TabFourListViewAdapter adapterTwo = new TabFourListViewAdapter(this);
		mListViewTwo.setAdapter(adapterTwo);
		
		TabFourInfoData data2 = new TabFourInfoData();
		adapterTwo.setArrayList(data2.getArrayListDataTwo());
		
		
	
	}
}

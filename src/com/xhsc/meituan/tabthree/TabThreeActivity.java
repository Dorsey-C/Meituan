package com.xhsc.meituan.tabthree;

import com.xhsc.meituan.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class TabThreeActivity extends Activity {

	ListView mListViewOne,mListViewTwo,mListViewThree;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.tab_three_content_my_layout);
		TabThreeInfoData data1 = new TabThreeInfoData();
		mListViewOne = (ListView )findViewById(R.id.tab_threeitem_order_listview);
		TabThreeListViewAdapter adapterOne = new TabThreeListViewAdapter(this);
		mListViewOne.setAdapter(adapterOne);
		Log.v("tag", "data1.getArrayListDataOne()---->"+data1.getArrayListDataOne());
		adapterOne.setArrayList(data1.getArrayListDataOne());
		
		mListViewTwo = (ListView)findViewById(R.id.tab_threeitem_dividelistview);
		TabThreeInfoData data2 = new TabThreeInfoData();
		TabThreeListViewAdapter adapterTwo = new TabThreeListViewAdapter(this);
		mListViewOne.setAdapter(adapterTwo);
		adapterOne.setArrayList(data2.getArrayListDataTwo());
		
		mListViewThree = (ListView)findViewById(R.id.tab_threeitem_listview_three);
		TabThreeInfoData data3 = new TabThreeInfoData();
		TabThreeListViewAdapter adapterThree = new TabThreeListViewAdapter(this);
		mListViewOne.setAdapter(adapterThree);
		adapterOne.setArrayList(data3.getArrayListDataThree());
		
		
	}
}

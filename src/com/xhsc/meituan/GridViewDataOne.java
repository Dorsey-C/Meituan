package com.xhsc.meituan;

import java.util.ArrayList;

public class GridViewDataOne {
	private ArrayList<ViewPagerInfo> data = new ArrayList<ViewPagerInfo>();

	public ArrayList<ViewPagerInfo> getData() {
		return data;
	}

	public void setData(ArrayList<ViewPagerInfo> data) {
		this.data = data;
	}
	
	public ArrayList<ViewPagerInfo> getDataSource(){
		ViewPagerInfo info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_0);
		info.setText("美食");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_1);
		info.setText("电影");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_2);
		info.setText("酒店");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_3);
		info.setText("KTV");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_4);
		info.setText("今日新单");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_5);
		info.setText("优惠买单");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_6);
		info.setText("周边游");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_7);
		info.setText("外卖");
		data.add(info);
		
		return data;
	}
}

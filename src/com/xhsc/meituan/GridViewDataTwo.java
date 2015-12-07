package com.xhsc.meituan;

import java.util.ArrayList;

public class GridViewDataTwo {
	private ArrayList<ViewPagerInfo> data = new ArrayList<ViewPagerInfo>();

	public ArrayList<ViewPagerInfo> getData() {
		return data;
	}

	public void setData(ArrayList<ViewPagerInfo> data) {
		this.data = data;
	}
	
	public ArrayList<ViewPagerInfo> getDataSource(){
		ViewPagerInfo info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_8);
		info.setText("定做蛋糕");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_9);
		info.setText("生活服务");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_10);
		info.setText("休闲娱乐");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_11);
		info.setText("丽人");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_12);
		info.setText("足疗按摩");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_13);
		info.setText("飞机票");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_14);
		info.setText("购物");
		data.add(info);
		
		info = new ViewPagerInfo();
		info.setIcon(R.drawable.ic_category_15);
		info.setText("全部分类");
		data.add(info);
		
		return data;
	}
}

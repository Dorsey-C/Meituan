package com.xhsc.meituan;

import java.util.ArrayList;

public class TabFirstItemInfoData {

	ArrayList<TabFirstItemInfo> arrayData = new ArrayList<TabFirstItemInfo>();

	
	
	public ArrayList<TabFirstItemInfo> getArrayData() {
		return arrayData;
	}
	public void setArrayData(ArrayList<TabFirstItemInfo> arrayData) {
		this.arrayData = arrayData;
	}
	public ArrayList<TabFirstItemInfo> getArrayListViewPagerInfo(){
		TabFirstItemInfo info = new TabFirstItemInfo();
		info.setTxtPrice("1元养生头发SPA");
		info.setTxtExplain("新用户专享");
		info.setIcon(R.drawable.ziguiyangsheng);
		arrayData.add(info);
		
		info = new TabFirstItemInfo();
		info.setTxtPrice("9.9元爱丽丝美甲");
		info.setTxtExplain("5周年店庆");
		info.setIcon(R.drawable.ailisimeijia);
		arrayData.add(info);
		
		info = new TabFirstItemInfo();
		info.setTxtPrice("3元竞成葡萄园");
		info.setTxtExplain("庆祝抗战胜利");
		info.setIcon(R.drawable.jinchengpatao);
		arrayData.add(info);
		
		info = new TabFirstItemInfo();
		info.setTxtPrice("0.02元冰雪嘉年华");
		info.setTxtExplain("2015冰雪节");
		info.setIcon(R.drawable.huarunbingxue);
		arrayData.add(info);
		
		info = new TabFirstItemInfo();
		info.setTxtPrice("9.9元太平洋电影城");
		info.setTxtExplain("店庆回馈");
		info.setIcon(R.drawable.taipingyang);
		arrayData.add(info);
		
		info = new TabFirstItemInfo();
		info.setTxtPrice("9.9元德西尔珠宝");
		info.setTxtExplain("开业让利");
		info.setIcon(R.drawable.dexierzhubao);
		arrayData.add(info);
		
		info = new TabFirstItemInfo();
		info.setTxtPrice("4.9元韩国吉事果");
		info.setTxtExplain("店庆回馈");
		info.setIcon(R.drawable.hanguojishiguo);
		arrayData.add(info);
		
		info = new TabFirstItemInfo();
		info.setTxtPrice("9.9元尚品蛋糕");
		info.setTxtExplain("Vip超值享受");
		info.setIcon(R.drawable.dangao);
		arrayData.add(info);
		
		return arrayData;
	}
}

package com.xhsc.meituan.tabthree;

import java.util.ArrayList;

import com.xhsc.meituan.R;

public class TabThreeInfoData {

	ArrayList<TabThreeInfo> arrayList = new ArrayList<TabThreeInfo>();

	public ArrayList<TabThreeInfo> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<TabThreeInfo> arrayList) {
		this.arrayList = arrayList;
	}

	public ArrayList<TabThreeInfo> getArrayListDataOne() {
		TabThreeInfo info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_group_order_enable);
		info.setLogoNameText("团购订单");
		info.setLogoContentText("1");
		info.setLogoExplainText("1");
		info.setIconSwitch(0);
		arrayList.add(info);

		info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_reserve_order_enable);
		info.setLogoNameText("预定订单");
		info.setLogoContentText("电影选座、酒店预订、KTV预定");
		info.setLogoExplainText("1");
		info.setIconSwitch(0);
		arrayList.add(info);

		info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_menu_apollo_off);
		info.setLogoNameText("上门订单");
		info.setLogoContentText("1");
		info.setLogoExplainText("1");
		info.setIconSwitch(0);
		arrayList.add(info);

		return arrayList;
	}
	
	public ArrayList<TabThreeInfo> getArrayListDataTwo() {
		TabThreeInfo info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_global_user_wallet);
		info.setLogoNameText("我的钱包");
		info.setLogoContentText("1");
		info.setLogoExplainText("1");
		info.setIconSwitch(1);
		arrayList.add(info);

		info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_user_main_comment);
		info.setLogoNameText("我的评价");
		info.setLogoContentText("1");
		info.setLogoExplainText("查看我的评价足迹");
		info.setIconSwitch(1);
		arrayList.add(info);

		info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_order_account_recommend_enable);
		info.setLogoNameText("每日推荐");
		info.setLogoContentText("1");
		info.setLogoExplainText("1");
		info.setIconSwitch(1);
		arrayList.add(info);

		return arrayList;
	}
	public ArrayList<TabThreeInfo> getArrayListDataThree() {
		TabThreeInfo info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_point);
		info.setLogoNameText("积分商城");
		info.setLogoContentText("1");
		info.setLogoExplainText("1");
		info.setIconSwitch(1);
		arrayList.add(info);
		
		info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_order_lottery_enable);
		info.setLogoNameText("我的抽奖");
		info.setLogoContentText("1");
		info.setLogoExplainText("1");
		info.setIconSwitch(0);
		arrayList.add(info);
		
		info = new TabThreeInfo();
		info.setIconLogo(R.drawable.ic_order_voucher_enabled);
		info.setLogoNameText("我的抵用券");
		info.setLogoContentText("1");
		info.setLogoExplainText("1");
		info.setIconSwitch(0);
		arrayList.add(info);
		
		return arrayList;
	}
}

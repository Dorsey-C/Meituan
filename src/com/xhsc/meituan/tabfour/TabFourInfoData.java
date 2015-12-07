package com.xhsc.meituan.tabfour;

import java.util.ArrayList;

import com.xhsc.meituan.R;

public class TabFourInfoData {

	public ArrayList<TabFourInfo> arrayList = new ArrayList<TabFourInfo>();

	public ArrayList<TabFourInfo> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<TabFourInfo> arrayList) {
		this.arrayList = arrayList;
	}
	
	public ArrayList<TabFourInfo> getArrayListDataOne(){
		TabFourInfo info = new TabFourInfo();
		info.setName("消息提醒");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("非wifi下使用省流量模式");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("分享设置");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("邀请好友使用美团");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("字号大小");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("中字号（默认）");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("清空缓存");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("8,066K");
		arrayList.add(info);
		
		return arrayList;
	}
	public ArrayList<TabFourInfo> getArrayListDataTwo(){
		TabFourInfo info = new TabFourInfo();
		info.setName("扫一扫");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("意见反馈");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("支付帮助");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("检查更新");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("当前版本 6.0.1-b301");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("关于美团");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("加入我们");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		info = new TabFourInfo();
		info.setName("诊断网络");
		info.setImgIcon(R.drawable.ic_listitem_arrow_right);
		info.setExplain("");
		arrayList.add(info);
		
		return arrayList;
	}
}

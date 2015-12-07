package com.xhsc.meituan;

import java.util.ArrayList;

public class PanicBuyingGridViewData {
	private ArrayList<PanicBuyingGridviewInfo> lisData = new ArrayList<PanicBuyingGridviewInfo>();

	public ArrayList<PanicBuyingGridviewInfo> getLisData() {
		return lisData;
	}

	public void setLisData(ArrayList<PanicBuyingGridviewInfo> lisData) {
		this.lisData = lisData;
	}
	
	public ArrayList<PanicBuyingGridviewInfo> getDataPanicBuyingGridviewInfo(){
		PanicBuyingGridviewInfo info = new PanicBuyingGridviewInfo();
		info.setIcon(R.drawable.kaojiang);
		info.setShopName("烤匠");
		info.setNowPrice("88");
		info.setOldPrice("100");
		lisData.add(info);
		
		info = new PanicBuyingGridviewInfo();
		info.setIcon(R.drawable.yaomaxunniupaihaixianzizhu);
		info.setShopName("亚马逊牛排海鲜自助");
		info.setNowPrice("78");
		info.setOldPrice("138");
		lisData.add(info);
		
		info = new PanicBuyingGridviewInfo();
		info.setIcon(R.drawable.zunpinniupai);
		info.setShopName("尊品牛排");
		info.setNowPrice("59");
		info.setOldPrice("69");
		lisData.add(info);
		
		return lisData;
	}
}

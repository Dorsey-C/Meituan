package com.xhsc.meituan.tabone.listview;

import java.util.ArrayList;

import com.xhsc.meituan.R;

public class ListViewInfoData {

	ArrayList<ListViewInfo> arrayList = new ArrayList<ListViewInfo>();

	public ArrayList<ListViewInfo> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<ListViewInfo> arrayList) {
		this.arrayList = arrayList;
	}

	public  ArrayList<ListViewInfo> getArrayListViewInfo(){
		ListViewInfo info = new ListViewInfo();
		info.setIcon(R.drawable.jiwei);
		info.setTitle("【合江亭】卡里奥西餐鸡尾餐吧");
		info.setContent("仅售98元！价值401元的2人套餐，提供免费WiFi。");
		info.setNowPrice("98元");
		info.setOldPrice("401元");
		info.setScore("4.2分(16人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.feichangbuke);
		info.setTitle("【双流县】非肠不可");
		info.setContent("仅售0.8元！最高价值3元的长沙专供特色2选1，可免费使用包间，提供免费WiFi。");
		info.setNowPrice("0.8元");
		info.setOldPrice("3元");
		info.setScore("4.8分(44人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.niupaihaixian);
		info.setTitle("【优品道】牛排海鲜");
		info.setContent("仅售82元！价值89元的澳洲T骨牛排自助，提供免费WiFi。");
		info.setNowPrice("82元");
		info.setOldPrice("89元");
		info.setScore("4分(39人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.yibagu);
		info.setTitle("【2店通用】一把骨");
		info.setContent("仅售79元！价值100元的代金券1张,提供免费WiFi。");
		info.setNowPrice("79元");
		info.setOldPrice("100元");
		info.setScore("4.5分(66人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.matougushi);
		info.setTitle("【7店通用】码头故事");
		info.setContent("仅售78元！价值100元的代金券1张，提供免费WiFi。");
		info.setNowPrice("78元");
		info.setOldPrice("100元");
		info.setScore("3.4分(278人评价)");
		
		arrayList.add(info);
		info = new ListViewInfo();
		info.setIcon(R.drawable.huangjimenguo);
		info.setTitle("【12店通用】黄记煌三汁焖锅");
		info.setContent("仅售85.9元！价值100元的代金券1张，提供免费WiFi。");
		info.setNowPrice("85.9元");
		info.setOldPrice("100元");
		info.setScore("3.7分(17181人评价)");
		
		arrayList.add(info);
		info = new ListViewInfo();
		info.setIcon(R.drawable.yiyangcishen);
		info.setTitle("【7店通用】一洋刺身");
		info.setContent("仅售79.9元！价值100元的代金券1张，提供免费WiFi。");
		info.setNowPrice("79.9元");
		info.setOldPrice("100元");
		info.setScore("3.4分(3552人评价)");
		arrayList.add(info);
		
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.zuishaodao);
		info.setTitle("【天府广场】醉烧刀海鲜烤肉");
		info.setContent("仅售58元！价值88元的醉烧刀自助海鲜烤肉餐厅，提供免费WiFi。");
		info.setNowPrice("58元");
		info.setOldPrice("88元");
		info.setScore("3.6分(12212人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.nanguobbq);
		info.setTitle("【西南交大】南国BBQ烤肉");
		info.setContent("仅售59元！价值78元的晚餐，提供免费WiFi。");
		info.setNowPrice("59元");
		info.setOldPrice("78元");
		info.setScore("3.6分(668人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.houniaokafei);
		info.setTitle("【双流机场】候鸟咖啡");
		info.setContent("仅售98元！最高价值356元的畅享牛排2人餐，提供免费WiFi");
		info.setNowPrice("98元");
		info.setOldPrice("356元");
		info.setScore("4.2分(2203人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.mandangdangkaoyu);
		info.setTitle("【4店通用】满当当原炭烤鱼");
		info.setContent("仅售88元！价值100元的代金券1张，全场通用，可叠加使用，提供免费WiFi。");
		info.setNowPrice("88元");
		info.setOldPrice("100元");
		info.setScore("3.6分(6033人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.yinzuojiulou);
		info.setTitle("【天缘路】银座酒楼");
		info.setContent("仅售598元！价值1153元的10人餐，提供免费WiFi。");
		info.setNowPrice("598元");
		info.setOldPrice("1153元");
		info.setScore("3.9分(196人评价)");
		arrayList.add(info);
		
		info = new ListViewInfo();
		info.setIcon(R.drawable.babalaochaifang);
		info.setTitle("【双流机场】坝坝老柴房");
		info.setContent("坝坝老柴房，特色柴火鸡、特色柴火烧羊肉，乡村风味！提供免费WiFi。");
		info.setNowPrice("168元");
		info.setOldPrice("268元");
		info.setScore("4.4分(496人评价)");
		arrayList.add(info);
		
		return arrayList;
	}
}

package com.xhsc.meituan;

import java.util.ArrayList;

import com.xhsc.meituan.DealOfViewPagerBaseAdapter.ViewHodler;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DealOfPanicBuyingBaseAdapter extends BaseAdapter {

	ArrayList<PanicBuyingGridviewInfo> lisData = new ArrayList<PanicBuyingGridviewInfo>();
	LayoutInflater layoutInflater;
	public DealOfPanicBuyingBaseAdapter(Context context) {
		this.layoutInflater = LayoutInflater.from(context);
	}
	
	public void setLisData(ArrayList<PanicBuyingGridviewInfo> lisData) {
		this.lisData = lisData;
		notifyDataSetChanged();
	}
	@Override
	public int getCount() {
		
		return lisData.size();
	}

	@Override
	public Object getItem(int arg0) {
		
		return lisData.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		View v;
		ViewHodler viewHodler;
		if(arg1 == null){
			v = layoutInflater.inflate(R.layout.deal_panic_buying_relayout_gridview_item_layout, null);
			viewHodler = new ViewHodler();
			viewHodler.imagIcon =(ImageView)v.findViewById(R.id.panic_buying_gridview_item_imageview);
			viewHodler.shopNameText =(TextView)v.findViewById(R.id.panic_buying_gridview_item_shopname);
			viewHodler.nowPriceText =(TextView)v.findViewById(R.id.panic_buying_gridview_item_pricenow);
			viewHodler.oldPriceText =(TextView)v.findViewById(R.id.panic_buying_gridview_item_oldprice);
			v.setTag(viewHodler);
		}else{
			v = arg1;
			viewHodler = (ViewHodler)v.getTag();
		}
		PanicBuyingGridviewInfo info = (PanicBuyingGridviewInfo)getItem(arg0);
		viewHodler.imagIcon.setBackgroundResource(info.getIcon());//setImageResource(info.getIcon());
		viewHodler.shopNameText.setText(info.getShopName());
		viewHodler.nowPriceText.setText(info.getNowPrice());
		viewHodler.oldPriceText.setText(info.getOldPrice());
		viewHodler.oldPriceText.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
		
		
		return v;
	}

	class ViewHodler{
		ImageView imagIcon;
		TextView shopNameText;
		TextView nowPriceText;
		TextView oldPriceText;
	}
}

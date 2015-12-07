package com.xhsc.meituan.arraylistdata;

import java.util.ArrayList;

import com.xhsc.meituan.R;
import com.xhsc.meituan.R.drawable;
import com.xhsc.meituan.tabone.listview.ListViewInfo;


import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MerChantBaseAdapter extends BaseAdapter{

	ArrayList<Merchant> arrayList = new ArrayList<Merchant>();

	LayoutInflater layoutInflater;

	public MerChantBaseAdapter(Context context) {

		this.layoutInflater = LayoutInflater.from(context);
	}

	public void setListData(ArrayList<Merchant> arrayList) {
		this.arrayList = arrayList;
		notifyDataSetChanged();
	}

	@Override
	public int getCount() {

		return arrayList.size();
	}

	@Override
	public Object getItem(int position) {

		return arrayList.get(position);
	}

	@Override
	public long getItemId(int position) {

		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v;
		ViewHodler viewHodler;
		if (convertView == null) {
			v = layoutInflater.inflate(R.layout.tab_one_listview_item_layout, null);
			viewHodler = new ViewHodler();
			viewHodler.iconImg = (ImageView) v.findViewById(R.id.meituan_mybaseadapter_item_imageview);
			viewHodler.titleTxt = (TextView) v.findViewById(R.id.meituan_mybaseadapter_item_title);
			viewHodler.contentTxt = (TextView) v.findViewById(R.id.meituan_mybaseadapter_item_content);
			viewHodler.nowPriceTxt = (TextView) v.findViewById(R.id.meituan_mybaseadapter_item_nowprice);
			viewHodler.oldPriceTxt = (TextView) v.findViewById(R.id.meituan_mybaseadapter_item_oldprice);

			viewHodler.score = (TextView) v.findViewById(R.id.meituan_mybaseadapter_item_score);
			v.setTag(viewHodler);

		} else {
			v = convertView;
			viewHodler = (ViewHodler) v.getTag();
		}

		Merchant merchant = (Merchant) getItem(position);
		viewHodler.iconImg.setBackgroundResource(merchant.getIcon());
		viewHodler.titleTxt.setText(merchant.getTitle());
		viewHodler.contentTxt.setText(merchant.getContent());

		viewHodler.nowPriceTxt.setText(merchant.getNowPrice());

		if (merchant.getOldPrice().endsWith("元")){
			viewHodler.oldPriceTxt.setText((String)merchant.getOldPrice());

			viewHodler.oldPriceTxt.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
		}else{
			viewHodler.oldPriceTxt.setBackgroundResource(R.drawable.a3v);//(Integer)mTuan.getOldPrice()
		}

		viewHodler.score.setText(merchant.getScore());

		return v;
	}

	class ViewHodler {
		ImageView iconImg;
		TextView titleTxt;
		TextView contentTxt;
		TextView nowPriceTxt;
		TextView oldPriceTxt;
		TextView score;
	}

}

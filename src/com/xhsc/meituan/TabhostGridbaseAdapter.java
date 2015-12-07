package com.xhsc.meituan;

import java.util.ArrayList;

import com.xhsc.meituan.DealOfViewPagerBaseAdapter.ViewHodler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TabhostGridbaseAdapter extends BaseAdapter {

	ArrayList<TabFirstItemInfo> data = new ArrayList<TabFirstItemInfo>();
	LayoutInflater layoutInflater;
	public TabhostGridbaseAdapter(Context context) {
		this.layoutInflater = LayoutInflater.from(context);
	}
	
	public void setData(ArrayList<TabFirstItemInfo> data) {
		this.data = data;
	
		notifyDataSetChanged();
	}
	@Override
	public int getCount() {
		
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v;
		ViewHodler viewHodler;
		if(convertView == null){
			v = layoutInflater.inflate(R.layout.tabhost_content_item1_gridview_item_layout, null);
			viewHodler = new ViewHodler();
			viewHodler.textViewPrice = (TextView)v.findViewById(R.id.tabhost_contentitem1_gridview_item_textPrice);
			viewHodler.textViewExlpain = (TextView)v.findViewById(R.id.tabhost_contentitem1_gridview_item_textexplain);
			viewHodler.imagIcon= (ImageView)v.findViewById(R.id.tabhost_contentitem1_gridview_item_imageview);
			
			v.setTag(viewHodler);
		}else{
			v = convertView;
			viewHodler = (ViewHodler)v.getTag();
		}
//		TabFirstItemInfo info = new TabFirstItemInfo();这里
		TabFirstItemInfo info = (TabFirstItemInfo) getItem(position);
		viewHodler.textViewPrice.setText(info.getTxtPrice());
		viewHodler.textViewExlpain.setText(info.getTxtExplain());
		viewHodler.imagIcon.setImageResource(info.getIcon());
		
		return v;
		
	}

	class ViewHodler{
		TextView textViewPrice;
		TextView textViewExlpain;
		ImageView imagIcon;
	}
}

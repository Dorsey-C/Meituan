package com.xhsc.meituan;

import java.util.ArrayList;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DealOfViewPagerBaseAdapter extends BaseAdapter {
	ArrayList<ViewPagerInfo> info = new ArrayList<ViewPagerInfo>();
	LayoutInflater layoutInflater;
	public DealOfViewPagerBaseAdapter(Context context) {
		this.layoutInflater = LayoutInflater.from(context);
	}

	public void setData(ArrayList<ViewPagerInfo> info){
		this.info = info;
		notifyDataSetChanged();
	}
	@Override
	public int getCount() {

		return info.size();
	}

	@Override
	public Object getItem(int position) {

		return info.get(position);
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
			v = layoutInflater.inflate(R.layout.mainactivity_tab_content_item1_gridview_item, null);
			viewHodler = new ViewHodler();
			viewHodler.imagIcon = (ImageView)v.findViewById(R.id.gridview_item_imageview);
			viewHodler.textView = (TextView)v.findViewById(R.id.gridview_item_textview);
			v.setTag(viewHodler);
		}else{
			
			v = convertView;
			viewHodler = (ViewHodler) v.getTag();
		}
		ViewPagerInfo info = (ViewPagerInfo)getItem(position);
		viewHodler.imagIcon.setImageResource(info.getIcon());
		viewHodler.textView.setText(info.getText());
		return v;
	}
	
	class ViewHodler{
		ImageView imagIcon;
		TextView textView;
	}
}

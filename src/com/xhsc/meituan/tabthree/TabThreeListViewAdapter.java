package com.xhsc.meituan.tabthree;

import java.util.ArrayList;

import com.xhsc.meituan.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TabThreeListViewAdapter extends BaseAdapter {

	ArrayList<TabThreeInfo> arrayList = new ArrayList<TabThreeInfo>();
	LayoutInflater layoutInflater;

	public TabThreeListViewAdapter(Context context) {
		this.layoutInflater = LayoutInflater.from(context);
	}

	public void setArrayList(ArrayList<TabThreeInfo> arrayList) {
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
			v = layoutInflater.inflate(R.layout.tab_three_listview_item_layout, null);
			viewHodler = new ViewHodler();
			viewHodler.iconLogoImg = (ImageView) v.findViewById(R.id.tab_three_listview_item_imageview_logo);
			viewHodler.logoNameTxt = (TextView) v.findViewById(R.id.tab_three_listview_item_textview_name);
			viewHodler.logoContentTxt = (TextView) v.findViewById(R.id.tab_three_listview_item_textview_explain);
			viewHodler.logoExplainTxt = (TextView) v.findViewById(R.id.tab_three_listview_item_textview_remind);

			viewHodler.iconSwitch = (ImageView) v.findViewById(R.id.ab_three_listview_item_imageview_jump);

			v.setTag(viewHodler);
		} else {
			v = convertView;
			viewHodler = (ViewHodler) v.getTag();
		}

		TabThreeInfo info = (TabThreeInfo)getItem(position);
		viewHodler.iconLogoImg.setImageResource(info.getIconLogo());
		viewHodler.logoNameTxt.setText(info.getLogoNameText());

		if (info.getLogoContentText().startsWith("1")) {
			viewHodler.logoContentTxt.setText("");
		} else {
			viewHodler.logoContentTxt.setText(info.getLogoContentText());
		}
		
		if (info.getLogoExplainText().startsWith("1")) {
			viewHodler.logoExplainTxt.setText("");
		} else {
			viewHodler.logoExplainTxt.setText(info.getLogoExplainText());
		}

		
		if(info.getIconSwitch() == 1){
			viewHodler.iconSwitch.setImageResource(R.drawable.ic_listitem_arrow_right);
			
		}else{viewHodler.iconSwitch.setVisibility(ImageView.GONE);}
		
		return v;
	}

	public class ViewHodler {
		ImageView iconLogoImg;
		TextView logoNameTxt;
		TextView logoContentTxt;
		TextView logoExplainTxt;

		ImageView iconSwitch;
	}
}

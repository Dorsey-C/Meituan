package com.xhsc.meituan.tabfour;

import java.util.ArrayList;

import com.xhsc.meituan.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TabFourListViewAdapter extends BaseAdapter {

	ArrayList<TabFourInfo> arrayList = new ArrayList<TabFourInfo>();
	LayoutInflater layoutInflater;

	public TabFourListViewAdapter(Context context) {
		this.layoutInflater = LayoutInflater.from(context);
	}

	public void setArrayList(ArrayList<TabFourInfo> arrayList) {
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
			v = layoutInflater.inflate(R.layout.tab_four_listview_item_layout, null);
			viewHodler = new ViewHodler();
			
			viewHodler.logoNameTxt = (TextView) v.findViewById(R.id.tab_four_listview_item_textview_name);
			
			viewHodler.logoExplainTxt = (TextView) v.findViewById(R.id.tab_four_listview_item_textview_remind);

			viewHodler.iconSwitch = (ImageView) v.findViewById(R.id.tab_four_listview_item_imageview_jump);

			v.setTag(viewHodler);
		} else {
			v = convertView;
			viewHodler = (ViewHodler) v.getTag();
		}

		TabFourInfo info = (TabFourInfo)getItem(position);
		viewHodler.logoNameTxt.setText(info.getName());
		viewHodler.logoExplainTxt.setText(info.getExplain());
		viewHodler.iconSwitch.setImageResource(info.getImgIcon());
		
		return v;
	}

	public class ViewHodler {
		
		TextView logoNameTxt;
		
		TextView logoExplainTxt;

		ImageView iconSwitch;
	}
}

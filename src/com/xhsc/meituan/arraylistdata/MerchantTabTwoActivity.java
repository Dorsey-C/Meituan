package com.xhsc.meituan.arraylistdata;
import com.xhsc.meituan.R;
import com.xhsc.meituan.R.id;
import com.xhsc.meituan.R.layout;
import com.xhsc.meituan.tabone.listview.ListViewInfoData;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MerchantTabTwoActivity extends Activity {
	private Spinner mOneSpinner, mTwoSpinner, mThreeSpinner, mFourSpinner;

	ListView mListView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.meituan_activity_main);
		mOneSpinner = (Spinner) findViewById(R.id.meituan_spinner1);
		
		mTwoSpinner = (Spinner) findViewById(R.id.meituan_spinner2);
		mThreeSpinner = (Spinner) findViewById(R.id.meituan_spinner3);
		mFourSpinner = (Spinner) findViewById(R.id.meituan_spinner4);
		
		setSpinnerOne();
		setSpinnerTwo();
		setSpinnerThree();
		setSpinnerFour();
		
		mListView = (ListView)findViewById(R.id.meituan_listview);
		MerChantBaseAdapter adapter =new MerChantBaseAdapter(this);
		mListView.setAdapter(adapter);
		MerchantData data = new MerchantData();
		adapter.setListData(data.getArrayMerchant());
		
	}

	public void setSpinnerOne() {

		// 3、设置显示数据源
		String[] spinnerData = { "美食","优惠买单", "代金券", "甜点饮品", "生日蛋糕", "火锅", "自助餐", "小吃快餐" };

		// 4、实例化对应数据源适配器
		/*ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, spinnerData);*/
		SpinnerAdapter adapter = new SpinnerAdapter(this,  
	            android.R.layout.simple_spinner_item, spinnerData);
		// 5、加载适配器
		mOneSpinner.setAdapter(adapter);

		// 6、设置默认显示项
		mOneSpinner.setSelection(0, true);
		

		// 7、设置控件选折监听
		mOneSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MerchantTabTwoActivity.this, "mOneSpinner onItemSelected position " + position,
						Toast.LENGTH_SHORT).show();

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

				Toast.makeText(MerchantTabTwoActivity.this, "onNothingSelected  ", Toast.LENGTH_SHORT).show();
			}
		});

	}
	
	public void setSpinnerTwo() {

		// 3、设置显示数据源
		String[] spinnerData = { "全城","金牛区", "武侯区", "锦江区", "龙泉驿区", "青白江区", "新津县", "双流县"  };

		// 4、实例化对应数据源适配器
		/*ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, spinnerData);*/
		SpinnerAdapter adapter = new SpinnerAdapter(this,  
	            android.R.layout.simple_spinner_item, spinnerData);
		// 5、加载适配器
		mTwoSpinner.setAdapter(adapter);

		// 6、设置默认显示项
		mTwoSpinner.setSelection(0, true);
		

		// 7、设置控件选折监听
		mTwoSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MerchantTabTwoActivity.this, "mTwoSpinner onItemSelected position " + position,
						Toast.LENGTH_SHORT).show();

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

				Toast.makeText(MerchantTabTwoActivity.this, "onNothingSelected  ", Toast.LENGTH_SHORT).show();
			}
		});

	}
	
	public void setSpinnerThree() {

		// 3、设置显示数据源
		String[] spinnerData = {"智能排序","离我最近","好评优先","人气最高" };

		// 4、实例化对应数据源适配器
		/*ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, spinnerData);*/
		SpinnerAdapter adapter = new SpinnerAdapter(this,  
	            android.R.layout.simple_spinner_item, spinnerData);

		// 5、加载适配器
		mThreeSpinner.setAdapter(adapter);

		// 6、设置默认显示项
		mThreeSpinner.setSelection(0, true);
		

		// 7、设置控件选折监听
		mThreeSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MerchantTabTwoActivity.this, "mThreeSpinner onItemSelected position " + position,
						Toast.LENGTH_SHORT).show();

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

				Toast.makeText(MerchantTabTwoActivity.this, "onNothingSelected  ", Toast.LENGTH_SHORT).show();
			}
		});

	}
	
	private class SpinnerAdapter extends ArrayAdapter<String>{
		 Context context;  
		    String[] items = new String[] {};  
		  
		   public SpinnerAdapter(final Context context,  
		            final int textViewResourceId, final String[] objects) {  
		        super(context, textViewResourceId, objects);  
		        this.items = objects;  
		        this.context = context;  
		    }  
		  
		    @Override  
		    public View getDropDownView(int position, View convertView,  
		            ViewGroup parent) {  
		  
		        if (convertView == null) {  
		            LayoutInflater inflater = LayoutInflater.from(context);  
		            convertView = inflater.inflate(  
		                    android.R.layout.simple_spinner_item, parent, false);  
		        }  
		  
		        TextView tv = (TextView) convertView  
		                .findViewById(android.R.id.text1);  
		        tv.setText(items[position]); 
		       tv.setGravity(Gravity.CENTER); 
		       
		        tv.setTextSize(13);
		        tv.setTextColor(getResources().getColor(R.color.hese));
		        return convertView;  
		    }  
		  
		    @Override  
		    public View getView(int position, View convertView, ViewGroup parent) {  
		        if (convertView == null) {  
		            LayoutInflater inflater = LayoutInflater.from(context);  
		            convertView = inflater.inflate(  
		                    android.R.layout.simple_spinner_item, parent, false);  
		        }  
		  
		        // android.R.id.text1 is default text view in resource of the android.   
		        // android.R.layout.simple_spinner_item is default layout in resources of android.   
		  
		        TextView tv = (TextView) convertView  
		                .findViewById(android.R.id.text1);  
		        tv.setText(items[position]); 
		       tv.setGravity(Gravity.CENTER); 
		       
		        tv.setTextSize(12);
		        tv.setTextColor(getResources().getColor(R.color.hese));
		        return convertView;  
		    }  
	}
	
	public void setSpinnerFour() {

		// 3、设置显示数据源
		String[] spinnerData = { "筛选","只看免预约", "节假日可用", "可在线排队", "只看外卖", "优惠买单", "用餐人数"};

		// 4、实例化对应数据源适配器
		/*ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, spinnerData);*/
		SpinnerAdapter adapter = new SpinnerAdapter(this,  
	            android.R.layout.simple_spinner_item, spinnerData); 
		// 5、加载适配器
		mFourSpinner.setAdapter(adapter);

		// 6、设置默认显示项
		mFourSpinner.setSelection(0, true);
		

		// 7、设置控件选折监听
		mFourSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(MerchantTabTwoActivity.this, "mFourSpinner onItemSelected position " + position,
						Toast.LENGTH_SHORT).show();

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {

				Toast.makeText(MerchantTabTwoActivity.this, "onNothingSelected  ", Toast.LENGTH_SHORT).show();
			}
		});

	}
}

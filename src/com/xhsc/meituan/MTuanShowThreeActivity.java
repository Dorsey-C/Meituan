package com.xhsc.meituan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;

import com.xhsc.meituan.Fragmentreplace.FragmentMainActivity;

import java.util.ArrayList;

public class MTuanShowThreeActivity extends Activity {

	private ViewPager mViewPager;

	ImageView mImageView0, mImageView1, mImageView2, mImageView3;
	int oldPosition = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.viewpager_threeactivity_layout);
		mViewPager = (ViewPager) findViewById(R.id.viewpager_layout);
		ArrayList<View> data = new ArrayList<View>();
		mImageView0 = ((ImageView) findViewById(R.id.viewpager_dot0));
		mImageView1 = ((ImageView) findViewById(R.id.viewpager_dot1));
		mImageView2 = ((ImageView) findViewById(R.id.viewpager_dot2));
		mImageView3 = ((ImageView) findViewById(R.id.viewpager_dot3));

		setArraylistView(data);
		/*
		 * inflate是解析布局的，是R.layout而非R.Id不然会出现资源找不到异常 findViewByID（）实例化控件的
		 * 
		 */

		ViewPagerBaseAdapeter adapeter = new ViewPagerBaseAdapeter();
		mViewPager.setAdapter(adapeter);
		adapeter.setData(data);
		// 默认第一个小圆点被选中
		 mImageView0.setImageResource(R.drawable.page);
		// 翻页转变监听
		ViewPagerOnPageChangeListener();
		/*int n = Integer.MAX_VALUE / 2 % data.size();
		int itemPosition = Integer.MAX_VALUE / 2 - n;

		mViewPager.setCurrentItem(itemPosition);*/


	}

	public void ViewPagerOnPageChangeListener() {
		mViewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int arg0) {
				Log.i("tag", "onPageSelected  " + arg0);
				/*
				 * mImgData.get(arg0).setImageResource(R.drawable.page);
				 * mImgData.get(oldPosition).setImageResource(R.drawable.
				 * page_now); oldPosition = arg0;
				 */
				switch (arg0) {
				case 0:
					
					mImageView0.setImageResource(R.drawable.page);
					mImageView1.setImageResource(R.drawable.page_now);
					mImageView2.setImageResource(R.drawable.page_now);
					mImageView3.setImageResource(R.drawable.page_now);
					break;

				case 1:
					mImageView0.setImageResource(R.drawable.page_now);
					mImageView1.setImageResource(R.drawable.page);
					mImageView2.setImageResource(R.drawable.page_now);
					mImageView3.setImageResource(R.drawable.page_now);
					break;

				case 2:
					mImageView0.setImageResource(R.drawable.page_now);
					mImageView1.setImageResource(R.drawable.page_now);
					mImageView2.setImageResource(R.drawable.page);
					mImageView3.setImageResource(R.drawable.page_now);
					break;
				case 3:
					mImageView0.setImageResource(R.drawable.page_now);
					mImageView1.setImageResource(R.drawable.page_now);
					mImageView2.setImageResource(R.drawable.page_now);
					mImageView3.setImageResource(R.drawable.page);
					startMtuanMainActivity();
					finish();
					break;

				default:
					break;
				}
			}

			
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				Log.d("tag", "onPageScrolled  " + arg0);

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				Log.v("tag", "onPageScrollStateChanged  " + arg0);

			}
		});

	}

	
	private void startMtuanMainActivity(){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//				Intent intent = new Intent(MTuanShowThreeActivity.this, MtuanMainActivity.class);
				Intent intent = new Intent(MTuanShowThreeActivity.this, FragmentMainActivity.class);
				startActivity(intent);
				finish();
			}
		}).start();
	}
	/*
	 * public void setArrayListImageView() { mImgData = new
	 * ArrayList<ImageView>(); mImgData.add((ImageView)
	 * findViewById(R.id.viewpager_dot1)); mImgData.add((ImageView)
	 * findViewById(R.id.viewpager_dot2)); mImgData.add((ImageView)
	 * findViewById(R.id.viewpager_dot3)); }
	 */

	public void setArraylistView(ArrayList<View> data) {
		View v0 = LayoutInflater.from(this).inflate(R.layout.viewpager_threeactivity_item0_layout, null);
		data.add(v0);
		View v1 = LayoutInflater.from(this).inflate(R.layout.viewpager_threeactivity_item1_layout, null);
		data.add(v1);
		View v2 = LayoutInflater.from(this).inflate(R.layout.viewpager_threeactivity_item2_layout, null);
		data.add(v2);
		View v3 = LayoutInflater.from(this).inflate(R.layout.viewpager_threeactivity_item3_layout, null);
		data.add(v3);
	}

	public class ViewPagerBaseAdapeter extends PagerAdapter {
		ArrayList<View> data = new ArrayList<View>();

		public void setData(ArrayList<View> data) {
			this.data = data;
			notifyDataSetChanged();
		}

		@Override
		public int getCount() {

			return data.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {

			return arg0 == arg1;
		}

		/**
		 * 重写以下两个方法，一是加载最近几个键面，摧毁前几个打开的键面节约资源
		 */
		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			View v = data.get(position);
			container.addView(v);
			Log.v("tag", "instantiateItem position " + position);
			
			return v;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			View v = data.get(position);
			container.removeView(v);// 这里是remove而不是add方法，否则加载最后一页之后会出现非法描述异常java.lang.IllegalStateException
			Log.v("tag", "destroyItem position " + position);
		}
	}
}

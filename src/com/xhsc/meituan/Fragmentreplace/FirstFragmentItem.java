package com.xhsc.meituan.Fragmentreplace;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import com.xhsc.meituan.DealOfPanicBuyingBaseAdapter;
import com.xhsc.meituan.DealOfViewPagerBaseAdapter;
import com.xhsc.meituan.GridViewDataOne;
import com.xhsc.meituan.GridViewDataTwo;
import com.xhsc.meituan.PanicBuyingGridViewData;
import com.xhsc.meituan.R;
import com.xhsc.meituan.TabFirstItemInfoData;
import com.xhsc.meituan.TabhostGridbaseAdapter;
import com.xhsc.meituan.tabone.listview.ListViewInfoData;
import com.xhsc.meituan.tabone.listview.TabOneListViewBaseAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragmentItem extends Fragment {
    ViewPager mViewPager;
    GridView mGridViewOne,mGridViewTwo,mGridViewPanicBuying,mFirstItemGridView;
    ListView mlistView;
    ImageView mImageView0,mImageView1;

    View view;
    public static FirstFragmentItem newInstance() {

        Bundle args = new Bundle();

        FirstFragmentItem fragment = new FirstFragmentItem();
        fragment.setArguments(args);
        return fragment;
    }
    public FirstFragmentItem() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        getActivity().requestWindowFeature(Window.FEATURE_NO_TITLE);
        view = inflater.inflate(R.layout.fragment_first_fragment_item_layout, container, false);
        mViewPager = (ViewPager)view.findViewById(R.id.tabhost_content1_viewpager_layout);
        mImageView0 = ((ImageView) view.findViewById(R.id.tab_first_viewpager_dot0));
        mImageView1 = ((ImageView) view.findViewById(R.id.tab_first_viewpager_dot1));
        ArrayList<View> data = new ArrayList<View>();
        setArrayListView(data);
        ViewPagerdapter pagerAdapter = new ViewPagerdapter();
        mViewPager.setAdapter(pagerAdapter);
        pagerAdapter.setData(data);
        mImageView0.setImageResource(R.drawable.page);
        ViewPagerOnPageChangeListener();
        setGridViewPanicBuying();

        mFirstItemGridView = (GridView)view.findViewById(R.id.tabhost_content_item1_gridview);
        TabhostGridbaseAdapter tabhostGridbaseAdapter = new TabhostGridbaseAdapter(getActivity());
        mFirstItemGridView.setAdapter(tabhostGridbaseAdapter);
        TabFirstItemInfoData tabFirstItemInfoData = new TabFirstItemInfoData();
        tabhostGridbaseAdapter.setData(tabFirstItemInfoData.getArrayListViewPagerInfo());

        mlistView = (ListView)view.findViewById(R.id.you_like_listview);
        TabOneListViewBaseAdapter listAdapter = new TabOneListViewBaseAdapter(getActivity());
        mlistView.setAdapter(listAdapter);
        ListViewInfoData listData = new ListViewInfoData();
        listAdapter.setListData(listData.getArrayListViewInfo());
        return view;
    }

    public void ViewPagerOnPageChangeListener(){
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                Log.i("tag", "onPageSelected  " + arg0);
                switch (arg0) {
                    case 0:

                        mImageView0.setImageResource(R.drawable.page);
                        mImageView1.setImageResource(R.drawable.page_now);

                        break;

                    case 1:
                        mImageView0.setImageResource(R.drawable.page_now);
                        mImageView1.setImageResource(R.drawable.page);

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

    public void setArrayListView(ArrayList<View> data){
        View v1 = (View) LayoutInflater.from(getContext()).inflate(R.layout.mainactivity_viewpager_item0, null);
        View v2 = (View) LayoutInflater.from(getContext()).inflate(R.layout.mainactivity_viewpager_item1, null);
        mGridViewOne =(GridView)v1.findViewById(R.id.mainactivity_viewpager_item0_grid);
        mGridViewTwo =(GridView)v2.findViewById(R.id.mainactivity_viewpager_item1_grid);
        DealOfViewPagerBaseAdapter adapter1 = new DealOfViewPagerBaseAdapter(getContext());
        DealOfViewPagerBaseAdapter adapter2 = new DealOfViewPagerBaseAdapter(getContext());
        mGridViewOne.setAdapter(adapter1);
        mGridViewTwo.setAdapter(adapter2);
        GridViewDataOne info1 = new GridViewDataOne();
        GridViewDataTwo info2 = new GridViewDataTwo();
        adapter1.setData(info1.getDataSource());
        adapter2.setData(info2.getDataSource());
        data.add(mGridViewOne);
        data.add(mGridViewTwo);

    }

    public void setGridViewPanicBuying(){
        mGridViewPanicBuying = (GridView)view.findViewById(R.id.deal_viewpager_item1_panic_buying_relat_gridview);
        DealOfPanicBuyingBaseAdapter gridViewAdapter = new DealOfPanicBuyingBaseAdapter(getActivity());
        mGridViewPanicBuying.setAdapter(gridViewAdapter);
        PanicBuyingGridViewData gridViewData = new PanicBuyingGridViewData();
        gridViewAdapter.setLisData(gridViewData.getDataPanicBuyingGridviewInfo());
    }

    public class ViewPagerdapter extends PagerAdapter {

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

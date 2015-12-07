package com.xhsc.meituan.Fragmentreplace;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xhsc.meituan.R;

import java.util.ArrayList;

public class FragmentMainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener,ViewPager.OnPageChangeListener {

    RadioGroup mFraRadioGroup;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.fragment_activity__main_layout);
        mFraRadioGroup = (RadioGroup) findViewById(R.id.fragment_tab_radio_group);
        mViewPager = (ViewPager) findViewById(R.id.fragment_viewpager_layout);
        mFraRadioGroup.setOnCheckedChangeListener(this);
        mViewPager.setOnPageChangeListener(this);
        ArrayList<Fragment> data = new ArrayList<Fragment>();
        ininFragmentData(data);
        MyFragmentPagerViewAdatper adatper = new MyFragmentPagerViewAdatper(getSupportFragmentManager());
        mViewPager.setAdapter(adatper);
        adatper.setData(data);


    }
    public void ininFragmentData(ArrayList<Fragment> data) {

        data.add(FirstFragmentItem.newInstance());
        data.add(TwoFragmentItem.newInstance());
        data.add(ThreeFragmentItem.newInstance());
        data.add(FourFragmentItem.newInstance());
    }
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {

        switch (i){
            case R.id.fragment_tab_radio_deal_one:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.fragment_tab_radio_poi_two:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.fragment_tab_radio_user_three:
                mViewPager.setCurrentItem(2);
                break;
            case R.id.fragment_tab_radio_more_four:
                mViewPager.setCurrentItem(3);
                break;
        }
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {

        switch (i){
            case 0:
                ((RadioButton) mFraRadioGroup.getChildAt(0)).toggle();
                break;
            case 1:
                ((RadioButton) mFraRadioGroup.getChildAt(1)).toggle();
                break;
            case 2:
                ((RadioButton) mFraRadioGroup.getChildAt(2)).toggle();
                break;
            case 3:
                ((RadioButton) mFraRadioGroup.getChildAt(3)).toggle();
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
    public class MyFragmentPagerViewAdatper extends FragmentPagerAdapter {

        ArrayList<Fragment> data = new ArrayList<Fragment>();
        public MyFragmentPagerViewAdatper(FragmentManager fm) {
            super(fm);
        }

        public void setData(ArrayList<Fragment> data) {
            this.data = data;
            notifyDataSetChanged();
        }

        @Override
        public Fragment getItem(int i) {
            return data.get(i);
        }

        @Override
        public int getCount() {
            return data.size();
        }
    }
}

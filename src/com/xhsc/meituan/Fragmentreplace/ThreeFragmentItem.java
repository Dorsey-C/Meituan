package com.xhsc.meituan.Fragmentreplace;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.xhsc.meituan.R;
import com.xhsc.meituan.tabthree.TabThreeInfoData;
import com.xhsc.meituan.tabthree.TabThreeListViewAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThreeFragmentItem extends Fragment {
    ListView mListViewOne,mListViewTwo,mListViewThree;
    public static ThreeFragmentItem newInstance() {
        
        Bundle args = new Bundle();
        
        ThreeFragmentItem fragment = new ThreeFragmentItem();
        fragment.setArguments(args);
        return fragment;
    }
    public ThreeFragmentItem() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three_fragment_item_layout, container, false);
        TabThreeInfoData data1 = new TabThreeInfoData();
        mListViewOne = (ListView )view.findViewById(R.id.tab_threeitem_order_listview);
        TabThreeListViewAdapter adapterOne = new TabThreeListViewAdapter(getActivity());
        mListViewOne.setAdapter(adapterOne);
        Log.v("tag", "data1.getArrayListDataOne()---->" + data1.getArrayListDataOne());
        adapterOne.setArrayList(data1.getArrayListDataOne());

        mListViewTwo = (ListView)view.findViewById(R.id.tab_threeitem_dividelistview);
        TabThreeInfoData data2 = new TabThreeInfoData();
        TabThreeListViewAdapter adapterTwo = new TabThreeListViewAdapter(getActivity());
        mListViewOne.setAdapter(adapterTwo);
        adapterOne.setArrayList(data2.getArrayListDataTwo());

        mListViewThree = (ListView)view.findViewById(R.id.tab_threeitem_listview_three);
        TabThreeInfoData data3 = new TabThreeInfoData();
        TabThreeListViewAdapter adapterThree = new TabThreeListViewAdapter(getActivity());
        mListViewOne.setAdapter(adapterThree);
        adapterOne.setArrayList(data3.getArrayListDataThree());
        return view;
    }

}

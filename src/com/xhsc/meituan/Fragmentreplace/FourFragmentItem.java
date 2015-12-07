package com.xhsc.meituan.Fragmentreplace;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.xhsc.meituan.R;
import com.xhsc.meituan.tabfour.TabFourInfoData;
import com.xhsc.meituan.tabfour.TabFourListViewAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class FourFragmentItem extends Fragment {
    ListView mlistViewOne,mListViewTwo ;
    public static FourFragmentItem newInstance() {
        
        Bundle args = new Bundle();
        
        FourFragmentItem fragment = new FourFragmentItem();
        fragment.setArguments(args);
        return fragment;
    }
    public FourFragmentItem() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_four_fragment_item_layout, container, false);
        mlistViewOne = (ListView)view.findViewById(R.id.tab_four_content_listview_one);
        TabFourListViewAdapter adapterOne = new TabFourListViewAdapter(getActivity());
        mlistViewOne.setAdapter(adapterOne);
        TabFourInfoData data1 = new TabFourInfoData();
        adapterOne.setArrayList(data1.getArrayListDataOne());

        mListViewTwo = (ListView)view.findViewById(R.id.tab_four_content_listview_two);

        TabFourListViewAdapter adapterTwo = new TabFourListViewAdapter(getActivity());
        mListViewTwo.setAdapter(adapterTwo);

        TabFourInfoData data2 = new TabFourInfoData();
        adapterTwo.setArrayList(data2.getArrayListDataTwo());
        return view;
    }

}

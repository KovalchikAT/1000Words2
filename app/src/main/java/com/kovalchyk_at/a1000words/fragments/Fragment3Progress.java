package com.kovalchyk_at.a1000words.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.fragments.progress.FragmentProgressAdapter;
import com.kovalchyk_at.a1000words.fragments.progress.FragmentProgressGroup;
import com.kovalchyk_at.a1000words.fragments.progress.FragmentProgressItem;

import java.util.ArrayList;

/**
 * Created by Kovalchyk_at on 10.10.2017.
 */

public class Fragment3Progress extends Fragment {
    private static final String KEY_EXPLIST_STATE = "CURRENT_LIST";
    private static final String KEY_EXPLIST_SCROLL = "CURRENT_SCROLL";
    private static final String KEY_EXPLIST_ITEM = "CURRENT_ITEM";

    ExpandableListView expList;

    private Parcelable expListState = null;
    private int groupPosition = 0;
    private int itemPosition = 0;

    String[] groupsName = new String[] {"HTC", "Samsung", "LG", "jh"};
    String[] phonesHTC = new String[] {"Sensation", "Desire", "Wildfire", "Hero"};
    String[] phonesSams = new String[] {"Galaxy S II", "Galaxy Nexus", "Wave"};
    String[] phonesLG = new String[] {"Optimus", "Optimus Link", "Optimus Black", "Optimus One"};
    String[][] items = new String[][] {phonesHTC,phonesSams,phonesLG,phonesHTC};

    public void fillData (ArrayList<FragmentProgressGroup> groups ){
        for (int i = 0; i< groupsName.length; i++){
            ArrayList<FragmentProgressItem>  it = new ArrayList<FragmentProgressItem>();
            for (int j=0; j<items[i].length; j++){
                it.add(new FragmentProgressItem(items[i][j], (i+j)%100));
            }
            groups.add(new FragmentProgressGroup(groupsName[i], it));
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View retV = inflater.inflate(R.layout.fragment2_library, null);

        expList = (ExpandableListView) retV.findViewById(R.id.expand_progress_list);

        ArrayList<FragmentProgressGroup> mGroups = new ArrayList<FragmentProgressGroup>();

        fillData(mGroups);

        FragmentProgressAdapter mAdapter = new FragmentProgressAdapter(retV.getContext(), mGroups);

        expList.setAdapter(mAdapter);



        Log.d("fragm2TAG", "myLog");
        return retV;
    }

}

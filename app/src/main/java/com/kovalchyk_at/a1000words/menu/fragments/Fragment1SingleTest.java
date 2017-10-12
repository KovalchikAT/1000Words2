package com.kovalchyk_at.a1000words.menu.fragments;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.menu.fragments.singletest.Fragment1Item;
import com.kovalchyk_at.a1000words.menu.fragments.singletest.Fragment1RecyclerViewAdaptter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovalchyk_at on 10.10.2017.
 * Вибір одиничного тесту за темою, та типом завдання
 */

public class Fragment1SingleTest extends Fragment {
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.fragment1_choise_test, null);

        RecyclerView recyclerView = (RecyclerView) retView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        }else{if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        }}
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<Fragment1Item> gaggeredList = getListItemData();

        Fragment1RecyclerViewAdaptter rcAdapter = new Fragment1RecyclerViewAdaptter(retView.getContext(), gaggeredList);
        recyclerView.setAdapter(rcAdapter);

        Log.d("fragm3TAG", "myLog");
        return retView;
    }

    private List<Fragment1Item> getListItemData(){
        List<Fragment1Item> listViewItems = new ArrayList<Fragment1Item>();
        listViewItems.add(new Fragment1Item("Alkane", R.drawable.ic_menu_camera));
        listViewItems.add(new Fragment1Item("Ethane", R.drawable.abc_ic_star_black_36dp));
        listViewItems.add(new Fragment1Item("Alkyne", R.drawable.ic_menu_gallery));
        listViewItems.add(new Fragment1Item("Benzene", R.drawable.ic_start));
        listViewItems.add(new Fragment1Item("Amide", R.drawable.ic_menu_manage));
        listViewItems.add(new Fragment1Item("Amino Acid", R.drawable.abc_ic_star_black_36dp));
        listViewItems.add(new Fragment1Item("Phenol", R.drawable.ic_menu_send));
        listViewItems.add(new Fragment1Item("Carbonxylic", R.drawable.ic_start));
        listViewItems.add(new Fragment1Item("Nitril", R.drawable.ic_menu_share));
        listViewItems.add(new Fragment1Item("Ether", R.drawable.ic_start));
        listViewItems.add(new Fragment1Item("Ester", R.drawable.ic_menu_slideshow));
        listViewItems.add(new Fragment1Item("Alcohol", R.drawable.ic_start));

        return listViewItems;
    }
}

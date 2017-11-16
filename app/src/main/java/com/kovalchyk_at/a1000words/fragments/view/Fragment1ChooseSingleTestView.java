package com.kovalchyk_at.a1000words.fragments.view;

import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.fragments.presenter.Fragment1ChooseSingleTestPresenter;

/**
 * Created by Kovalchyk_at on 31.10.2017.
 */

public class Fragment1ChooseSingleTestView {
    private Fragment1ChooseSingleTestPresenter presenter;
    private View fragment;
    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    public Fragment1ChooseSingleTestView(Fragment1ChooseSingleTestPresenter presenter, View retView) {
        this.presenter = presenter;
        this.fragment = retView;
        initView(presenter, fragment);
    }

    private void initView(Fragment1ChooseSingleTestPresenter presenter, View fragment) {

        recyclerView = (RecyclerView) fragment.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);

        if (fragment.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        }/*else{if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        }}*/

        recyclerView.setLayoutManager(gaggeredGridLayoutManager);
        recyclerView.setAdapter(presenter.getLibraryList());

    }


}

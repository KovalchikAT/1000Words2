package com.kovalchyk_at.a1000words.menu.view;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toolbar;


import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.menu.presenter.MenuPresenterImpl;

/**
 * Created by Kovalchyk_at on 05.10.2017.
 */

public class MenuViewImpl implements MenuView, NavigationView.OnNavigationItemSelectedListener {

    //UI references.
    private MenuPresenterImpl presenter;
    private Activity activity;

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navigationView;
    private FragmentManager fragmentManager;

    public MenuViewImpl(MenuPresenterImpl presenter, Activity activity) {
        this.presenter = presenter;
        this.activity = activity;

        initView(activity, presenter);
        initListeners();
    }

    private void initView(Activity activity, MenuPresenterImpl presenter) {
        // fullscreen mode
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // init views
        toolbar = (Toolbar) activity.findViewById(R.id.toolbar);
        drawer = (DrawerLayout) activity.findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) activity.findViewById(R.id.nav_view);
        fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragment, presenter.getFragment()).commit();
    }

    private void initListeners() {

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}

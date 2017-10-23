package com.kovalchyk_at.a1000words.menu.view;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.menu.presenter.MenuPresenter;
import com.kovalchyk_at.a1000words.menu.presenter.MenuPresenterImpl;

/**
 * Created by Kovalchyk_at on 05.10.2017.
 */

public class MenuViewImpl implements MenuView, NavigationView.OnNavigationItemSelectedListener {

    //UI references.
    private MenuPresenter presenter;
    private Activity activity;

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navigationView;
    private FragmentManager fragmentManager;
    private Fragment fragment;
    private ActionBarDrawerToggle toggle;

    public MenuViewImpl(MenuPresenter presenter, Activity activity) {
        this.presenter = presenter;
        this.activity = activity;

        initView(activity, presenter);
        initListeners();
    }

    private void initView(Activity activity, MenuPresenter presenter) {

        activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // init views
        toolbar = (Toolbar) activity.findViewById(R.id.toolbar);

        drawer = (DrawerLayout) activity.findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(activity, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.syncState();

        navigationView = (NavigationView) activity.findViewById(R.id.nav_view);

        fragment = presenter.getFragment(3);

        fragmentManager = activity.getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit();

    }

    private void initListeners() {
        drawer.addDrawerListener(toggle);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            activity.finish();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.testing_button) {
            fragment = presenter.getFragment(0);
        } else if (id == R.id.single_test_button) {
            fragment = presenter.getFragment(1);
        } else if (id == R.id.library_button) {
            fragment = presenter.getFragment(2);
        } else if (id == R.id.show_progress_button) {
            fragment = presenter.getFragment(3);
        } else if (id == R.id.change_profile_button) {
            fragment = presenter.getFragment(4);
        } else if (id == R.id.nav_share) {
            fragment = presenter.getFragment(5);
        } else if (id == R.id.log_out) {
            fragment = presenter.getFragment(6);
        }

        if (fragment != null) {
            fragmentManager = activity.getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit();

            drawer.closeDrawer(GravityCompat.START);
            return true;
            // update selected item and title, then close the drawer

        } else {
            // error in creating fragment
            Log.e("MainActivity", "Error in creating fragment");
            return false;
        }
    }
}

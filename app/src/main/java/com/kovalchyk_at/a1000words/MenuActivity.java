package com.kovalchyk_at.a1000words;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;

import com.kovalchyk_at.a1000words.menu.presenter.MenuPresenterImpl;
import com.kovalchyk_at.a1000words.menu.view.MenuViewImpl;

public class MenuActivity extends AppCompatActivity {

    Fragment fragment = new Body1_tabbed_fragment();
    private MenuPresenterImpl menuPresenter;
    private MenuViewImpl menuView;
    private Bundle savedInstanceState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedInstanceState = savedInstanceState;
        setContentView(R.layout.activity_menu);

        menuPresenter = new MenuPresenterImpl(this);
        menuView = new MenuViewImpl(menuPresenter, this);
    }

    @Override
    public void onBackPressed() {
        //this.onSaveInstanceState(savedInstanceState);
        menuView.onBackPressed();

    }

}

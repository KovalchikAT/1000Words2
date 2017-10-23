package com.kovalchyk_at.a1000words;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kovalchyk_at.a1000words.menu.presenter.MenuPresenter;
import com.kovalchyk_at.a1000words.menu.presenter.MenuPresenterImpl;
import com.kovalchyk_at.a1000words.menu.view.MenuView;
import com.kovalchyk_at.a1000words.menu.view.MenuViewImpl;

public class MenuActivity extends AppCompatActivity {

    private MenuPresenter menuPresenter;
    private MenuView menuView;
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

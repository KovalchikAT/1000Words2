package com.kovalchyk_at.a1000words.menu.presenter;

import android.app.Fragment;

import com.kovalchyk_at.a1000words.Fragment0StartTeaching;
import com.kovalchyk_at.a1000words.Fragment1ChooseSingleTest;
import com.kovalchyk_at.a1000words.Fragment2Library;
import com.kovalchyk_at.a1000words.Fragment3Progress;
import com.kovalchyk_at.a1000words.MenuActivity;
import com.kovalchyk_at.a1000words.menu.model.MenuModel;

/**
 * Created by Kovalchyk_at on 05.10.2017.
 */

public class MenuPresenterImpl implements MenuPresenter{
    private MenuActivity menuActivitty;
    private MenuModel menuModel;

    public MenuPresenterImpl(MenuModel menuModel, MenuActivity menuActivity) {
        this.menuModel = menuModel;
        this.menuActivitty = menuActivity;
    }

    public Fragment getFragment(int id) {

        switch (id) {
            case 0:
                return new Fragment0StartTeaching();
            case 1:
                return new Fragment1ChooseSingleTest();
            case 2:
                return new Fragment2Library();
            case 3:
                return new Fragment3Progress();
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default://show error
                return null;
        }
        return null;
    }
}

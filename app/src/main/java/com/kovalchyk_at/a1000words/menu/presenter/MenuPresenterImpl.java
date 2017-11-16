package com.kovalchyk_at.a1000words.menu.presenter;

import android.app.Fragment;
import android.os.Bundle;

import com.kovalchyk_at.a1000words.Fragment0StartTeaching;
import com.kovalchyk_at.a1000words.MenuActivity;
import com.kovalchyk_at.a1000words.StartFragment;
import com.kovalchyk_at.a1000words.menu.model.MenuModel;

/**
 * Created by Kovalchyk_at on 05.10.2017.
 */

public class MenuPresenterImpl implements MenuPresenter {
    private MenuActivity menuActivitty;
    private MenuModel menuModel;
    private Bundle b;
    private Fragment fragm;

    public MenuPresenterImpl(MenuModel menuModel, MenuActivity menuActivity) {
        this.menuModel = menuModel;
        this.menuActivitty = menuActivity;
        b = new Bundle();
        b.putParcelable("model", menuModel);

    }

    public Fragment getFragment(int id) {

        switch (id) {
            case 0:
                fragm = new Fragment0StartTeaching();
                fragm.setArguments(b);
                return fragm;
            case 1:
                return null;//new Fragment1ChooseSingleTest();
            case 2:
                return null;//new Fragment2Library();
            case 3:
                return null;//new Fragment3Progress();
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default://show error
                return new StartFragment();
        }
        return null;
    }
}

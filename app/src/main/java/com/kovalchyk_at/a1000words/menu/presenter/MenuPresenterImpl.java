package com.kovalchyk_at.a1000words.menu.presenter;

import android.app.Fragment;

import com.kovalchyk_at.a1000words.Body1_tabbed_fragment;
import com.kovalchyk_at.a1000words.MenuActivity;
import com.kovalchyk_at.a1000words.menu.fragments.Fragment1SingleTest;
import com.kovalchyk_at.a1000words.menu.fragments.Fragment3Progress;

/**
 * Created by Kovalchyk_at on 05.10.2017.
 */

public class MenuPresenterImpl {
   private MenuActivity menuActivitty;

    public MenuPresenterImpl(MenuActivity menuActivity) {
        this.menuActivitty = menuActivity;
    }

    public Fragment getFragment(int id) {

        switch (id) {
            case 0:
                return new Body1_tabbed_fragment();
            case 1:
                return new Fragment1SingleTest();
            case 2:
                break;
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

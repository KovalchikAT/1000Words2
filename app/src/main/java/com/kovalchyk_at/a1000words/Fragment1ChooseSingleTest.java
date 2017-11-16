package com.kovalchyk_at.a1000words;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kovalchyk_at.a1000words.fragments.model.Fragment1ChooseSingleTestModel;
import com.kovalchyk_at.a1000words.fragments.presenter.Fragment1ChooseSingleTestPresenter;
import com.kovalchyk_at.a1000words.fragments.view.Fragment1ChooseSingleTestView;

/**
 * Created by Kovalchyk_at on 10.10.2017.
 * Вибір одиничного тесту за темою, та типом завдання
 */

public class Fragment1ChooseSingleTest extends Fragment {
    //private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private Fragment1ChooseSingleTestPresenter fragment1ChooseSingleTestPresenter;
    private Fragment1ChooseSingleTestView fragment1ChooseSingleTestView;
    private Fragment1ChooseSingleTestModel fragment1ChooseSingleTestModel;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {

        View retView = inflater.inflate(R.layout.fragment1_choise_test, null);

        fragment1ChooseSingleTestModel = new Fragment1ChooseSingleTestModel(retView);
        fragment1ChooseSingleTestPresenter = new Fragment1ChooseSingleTestPresenter(fragment1ChooseSingleTestModel, retView);
        fragment1ChooseSingleTestView = new Fragment1ChooseSingleTestView(fragment1ChooseSingleTestPresenter, retView);

        Log.d("fragm3TAG", "myLog");
        return retView;
    }

}

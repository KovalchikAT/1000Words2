package com.kovalchyk_at.a1000words.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.Test0;
import com.kovalchyk_at.a1000words.fragments.presenter.Fragm0StartTeachingPresenterImpl;
import com.kovalchyk_at.a1000words.fragments.presenter.FragmNPresenter;

/**
 * Created by Kovalchyk_at on 10.10.2017.
 * старт навчального курсу з N питань
 */

public class Fragment0StartTeaching extends Fragment {

    private FragmentManager fragmentManager;
    private Fragment fragment;
    private FragmNPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.fragment0_test_container, null);

        presenter = new Fragm0StartTeachingPresenterImpl(this, fragmentManager);

        fragmentManager = this.getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.tests_fragments, new Test0()).commit();

        return retView;
    }

}

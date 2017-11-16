package com.kovalchyk_at.a1000words;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kovalchyk_at.a1000words.fragments.presenter.Fragm0StartTeachingPresenterImpl;
import com.kovalchyk_at.a1000words.fragments.presenter.FragmNPresenter;
import com.kovalchyk_at.a1000words.fragments.view.Fragm0StartTeachingViewImpl;
import com.kovalchyk_at.a1000words.fragments.view.FragmNView;

/**
 * Created by Kovalchyk_at on 10.10.2017.
 * старт навчального курсу з N питань
 */

public class Fragment0StartTeaching extends Fragment {

    private FragmNPresenter fragmentPresenter;
    private FragmNView fragmentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.fragment0_test_container, null);

        fragmentPresenter = new Fragm0StartTeachingPresenterImpl(this);
        fragmentView = new Fragm0StartTeachingViewImpl(fragmentPresenter, retView);

        return retView;
    }
}

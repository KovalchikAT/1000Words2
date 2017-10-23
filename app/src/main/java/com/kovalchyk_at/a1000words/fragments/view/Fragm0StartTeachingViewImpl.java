package com.kovalchyk_at.a1000words.fragments.view;

import android.app.Fragment;
import android.app.FragmentManager;
import android.view.View;
import android.widget.TextView;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.fragments.presenter.FragmNPresenter;

/**
 * Created by Kovalchyk_at on 19.10.2017.
 */

public class Fragm0StartTeachingViewImpl {
    private FragmNPresenter presenter;
    private View view;

    private TextView allTestCountView;
    private TextView trueAnswerCountView;
    private TextView currentTestCountView;
    private TextView falseAnswerCountView;

    private Fragment content;
    private FragmentManager fragmentManager;



    public Fragm0StartTeachingViewImpl(FragmNPresenter presenter, View view, FragmentManager fragmentManager) {
        this.presenter = presenter;
        this.view = view;
        this.fragmentManager = fragmentManager;
        initView(view);
        initListeners();
    }

    private void initView(View view) {
        allTestCountView = (TextView) view.findViewById(R.id.all_tests_count);
        trueAnswerCountView = (TextView) view.findViewById(R.id.true_answers_count);
        currentTestCountView = (TextView) view.findViewById(R.id.current_tests_count);
        falseAnswerCountView = (TextView) view.findViewById(R.id.false_answers_count);
        fragmentManager.beginTransaction().replace(R.id.tests_fragments, presenter.getTest(0));

    }

    private void initListeners() {
    }

}

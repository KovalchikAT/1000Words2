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

public class Fragm0StartTeachingViewImpl implements FragmNView {
    private FragmNPresenter presenter;
    private View view;

    private TextView testStatTextView;
    private TextView allTestTextView;
    private TextView trueAnswerTextView;
    private TextView currentTestTextView;
    private TextView falseAnswerTextView;

    private TextView allTestCountTextView;
    private TextView trueAnswerCountTextView;
    private TextView currentTestCountTextView;
    private TextView falseAnswerCountTextView;



    private Fragment content;
    private FragmentManager fragmentManager;


    public Fragm0StartTeachingViewImpl(FragmNPresenter presenter, View view) {
        this.presenter = presenter;
        this.view = view;
        this.fragmentManager = presenter.getFragmentManager();
        initView(view);
        initListeners();
    }

    private void initView(View view) {
        //мітки з іменами для лічильників в заголовку
        testStatTextView = (TextView) view.findViewById(R.id.test_stat_lable);
        allTestTextView = (TextView) view.findViewById(R.id.all_tests);
        trueAnswerTextView = (TextView) view.findViewById(R.id.true_answers);
        currentTestTextView = (TextView) view.findViewById(R.id.current_tests);
        falseAnswerTextView = (TextView) view.findViewById(R.id.false_answers);

        //лічильники для заголовка
        allTestCountTextView = (TextView) view.findViewById(R.id.all_tests_count);
        trueAnswerCountTextView = (TextView) view.findViewById(R.id.true_answers_count);
        currentTestCountTextView = (TextView) view.findViewById(R.id.current_tests_count);
        falseAnswerCountTextView = (TextView) view.findViewById(R.id.false_answers_count);

        fragmentManager.beginTransaction().replace(R.id.tests_fragments, presenter.getChildFragment(0)).commit();
    }

    private void initListeners() {
    }

}

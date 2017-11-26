package com.kovalchyk_at.a1000words.tests;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.menu.model.MenuModel;
import com.kovalchyk_at.a1000words.menu.model.Words;


public class Test0 extends Fragment {
    private TextView wordTextView;
    private TextView transcriptionTextView;
    private String trueAnswer;

    private Button answerBtn0;
    private Button answerBtn1;
    private Button answerBtn2;
    private Button answerBtn3;
    private Button answerBtn4;

    private MenuModel model;
    private Bundle b;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.test0_fragment, null);
        Log.d("fragm0TAG", "myLog");
        model = getArguments().getParcelable("model");
        initViews(retView, model.getVokabulary().get(new Integer(1)));

        return retView;
    }

    protected void initViews(View retView, Words word) {
        wordTextView = retView.findViewById(R.id.word_tv);
        transcriptionTextView = retView.findViewById(R.id.transcription_tv);

        answerBtn0 = retView.findViewById(R.id.answer0_btn);
        answerBtn1 = retView.findViewById(R.id.answer1_btn);
        answerBtn2 = retView.findViewById(R.id.answer2_btn);
        answerBtn3 = retView.findViewById(R.id.answer3_btn);
        answerBtn4 = retView.findViewById(R.id.answer4_btn);

        initData(word);
    }

    private void initData(Words word) {
        wordTextView.setText(word.getWord());
        transcriptionTextView.setText("[ " + word.getTranscription() + " ]");

        trueAnswer = model.getVokabulary().get(word.getTranslateIds().get(0/*рандомне значення з масиву перекладів*/)).getWord();

    }

    protected void initListeners() {
        View.OnClickListener myOnClic = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(Color.RED);
            }
        };

        answerBtn0.setOnClickListener(myOnClic);
        answerBtn1.setOnClickListener(myOnClic);
        answerBtn2.setOnClickListener(myOnClic);
        answerBtn3.setOnClickListener(myOnClic);
        answerBtn4.setOnClickListener(myOnClic);
    }

}

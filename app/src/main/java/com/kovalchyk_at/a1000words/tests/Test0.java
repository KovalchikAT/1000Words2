package com.kovalchyk_at.a1000words.tests;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.menu.model.MenuModel;
import com.kovalchyk_at.a1000words.menu.model.Words;

import java.util.Random;


public class Test0 extends Fragment {
    private TextView wordTextView;
    private TextView transcriptionTextView;

    private Words[] answer;
    private Button[] answerBtn;
    private int[] answerCount;

    private MenuModel model;
    private Bundle b;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.test0_fragment, null);
        Log.d("fragm0TAG", "myLog");
        model = getArguments().getParcelable("model");
        initViews(retView);
        b = new Bundle();
        b.putParcelable("model", model);
        return retView;
    }


    protected void initViews(View retView) {
        wordTextView = retView.findViewById(R.id.word_tv);
        transcriptionTextView = retView.findViewById(R.id.transcription_tv);
        answerBtn = new Button[]{retView.findViewById(R.id.answer0_btn),
                retView.findViewById(R.id.answer1_btn),
                retView.findViewById(R.id.answer2_btn),
                retView.findViewById(R.id.answer3_btn),
                retView.findViewById(R.id.answer4_btn)};

        initData();
        initListeners();
    }


    private void initData() {
        Random i = new Random();
        int size = model.getVokabulary().size();
        Words word = model.getVokabulary().get(new Integer(i.nextInt(size)));
        wordTextView.setText(word.getWord());
        transcriptionTextView.setText("[ " + word.getTranscription() + " ]");
        /*                                                                                                                                      Log.e("initData", word.getWord());
                                                                                                                                                Log.e("initData", word.getTranslateIds().toString());*/
        int answerNumber = i.nextInt(word.translateArrSize());/*                                                                     рандомне значення з масиву перекладів*/
        answer = new Words[5];
        answer[0] = model.getVokabulary().get(word.getTranslateIds().get(answerNumber));

        for (int j = 1; j <= 4; j++) {
            do {
                answerNumber = i.nextInt(model.getVokabulary().size());
            }
            while (answerNumber == answer[0].getWordId() || model.getVokabulary().get(answerNumber).getLanguage() != answer[0].getLanguage());
            word = model.getVokabulary().get(answerNumber);
            answer[j] = word;
        }
        answerNumber = i.nextInt(answerBtn.length);
        for (int j = 0; j < answerBtn.length; j++) {
            if (answerNumber < answerBtn.length) {
                answerBtn[j].setText(answer[answerNumber].getWord());
                answerNumber++;
            } else {
                answerNumber = 0;
                answerBtn[j].setText(answer[answerNumber].getWord());
                answerNumber++;
            }
        }
    }

    @NonNull
    private Boolean isTrue(Button btn) {
        answerCount = model.getAnswerCount();
        answerCount[0] =//all test
                answerCount[1]++;//current test
        if (btn.getText() == answer[0].getWord()) {

            answerCount[2]++;//true answ

            model.setAnswerCount(answerCount);
            return true;
        } else {
            answerCount[3]++;//false answ
            model.setAnswerCount(answerCount);
            return false;
        }
    }

    private void initListeners() {
        Button.OnClickListener myOnClick = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragm = new Test0();
                fragm.setArguments(b);
                Log.e("Click", "WTF");
                getFragmentManager().beginTransaction().replace(R.id.tests_fragments, fragm).commit();
            }
        };

        Button.OnTouchListener myOnTouch = new Button.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Button btn = (Button) view;
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if (isTrue(btn)) {
                            btn.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                        } else {
                            btn.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.MULTIPLY);
                        }
                        break;

                    case MotionEvent.ACTION_UP:
                        // clear color filter
                        view.getBackground().clearColorFilter();
                        break;
                }
                return false;
            }
        };

        for (int j = 0; j < answerBtn.length; j++) {
            answerBtn[j].setOnClickListener(myOnClick);
            answerBtn[j].setOnTouchListener(myOnTouch);
        }
    }
}

package com.kovalchyk_at.a1000words.tests;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.kovalchyk_at.a1000words.R;


public class Test1 extends Fragment {
    private TextView wordTextView;
    private TextView transcriptionTextView;

    private Button answerBtn0;
    private Button answerBtn1;
    private Button answerBtn2;
    private Button answerBtn3;
    private Button answerBtn4;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.test0_fragment, null);
        initViews(retView);

        Log.d("fragm0TAG", "myLog");

        return retView;
    }

    protected void initViews(View retView) {
        wordTextView = (TextView) retView.findViewById(R.id.word_tv);
        wordTextView.setText(li);
        transcriptionTextView = (TextView) retView.findViewById(R.id.transcription_tv);

        answerBtn0 = (Button) retView.findViewById(R.id.answer0_btn);
        answerBtn1 = (Button) retView.findViewById(R.id.answer1_btn);
        answerBtn2 = (Button) retView.findViewById(R.id.answer2_btn);
        answerBtn3 = (Button) retView.findViewById(R.id.answer3_btn);
        answerBtn4 = (Button) retView.findViewById(R.id.answer4_btn);
    }

    protected void initListeners() {
        answerBtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}

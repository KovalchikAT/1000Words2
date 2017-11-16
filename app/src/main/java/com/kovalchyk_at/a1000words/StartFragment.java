package com.kovalchyk_at.a1000words;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kovalchyk_at on 16.11.2017.
 */

public class StartFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.start_fragment, null);

        return retView;
    }
}

package com.kovalchyk_at.a1000words.menu.fragments.singletest;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kovalchyk_at.a1000words.R;

/**
 * Created by Kovalchyk_at on 11.10.2017.
 */

public class Fragment1ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    private TextView holderName;
    private ImageView holderImg;

    public TextView getHolderName() {
        return holderName;
    }

    public void setHolderName(TextView holderName) {
        this.holderName = holderName;
    }

    public ImageView getHolderImg() {
        return holderImg;
    }

    public void setHolderImg(ImageView holderImg) {
        this.holderImg = holderImg;
    }

    public Fragment1ViewHolder(View itemView) {
        super(itemView);
        View retV = itemView;
        retV.setOnClickListener(this);

        holderName = (TextView) retV.findViewById(R.id.holder_name);
        holderImg = (ImageView) retV.findViewById(R.id.holder_photo);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked position = "+ getPosition(), Toast.LENGTH_SHORT).show();
    }
}

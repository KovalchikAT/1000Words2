package com.kovalchyk_at.a1000words.fragments.singletest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kovalchyk_at.a1000words.R;

import java.util.List;

/**
 * Created by Kovalchyk_at on 11.10.2017.
 */

public class Fragment1RecyclerViewAdaptter extends RecyclerView.Adapter<Fragment1ViewHolder> {

    private List<Fragment1Item> itemList;
    private Context context;

    public Fragment1RecyclerViewAdaptter(Context context, List<Fragment1Item> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public Fragment1ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment1_test_item, null);
        Fragment1ViewHolder rcv = new Fragment1ViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(Fragment1ViewHolder holder, int position) {
        holder.getHolderName().setText(itemList.get(position).getItemName());
        holder.getHolderImg().setImageResource(itemList.get(position).getItemImg());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}

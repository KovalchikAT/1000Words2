package com.kovalchyk_at.a1000words.fragments.progress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.kovalchyk_at.a1000words.R;

import java.util.ArrayList;

/**
 * Created by Kovalchyk_at on 10.10.2017.
 */

public class FragmentProgressAdapter extends BaseExpandableListAdapter {
    Context mContext;
    LayoutInflater mInflater;

    ArrayList<FragmentProgressGroup> objects;

    public FragmentProgressAdapter(Context context, ArrayList<FragmentProgressGroup> progress_items_group) {
        mContext = context;
        objects = progress_items_group;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getGroupCount() {
        return objects.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return objects.get(i).getItems().size();
    }

    @Override
    public Object getGroup(int i) {
        return objects.get(i);
    }

    @Override
    public Object getChild(int i, int j) {
        return objects.get(i).getItems().get(j);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int j) {
        return j;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int i, boolean isExpanded, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.fragment2_item, null);
        }

        if (isExpanded) {

        } else {

        }

        TextView groupLabel = (TextView) view.findViewById(R.id.item_lable);
        groupLabel.setText(objects.get(i).getGroupCategoryName());
        ProgressBar bar = (ProgressBar) view.findViewById(R.id.item_progress);
        bar.setProgress(objects.get(i).getGroupProgressCount());
        return view;
    }

    @Override
    public View getChildView(int i, int j, boolean isExpanded, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.fragment2_item, null);
        }


        TextView questLabel = (TextView) view.findViewById(R.id.item_lable);
        questLabel.setText(objects.get(i).getItems().get(j).getCategoryName());
        ProgressBar bar = (ProgressBar) view.findViewById(R.id.item_progress);
        bar.setProgress(objects.get(i).getItems().get(j).getProgressCount());

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}

package com.kovalchyk_at.a1000words.fragments.progress;

import java.util.ArrayList;

/**
 * Created by Kovalchyk_at on 10.10.2017.
 */

public class FragmentProgressGroup {
        private String groupCategoryName;
        private int groupProgressCount;
        private ArrayList<FragmentProgressItem> items;

        public FragmentProgressGroup (String _category_name, ArrayList<FragmentProgressItem> it) {
            this.groupCategoryName = _category_name;
            this.groupProgressCount = Sum(it);
            this.items = it;
        }

        private int Sum (ArrayList<FragmentProgressItem> it){
            int sum = 0;
            int i=0;
            for (; i<it.size(); i++) {
                sum += it.get(i).getProgressCount();
            }
            return sum*i%100;
        }

    public ArrayList<FragmentProgressItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<FragmentProgressItem> items) {
        this.items = items;
    }

    public int getGroupProgressCount() {

        return groupProgressCount;
    }

    public void setGroupProgressCount(int groupProgressCount) {
        this.groupProgressCount = groupProgressCount;
    }

    public String getGroupCategoryName() {
        return groupCategoryName;
    }

    public void setGroupCategoryName(String groupCategoryName) {
        this.groupCategoryName = groupCategoryName;
    }
}


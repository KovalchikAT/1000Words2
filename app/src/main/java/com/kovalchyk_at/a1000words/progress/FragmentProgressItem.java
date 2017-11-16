package com.kovalchyk_at.a1000words.progress;

/**
 * Created by Kovalchyk_at on 10.10.2017.
 */

public class FragmentProgressItem {

    private String categoryName;
    private int progressCount;

    public FragmentProgressItem(String categoryName, int progressCount) {
        this.categoryName = categoryName;
        this.progressCount = progressCount;
    }

    public String getCategoryName() {

        return categoryName;
    }

    public void setCategoryName(String categoryName) {

        this.categoryName = categoryName;
    }

    public int getProgressCount() {

        return progressCount;
    }

    public void setProgressCount(int progressCount) {
        this.progressCount = progressCount;
    }
}

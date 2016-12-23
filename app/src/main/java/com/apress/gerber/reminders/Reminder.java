package com.apress.gerber.reminders;

/**
 * Created by Chenzq on 2016-12-23.
 */

public class Reminder {
    private String mId;
    private  String mContent;
    private  int mImportant;

    public Reminder(String content, String id, int important) {
        mContent = content;
        mId = id;
        mImportant = important;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public int getImportant() {
        return mImportant;
    }

    public void setImportant(int important) {
        mImportant = important;
    }
}

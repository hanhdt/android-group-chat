package com.android.ralph.app.androidwebgroupchat.util;

/**
 * This model class defines each chat message where it contains message id,
 * text and a boolean flag (isSelf) to define message owner.
 * Using this boolean flag we’ll align message left or right in the list view.
 *
 * @author Hanh D. TRAN
 * @since Created on 09/11/2014.
 */
public class Message {
    private String fromName;
    private String mssage;
    private Boolean isSelf;

    public Message(String fromName, String mssage, Boolean isSelf) {
        this.fromName = fromName;
        this.mssage = mssage;
        this.isSelf = isSelf;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getMssage() {
        return mssage;
    }

    public void setMssage(String mssage) {
        this.mssage = mssage;
    }

    public Boolean getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }
}

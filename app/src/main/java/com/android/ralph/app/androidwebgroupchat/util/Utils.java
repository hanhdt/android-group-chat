package com.android.ralph.app.androidwebgroupchat.util;

import android.content.Context;
import android.content.SharedPreferences;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ralph on 09/11/2014.
 * This class contains methods to save the user's session id in shared preferences
 */
public class Utils {
    private static final String KEY_SHARED_PREF = "ANDROID_WEB_CHAT";
    private static final int KEY_MODE_PRIVATE = 0;
    private static final String KEY_SESSION_ID = "sessionId";
    private static final String FLAG_MESSAGE = "message";
    private Context context;
    private SharedPreferences sharedPref;

    public Utils(Context context) {
        this.context = context;
        sharedPref = this.context.getSharedPreferences(KEY_SHARED_PREF, KEY_MODE_PRIVATE);

    }

    public void storeSessionId(String sessionId) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(KEY_SESSION_ID, sessionId);
        editor.commit();
    }

    public String getSessionId() {
        return sharedPref.getString(KEY_SESSION_ID, null);
    }

    public String getSendMessageJSON(String message) {
        String json = null;
        try {
            JSONObject jObj = new JSONObject();
            jObj.put("flag", FLAG_MESSAGE);
            jObj.put("sessionId", getSessionId());
            jObj.put("message", message);

            json = jObj.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json;
    }
}

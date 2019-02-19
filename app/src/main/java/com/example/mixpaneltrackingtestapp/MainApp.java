package com.example.mixpaneltrackingtestapp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.mixpanel.android.mpmetrics.MixpanelAPI;

import org.json.JSONException;
import org.json.JSONObject;

public class MainApp extends Application {

    MixpanelAPI mixpanel;

    @Override
    public void onCreate() {
        super.onCreate();

        mixpanel = MixpanelAPI.getInstance(this, "INSERT_TOKEN_HERE");

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                String activityName = activity.getComponentName().getClassName();
                JSONObject jsonObject = new JSONObject();

                try {
                    jsonObject.put("activity name", activityName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mixpanel.track("activity created", jsonObject);
            }

            @Override
            public void onActivityStarted(Activity activity) {
                String activityName = activity.getComponentName().getClassName();
                JSONObject jsonObject = new JSONObject();

                try {
                    jsonObject.put("activity name", activityName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mixpanel.track("activity started", jsonObject);
            }

            @Override
            public void onActivityResumed(Activity activity) {
                String activityName = activity.getComponentName().getClassName();
                JSONObject jsonObject = new JSONObject();

                try {
                    jsonObject.put("activity name", activityName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mixpanel.track("activity resumed", jsonObject);
            }

            @Override
            public void onActivityPaused(Activity activity) {
                String activityName = activity.getComponentName().getClassName();
                JSONObject jsonObject = new JSONObject();

                try {
                    jsonObject.put("activity name", activityName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mixpanel.track("activity paused", jsonObject);
            }

            @Override
            public void onActivityStopped(Activity activity) {
                String activityName = activity.getComponentName().getClassName();
                JSONObject jsonObject = new JSONObject();

                try {
                    jsonObject.put("activity name", activityName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mixpanel.track("activity stopped", jsonObject);
            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                String activityName = activity.getComponentName().getClassName();
                JSONObject jsonObject = new JSONObject();

                try {
                    jsonObject.put("activity name", activityName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mixpanel.track("activity save instance state", jsonObject);
            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                String activityName = activity.getComponentName().getClassName();
                JSONObject jsonObject = new JSONObject();

                try {
                    jsonObject.put("activity name", activityName);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                mixpanel.track("activity destroyed", jsonObject);
            }
        });
    }
}

package com.nasr.onlinechat;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class AppConfiguration extends Application {

    private static AppConfiguration instance = null;

    public static AppConfiguration getInstance() {
        return instance;
    }

    public static Context getContext() {
        return instance;
    }


    public static double LAT = 0;
    public static double LNG = 0;
    public static String ADDRESS = "";

    @Override
    public void onCreate() {
        //MultiDex
        MultiDex.install(getApplicationContext());
        super.onCreate();
        instance = this;
    }

}

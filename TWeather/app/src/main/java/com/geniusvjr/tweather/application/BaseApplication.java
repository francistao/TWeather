package com.geniusvjr.tweather.application;

import android.app.Application;

import com.geniusvjr.tclib.CrashHandler;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by dream on 16/5/14.
 */
public class BaseApplication extends Application{

    private static BaseApplication instance;

    private RefWatcher mRefWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        CrashHandler.getInstance().init(this);
//        DomainInit
    }
}

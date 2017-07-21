package jp.techacademy.ryoichi.gokan.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by houxianliangyi on 2017/07/19.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}

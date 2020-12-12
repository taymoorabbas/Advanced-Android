package com.taytech.advanced1.base;

import android.app.Application;

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder().applicationModule(new ApplicationModule(this))
                .build();

    }
}

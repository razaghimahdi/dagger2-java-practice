package com.example.dagger2_example.view.part10;

import android.app.Application;

import com.example.dagger2_example.di.part10.ApplicationModule;
import com.example.dagger2_example.di.part10.ContactAppComponent;
import com.example.dagger2_example.di.part10.DaggerContactAppComponent;

public class App extends Application {

    private static App app;
    private ContactAppComponent contactAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app=this;

        contactAppComponent= DaggerContactAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }


    public static App getApp() {
        return app;
    }

    public ContactAppComponent getContactAppComponent() {
        return contactAppComponent;
    }
}

package com.example.dagger2_example.view.part09;

import android.app.Application;

import com.example.dagger2_example.model.part09.DaggerSmartPhoneComponent;
import com.example.dagger2_example.model.part09.MemoryCardModule;
import com.example.dagger2_example.model.part09.SmartPhoneComponent;


public class App extends Application {
    private static App app;
    private SmartPhoneComponent smartPhoneComponent;

    public static App getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        smartPhoneComponent = DaggerSmartPhoneComponent.builder()
                .memoryCardModule(new MemoryCardModule(100))
                .build();
    }

    public SmartPhoneComponent getSmartPhoneComponent() {
        return smartPhoneComponent;
    }
}

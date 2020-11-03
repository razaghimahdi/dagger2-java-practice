package com.example.dagger2_example.view.part08;

import android.app.Application;

import com.example.dagger2_example.model.part08.DaggerSmartPhoneComponent;
import com.example.dagger2_example.model.part08.MemoryCardModule;
import com.example.dagger2_example.model.part08.SmartPhoneComponent;


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

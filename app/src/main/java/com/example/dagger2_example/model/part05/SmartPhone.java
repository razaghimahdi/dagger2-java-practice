package com.example.dagger2_example.model.part05;

import android.util.Log;

import javax.inject.Inject;

public class SmartPhone {

    /**We need to create a class which implements the battery interface and provide the dependency through a module*/

    public Battery battery;
    private MemoryCard memoryCard;
    private SIMCard simCard;
    private static final String TAG = "SmartPhone";

    @Inject
    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;
        battery.showType();
    }



    public void setBattery(Battery battery) {
        this.battery = battery;
    }


    public void makeACall(){
        Log.d(TAG, " making a call......... ");
    }
}

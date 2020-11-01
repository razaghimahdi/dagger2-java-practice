package com.example.dagger2_example.model.part03;

import android.util.Log;

import javax.inject.Inject;

public class SmartPhone {


    public Battery battery;
    private MemoryCard memoryCard;
    private SIMCard simCard;
    private static final String TAG = "SmartPhone";

    @Inject/**NOTE: What we just did here is call, Constructor Injection.When you use Dagger2 , it is highly recommended to use constructor injection for every possible scenario.*/
    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;
    }



    public void setBattery(Battery battery) {
        this.battery = battery;
    }


    public void makeACall(){
        Log.d(TAG, " making a call......... ");
    }
}

package com.example.dagger2_example.model.part09;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SmartPhone {

    /**We need to create a class which implements the battery interface and provide the dependency through a module*/

    public Battery battery;
    private MemoryCard memoryCard;
    private SIMCard simCard;
    private static final String TAG = "SmartPhone";
    private String time;

    @Inject
    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;
        battery.showType();

        SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss");
        time=df.format(Calendar.getInstance().getTime());

    }



    public void setBattery(Battery battery) {
        this.battery = battery;
    }


    public void makeACall(){
        Log.d(TAG, " making a call......... ");
        Log.d(TAG, " created time "+time);
    }
}

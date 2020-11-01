package com.example.dagger2_example.model.part01;

import android.util.Log;

public class SmartPhone {/**NOTE: we cannot use SmartPhone without Battery, MemoryCard, SIMCard.so Car is Dependent*/

    public Battery battery;/**NOTE: We can also declare public fields and pass dependencies to those fields.*/
    private MemoryCard memoryCard;
    private SIMCard simCard;
    private static final String TAG = "SmartPhone";

    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        this.battery = battery;/**NOTE: so this is Dependency*/
        this.memoryCard = memoryCard;/**NOTE: so this is Dependency*/
        this.simCard = simCard;/**NOTE: so this is Dependency*/
    }



    public void setBattery(Battery battery) {/**NOTE: you can also pass dependencies using setter methods or other methods of class.*/
        this.battery = battery;
    }


    public void makeACall(){
        Log.d(TAG, " making a call......... ");
    }
}

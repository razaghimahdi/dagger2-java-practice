package com.example.dagger2_example.model.part08;

import android.util.Log;

import javax.inject.Inject;

public class NickelCadmiumBattery implements Battery {

    /**We need to create a class which implements the battery interface and provide the dependency through a module*/
    /**But Dagger does not type cast for dependencies in that way.
     * we have to create a module and provide this dependency as a battery dependency*/

    private static final String TAG = "SmartPhone";

    @Inject
    public NickelCadmiumBattery() {

    }

    @Override
    public void showType() {
        Log.d(TAG, " this is a Nickel Cadmium Battery ");
    }
}

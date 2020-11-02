package com.example.dagger2_example.model.part07;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {
    private static final String TAG = "SmartPhone";

    private int memorySize;
    /** **OLD
     * When we are using the classes we don't own,
     * we cannot open the class and add @Inject annotation to the constructor;
     * For this type of situations we can use modules and write provider methods to provide those dependencies.
     */

    /**
     * *OLD
     *
     * @Module ca have more than one provider methods.
     */


    public MemoryCardModule(int memorySize) {
        this.memorySize = memorySize;
    }


    @Provides
/** **OLD this annotation tells dagger, that this method provides the return data type.*/

        /*static*/ MemoryCard provideMemoryCard() {/** we cannot make this static anymore*/

        /** **OLD we can make this provider method as static.
         if the provider methods of the module does not depend on any instance variable of the module we can make those methods static.
         if your module only has static provide methods, Dagger will never need to instantiate them. So it will improve the performance.*/

        Log.d(TAG, " size of memory card is "+memorySize);
        return new MemoryCard();
    }


}

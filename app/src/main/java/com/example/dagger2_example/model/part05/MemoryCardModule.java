package com.example.dagger2_example.model.part05;

import dagger.Module;
import dagger.Provides;

@Module
public class MemoryCardModule {
    /**
     * When we are using the classes we don't own,
     * we cannot open the class and add @Inject annotation to the constructor;
     * For this type of situations we can use modules and write provider methods to provide those dependencies.
     */

    /**
     * @Module ca have more than one provider methods.
     *
     * */


    @Provides/**this annotation tells dagger, that this method provides the return data type.*/
    static MemoryCard provideMemoryCard(){/**we can make this provider method as static.
     if the provider methods of the module does not depend on any instance variable of the module we can make those methods static.
     if your module only has static provide methods, Dagger will never need to instantiate them. So it will improve the performance.*/
        return new MemoryCard();
    }



}

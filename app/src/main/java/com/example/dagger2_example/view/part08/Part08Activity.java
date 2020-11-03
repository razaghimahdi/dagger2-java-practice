package com.example.dagger2_example.view.part08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.model.part08.DaggerSmartPhoneComponent;
import com.example.dagger2_example.model.part08.MemoryCardModule;
import com.example.dagger2_example.model.part08.SmartPhoneComponent;
import com.example.dagger2_example.model.part08.Battery;
import com.example.dagger2_example.model.part08.SIMCard;
import com.example.dagger2_example.model.part08.SmartPhone;

import javax.inject.Inject;

public class Part08Activity extends AppCompatActivity {

    /**WARNING: To run this activity you may need to make some change ,add this line in manifest android:name=".view.part08.App"*/

    @Inject
    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part08);


        /**Application class is the base class of an Android app.
         * When should we create a custom Application class?
         * If there are tasks that need to run before the creation of the first activity.
         * If there are static immutable data such as a shared network client object.
         * If there are global objects such as data persistence and crash reporting, that need to be shared across all components.
         *
         * */

        App.getApp().getSmartPhoneComponent().inject(this);

         /*SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.builder().
                memoryCardModule(new MemoryCardModule(100))
                .build();
         smartPhoneComponent.inject(this);*/
        smartPhone.makeACall();



    }
}
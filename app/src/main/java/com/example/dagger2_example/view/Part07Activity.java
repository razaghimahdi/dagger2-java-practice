package com.example.dagger2_example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.model.part07.DaggerSmartPhoneComponent;
import com.example.dagger2_example.model.part07.MemoryCardModule;
import com.example.dagger2_example.model.part07.SmartPhoneComponent;
import com.example.dagger2_example.model.part07.Battery;
import com.example.dagger2_example.model.part07.SIMCard;
import com.example.dagger2_example.model.part07.SmartPhone;

import javax.inject.Inject;

public class Part07Activity extends AppCompatActivity {

    @Inject
    SmartPhone smartPhone;

    @Inject
    Battery battery;

    @Inject
    SIMCard simCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part07);

        /**In some situation, we need pass a value to a module.
         * so first step is to create a constructor in the module
         * keeping the variable we wanted to pass as a parameter.
         * and in our activity instead of using create(), we use build()
         * and also we need to initialize the module where passing the value.
         * */

        //SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.builder().
                memoryCardModule(new MemoryCardModule(100))
                .build();
        //smartPhone = smartPhoneComponent.getSmartPhone();
        smartPhoneComponent.inject(this);
        smartPhone.makeACall();
        battery.showType();

    }
}
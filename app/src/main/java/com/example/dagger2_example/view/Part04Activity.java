package com.example.dagger2_example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.model.part04.DaggerSmartPhoneComponent;
import com.example.dagger2_example.model.part04.SmartPhoneComponent;
import com.example.dagger2_example.model.part04.SmartPhone;

public class Part04Activity extends AppCompatActivity {

    /**In some cases we may have interface type as a dependency instead of a class.*/

    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part04);

        /**NOTE: to use this method you need to rebuild project*/
        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        smartPhone = smartPhoneComponent.getSmartPhone();
        smartPhone.makeACall();
    }
}
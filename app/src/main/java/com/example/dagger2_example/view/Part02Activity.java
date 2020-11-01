package com.example.dagger2_example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.model.part02.DaggerSmartPhoneComponent;
import com.example.dagger2_example.model.part02.SmartPhone;
import com.example.dagger2_example.model.part02.SmartPhoneComponent;

public class Part02Activity extends AppCompatActivity {

    SmartPhone smartPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part02);

        /**NOTE: to use this method you need ro rebuild project*/
        SmartPhoneComponent smartPhoneComponent= DaggerSmartPhoneComponent.create();
        smartPhone=smartPhoneComponent.getSmartPhone();
        smartPhone.makeACall();

    }
}
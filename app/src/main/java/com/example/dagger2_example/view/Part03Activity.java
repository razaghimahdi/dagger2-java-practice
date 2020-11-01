package com.example.dagger2_example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.model.part03.DaggerSmartPhoneComponent;
import com.example.dagger2_example.model.part03.SmartPhone;
import com.example.dagger2_example.model.part03.SmartPhoneComponent;

public class Part03Activity extends AppCompatActivity {

    /**When  you are using dagger ypu should go with constructor injection for all classes you own,
     * But what about classes where we cannot access the constructor, like when we are using Retrofit,We build it using its builder method.
     * Or when we can't instantiate the dependency, like a context object.
     * So  when we are using the classes we don't own,
     * we cannot open the class and add @Inject annotation to the constructor;
     * For this type of situations we can use modules and write provider methods to provide those dependencies.
     * */


    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part03);

        /**NOTE: to use this method you need ro rebuild project*/
        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        smartPhone = smartPhoneComponent.getSmartPhone();
        smartPhone.makeACall();
    }
}
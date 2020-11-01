package com.example.dagger2_example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.model.part01.Battery;
import com.example.dagger2_example.model.part01.MemoryCard;
import com.example.dagger2_example.model.part01.SIMCard;
import com.example.dagger2_example.model.part01.ServiceProvider;
import com.example.dagger2_example.model.part01.SmartPhone;

public class Part01Activity extends AppCompatActivity {

    /**So This SmartPhone object has three direct dependencies: Battery, MemoryCard, SIMCard.
     * and SimCard has one dependency :ServiceProvider, which is indirect dependency to the SmartPhone.
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part01);


        Battery battery = new Battery();
        MemoryCard memoryCard = new MemoryCard();

        ServiceProvider serviceProvider = new ServiceProvider();
        SIMCard simCard = new SIMCard(serviceProvider);


        SmartPhone smartPhone = new SmartPhone(battery,memoryCard,simCard);/**NOTE: there are 3 injection types,This  is called constructor injection.*/

        smartPhone.setBattery(battery);/**NOTE: the injection type is called method injection.*/

        smartPhone.battery=battery;/**NOTE: the injection type is called field injection.*/

        smartPhone.makeACall();

    }
}
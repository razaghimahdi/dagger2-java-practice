package com.example.dagger2_example.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.model.part06.Battery;
import com.example.dagger2_example.model.part06.DaggerSmartPhoneComponent;
import com.example.dagger2_example.model.part06.SIMCard;
import com.example.dagger2_example.model.part06.SmartPhoneComponent;
import com.example.dagger2_example.model.part06.SmartPhone;

import javax.inject.Inject;

public class Part06Activity extends AppCompatActivity {


    /**When we are using dagger for a class if we cannot access the constructor,
     * if we cannot annotate the constructor with inject annotation we will not able to get dependencies directly.*/


    @Inject
    SmartPhone smartPhone;

    @Inject
    Battery battery;

    @Inject
    SIMCard simCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part06);

        /**To get the SmartPhone dependency, we have invoked this getSmartPhone method from the mainActivity, we called to that method using the smartPhoneComponent interface.
         * Because we cannot annotate the constructor of the mainActivity. we don't have a constructor here,
         * But this is not the best and most efficient way to do it,
         * there can be many activities and fragments in a project,
         * and there can be many dependencies.
         * for example if you have 10 required dependencies like this SmartPhone dependency,
         * yoy may have to write getter methods for all of them in the component interface,
         * and you have to call them from all activities and fragments in this way,
         * so it becomes more difficult if you have to pass values to those dependencies at runtime.
         * Dagger library does not expect us to write getter methods for dependencies like this.
         * We can just get them injected to th activities or fragments easily using filed injection.
         * */

        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        //smartPhone = smartPhoneComponent.getSmartPhone();
        smartPhoneComponent.inject(this);
        smartPhone.makeACall();
        battery.showType();


    }
}
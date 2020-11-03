package com.example.dagger2_example.view.part09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dagger2_example.R;
import com.example.dagger2_example.model.part09.SmartPhone;
import com.example.dagger2_example.view.part09.App;

import javax.inject.Inject;

public class Part09Activity extends AppCompatActivity {

    /**WARNING: To run this activity you may need to make some change ,add this line in manifest android:name=".view.part09.App"*/

    /** Every time we creates a mainActivity dagger creates a new smart phone object and inject.
     * But in many cases having dependencies as singleton is much efficient,
     * It means dagger creates only one smartphone object as we have annotated it as a singleton.
     * @Singleton makes your class a single instance in your dependencies graph.
     * This instance will be a "singleton" as long as Component object exists
     * */


    @Inject
    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part09);
        Button button=findViewById(R.id.button);


        App.getApp().getSmartPhoneComponent().inject(this);
        smartPhone.makeACall();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Part09Activity.this,Part09_02Activity.class);
                startActivity(intent);
            }
        });
    }
}
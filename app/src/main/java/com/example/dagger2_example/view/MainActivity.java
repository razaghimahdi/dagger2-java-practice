package com.example.dagger2_example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.adapter.AdapterMain;
import com.example.dagger2_example.model.infoMain;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterMain adapterNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        recyclerView = findViewById(R.id.rvMain);
        adapterNav = new AdapterMain(this, getdata());
        recyclerView.setAdapter(adapterNav);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<infoMain> getdata() {
        List<infoMain> data = new ArrayList<>();
        String title[] = {"Part01: Simple SmartPhone","Part02: Simple SmartPhone By Dagger2(@Inject, @Component)",
        "Part03: Simple SmartPhone By Dagger2(@Module, @Provides)","Part04: Simple SmartPhone By Dagger2(interface Part01)",
                "Part05: Simple SmartPhone By Dagger2(interface Part02)"};


        for (int i = 0; i < title.length ; i++) {

            infoMain cur = new infoMain();
            cur.title = title[i];
            data.add(cur);

        }
        return data;

    }

}
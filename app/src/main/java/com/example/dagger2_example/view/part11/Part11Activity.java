package com.example.dagger2_example.view.part11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dagger2_example.R;
import com.example.dagger2_example.adapter.part11.ImageAdapter;
import com.example.dagger2_example.di.part11.AdapterComponent;
import com.example.dagger2_example.di.part11.DaggerAdapterComponent;

import javax.inject.Inject;

public class Part11Activity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Inject
    ImageAdapter adapter;

    @Inject
    GridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part11);
        recyclerView=findViewById(R.id.rv);

        AdapterComponent component = DaggerAdapterComponent.builder().setApplication(getApplication()).setContext(this).builder();
        component.inject(this);

        recyclerView.setLayoutManager(manager);

        recyclerView.setAdapter(adapter);

    }
}
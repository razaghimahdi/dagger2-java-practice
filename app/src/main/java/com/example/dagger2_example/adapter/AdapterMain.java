package com.example.dagger2_example.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.dagger2_example.R;
import com.example.dagger2_example.model.infoMain;
import com.example.dagger2_example.view.Part01Activity;
import com.example.dagger2_example.view.Part02Activity;
import com.example.dagger2_example.view.Part03Activity;

import java.util.Collections;
import java.util.List;


public class AdapterMain extends RecyclerView.Adapter<AdapterMain.ViewHolder> {
    private LayoutInflater inflater;
    List<infoMain> data = Collections.emptyList();
    private Context context;



    public AdapterMain(Context context, List<infoMain> data){
        inflater= LayoutInflater.from(context);
        this.data=data;
        this.context=context;
    }


    @NonNull
    @Override
    public  ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row, parent , false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        infoMain cur = data.get(position);
    holder.title.setText(cur.title);
        //Typeface font = Typeface.createFromAsset(context.getAssets(), "AGhasem.ttf");
       // holder.title.setTypeface(font);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        LinearLayout linear_main_row;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.list_nav_title);
            linear_main_row = itemView.findViewById(R.id.linear_main_row);

            linear_main_row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (getPosition() == 0){
                        Intent intent = new Intent(context, Part01Activity.class);
                        context.startActivity(intent);
                    }
                    if (getPosition() == 1){
                        Intent intent = new Intent(context, Part02Activity.class);
                        context.startActivity(intent);
                    }
                    if (getPosition() == 2){
                        Intent intent = new Intent(context, Part03Activity.class);
                        context.startActivity(intent);
                    }

                }
            });


        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,"This Position" + getPosition(), Toast.LENGTH_SHORT).show();
        }
    }


}

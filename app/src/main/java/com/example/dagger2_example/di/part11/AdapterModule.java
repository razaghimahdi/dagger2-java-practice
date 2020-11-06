package com.example.dagger2_example.di.part11;

import android.app.Application;
import android.content.Context;

import androidx.recyclerview.widget.GridLayoutManager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.dagger2_example.R;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class AdapterModule {

    @Provides
    RequestOptions provideOptions(){
        return  new RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_foreground);
    }

    @Provides
    RequestManager provideManager(RequestOptions requestOptions, Application application){
        return Glide.with(application).setDefaultRequestOptions(requestOptions);
    }

    @Provides
    List<Integer> provideImages(){
        List<Integer> images=new ArrayList<>();
        images.add(R.drawable.img);
        images.add(R.drawable.img2);
        images.add(R.drawable.img3);
        images.add(R.drawable.img4);
        images.add(R.drawable.img);
        images.add(R.drawable.img2);
        images.add(R.drawable.img3);
        images.add(R.drawable.img4);
        images.add(R.drawable.img);
        images.add(R.drawable.img2);
        images.add(R.drawable.img3);
        images.add(R.drawable.img4);


        return images;
    }

    @Provides
    GridLayoutManager provideLayout(Context context){
        return new GridLayoutManager(context,2);
    }


}

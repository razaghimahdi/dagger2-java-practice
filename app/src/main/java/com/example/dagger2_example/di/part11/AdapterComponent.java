package com.example.dagger2_example.di.part11;

import android.app.Application;
import android.content.Context;

import com.example.dagger2_example.adapter.part11.ImageAdapter;
import com.example.dagger2_example.view.part11.Part11Activity;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = AdapterModule.class)
public interface AdapterComponent {

    ImageAdapter buildAdapter();

    void inject(Part11Activity part11Activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder setApplication(Application application);

        @BindsInstance
        Builder setContext(Context context);

        AdapterComponent builder();
    }


}

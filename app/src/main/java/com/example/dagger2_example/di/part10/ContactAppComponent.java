package com.example.dagger2_example.di.part10;

import com.example.dagger2_example.view.part10.Part10Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton/**Since we annotated our dependencies as singletons, so we have to annotate this component interface also as a singleton.*/
@Component(modules = {ApplicationModule.class, RoomModule.class})
public interface ContactAppComponent {

    void inject(Part10Activity part10Activity);

}

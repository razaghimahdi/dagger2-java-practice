package com.example.dagger2_example.model.part07;

import com.example.dagger2_example.view.Part07Activity;

import dagger.Component;

@Component(modules = {MemoryCardModule.class, NCBatterModule.class})
public interface SmartPhoneComponent {


    //SmartPhone getSmartPhone();
    void inject(Part07Activity part07Activity);/**I added an instance of mainActivity as a parameter.
     if if in case you need to use this component in 3 activities and one fragment,
     you may need to write four inject methods here with those activities and fragments as parameter.

     */


}

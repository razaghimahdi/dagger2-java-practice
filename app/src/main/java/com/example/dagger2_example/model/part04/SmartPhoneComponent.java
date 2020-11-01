package com.example.dagger2_example.model.part04;

import dagger.Component;

@Component(modules = {MemoryCardModule.class, NCBatterModule.class})
public interface SmartPhoneComponent {
    /**NOTE: dagger can generate codes to constructor dependencies represented by this dependency graph.
     * To use dagger2 generated codes for dependency injection, we need to use an interface annotated with @Component annotation.
     * */


    SmartPhone getSmartPhone();/**return type of the method should be the type of the dependency you want.*/


}

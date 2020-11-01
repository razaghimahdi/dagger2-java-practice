package com.example.dagger2_example.model.part01;

public class SIMCard {/**Dependent*/

    private ServiceProvider serviceProvider;

    public SIMCard(ServiceProvider serviceProvider) {
        this.serviceProvider=serviceProvider;/**Dependency*/
    }
}

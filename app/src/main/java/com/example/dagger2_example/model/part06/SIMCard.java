package com.example.dagger2_example.model.part06;

import javax.inject.Inject;

public class SIMCard {

    private ServiceProvider serviceProvider;

    @Inject
    public SIMCard(ServiceProvider serviceProvider) {
        this.serviceProvider=serviceProvider;
    }
}

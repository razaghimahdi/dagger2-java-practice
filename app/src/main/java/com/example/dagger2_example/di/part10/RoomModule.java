package com.example.dagger2_example.di.part10;

import android.app.Application;

import androidx.room.Room;

import com.example.dagger2_example.db.ContactsAppDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RoomModule {

    @Provides
    @Singleton
    ContactsAppDatabase provideContactsAppDatabase(Application application){

        return Room.databaseBuilder(application,ContactsAppDatabase.class,"ContactDB").build();
    }


}

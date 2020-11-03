package com.example.dagger2_example.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.dagger2_example.db.entity.Contact;

@Database(entities = {Contact.class},version = 1)
public abstract class ContactsAppDatabase extends RoomDatabase {

    public abstract ContactDAO getContactDAO();

}

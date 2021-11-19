package com.laioffer.tinnews;

import android.app.Application;

import androidx.room.Room;

import com.facebook.stetho.Stetho;
import com.laioffer.tinnews.database.TinNewsDatabase;

//最先被创建出来的进程
public class TinNewsApplication extends Application {
    private static TinNewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        database = Room.databaseBuilder(this, TinNewsDatabase.class, "tinnews_db").build();
    }
    //singleton
    public static TinNewsDatabase getDatabase() {
        return database;
    }
}

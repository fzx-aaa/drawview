package com.example.myapplication;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.util.Log;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class MyService extends Service {
    String TAG = "fzx";
    public MyService() {
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: " + Thread.currentThread());
        Log.d(TAG, "onCreate: " +android.os.Process.myProcessName());
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: "+ Thread.currentThread());
        Log.d(TAG, "onStartCommand: "+android.os.Process.myProcessName());
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: "+ Thread.currentThread());
        super.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.d(TAG, "onConfigurationChanged: "+ Thread.currentThread());
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        Log.d(TAG, "onLowMemory: "+ Thread.currentThread());
        Log.d(TAG, "onLowMemory: "+android.os.Process.myProcessName());
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        Log.d(TAG, "onTrimMemory: "+ Thread.currentThread());
        Log.d(TAG, "onTrimMemory: " +android.os.Process.myProcessName());
        super.onTrimMemory(level);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "onUnbind: "+ Thread.currentThread());
        Log.d(TAG, "onUnbind: " +android.os.Process.myProcessName());
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        Log.d(TAG, "onRebind: "+ Thread.currentThread());
        Log.d(TAG, "onRebind: "+android.os.Process.myProcessName());
        super.onRebind(intent);
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        Log.d(TAG, "onTaskRemoved: "+android.os.Process.myProcessName());
        Log.d(TAG, "onTaskRemoved: "+ Thread.currentThread());
        super.onTaskRemoved(rootIntent);
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(fd, writer, args);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    public void onTimeout(int startId) {
        super.onTimeout(startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: "+ Thread.currentThread());
        Log.d(TAG, "onBind: "+ android.os.Process.myProcessName());
        Log.d(TAG, "onBind: "+intent);
        // TODO: Return the communication channel to the service.
        return null;

    }
}
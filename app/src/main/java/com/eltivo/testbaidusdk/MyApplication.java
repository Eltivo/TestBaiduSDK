package com.eltivo.testbaidusdk;

import android.app.Application;
import android.app.Service;
import android.os.Vibrator;

import com.baidu.mapapi.SDKInitializer;
import com.eltivo.testbaidusdk.Service.LocationService;

public class MyApplication  extends Application {
    public LocationService mLocationService;
    public Vibrator mVibrator;

    @Override
    public void onCreate() {
        super.onCreate();
        mLocationService = new LocationService(getApplicationContext());
        mVibrator =(Vibrator)getApplicationContext().getSystemService(Service.VIBRATOR_SERVICE);
        SDKInitializer.initialize(getApplicationContext());
    }
}

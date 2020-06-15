package com.chamojaya.onlinebankingapplication;

        import android.app.Service;
        import android.content.BroadcastReceiver;
        import android.content.ClipDescription;
        import android.content.Intent;
        import android.content.IntentFilter;
        import android.os.Bundle;
        import android.os.IBinder;
        import android.widget.Toast;

        import androidx.annotation.Nullable;

        import java.util.HashMap;

public class Postmaster extends Service {

    BroadcastReceiver myReceiver = new MyReceiver();

    public Postmaster() {
    }


    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        Bundle mbundle = intent.getExtras();
        Toast.makeText(this, "Postmaster Service Started",
                Toast.LENGTH_LONG).show();
//        String userID = intent.getStringExtra("ID");
//        String Data = intent.getStringExtra("Data");
        return START_STICKY;
    }

//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this, "Postman Service Destroyed",
//                Toast.LENGTH_LONG).show();
//    }


    @Override
    public void onCreate() {



        IntentFilter filter = new IntentFilter();
        filter.addAction("android.intent.action.SMS_RECEIVED");// add any actions you want
        registerReceiver(myReceiver , filter);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (myReceiver != null)
            unregisterReceiver(myReceiver);
    }


}

package com.chamojaya.onlinebankingapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

            String intentAction = intent.getAction();
            String toastMessage= null;
            switch (intentAction){
                     case Intent.ACTION_POWER_CONNECTED:
                            Toast.makeText(context, "Power connected!", Toast.LENGTH_SHORT).show();
                            break;
                     case Intent.ACTION_POWER_DISCONNECTED:
                            Toast.makeText(context, "Power disconnected!", Toast.LENGTH_SHORT).show();
                            break;
            }



        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

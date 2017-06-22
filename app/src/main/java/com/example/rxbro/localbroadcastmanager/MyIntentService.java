package com.example.rxbro.localbroadcastmanager;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import java.util.Date;

/**
 * Created by rxbro on 6/22/2017.
 */

public class MyIntentService extends IntentService {

    public static final String CUSTOM_ACTION = "YOUR_CUSTOM_ACTION";

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        intent = new Intent(CUSTOM_ACTION);
        intent.putExtra("DATE", new Date().toString());
        Log.d(MyIntentService.class.getSimpleName(), "sending broadcast");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);

    }
}

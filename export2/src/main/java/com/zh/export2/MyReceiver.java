package com.zh.export2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_PACKAGE_REMOVED)){
            Log.e("xxxx","intent 监听 卸载");
        }else if (intent.getAction().equals(Intent.ACTION_PACKAGE_INSTALL)){
            Log.e("xxxx","intent 监听 install");
        }else if (intent.getAction().equals(Intent.ACTION_PACKAGE_ADDED)){
            Log.e("xxxx","intent 监听 added");
        }
    }
}

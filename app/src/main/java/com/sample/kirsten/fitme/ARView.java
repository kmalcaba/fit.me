package com.sample.kirsten.fitme;

import com.unity3d.player.UnityPlayerActivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ARView extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        processIntent(mUnityPlayer.currentActivity.getIntent());
    }

    @Override protected void onNewIntent (Intent intent) {
        super.onNewIntent(intent);
        processIntent(intent);
    }

    private void processIntent (Intent intent) {
        String params = "";
        Uri data = intent.getData();
        if(intent != null && data != null) {
            params = data.toString();
            mUnityPlayer.start();
        }
    }
}

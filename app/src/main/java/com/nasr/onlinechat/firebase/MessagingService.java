package com.nasr.onlinechat.firebase;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private static final String TAG = "MessagingService";

    public MessagingService() {

    }

    @Override
    public void onNewToken( String token) {
        super.onNewToken(token);
        Log.d(TAG, "onNewToken: " + token);
        getSharedPreferences("_", MODE_PRIVATE).edit().putString("fb", token).apply();

    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG, "onMessageReceived: " + remoteMessage.getNotification().getBody());
    }


    public static String getToken(Context context) {
        return context.getSharedPreferences("_", MODE_PRIVATE).getString("fb", "empty");
    }
}

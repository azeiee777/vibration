package com.azeiee.vibrator;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

import static android.content.Context.VIBRATOR_SERVICE;

public class VibrateManager {

    Context mContext;

    public VibrateManager(Context mContext) {
        this.mContext = mContext;
    }
    public void vibrate() {
        Vibrator vibrator;
        vibrator =(Vibrator) mContext.getSystemService(VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createOneShot(1000,VibrationEffect.DEFAULT_AMPLITUDE));
        }else{
            vibrator.vibrate(1000);
        }
    }


}

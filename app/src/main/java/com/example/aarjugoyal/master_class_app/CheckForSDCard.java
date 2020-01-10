package com.example.aarjugoyal.master_class_app;

import android.os.Environment;

/**
 * Created by aarjugoyal on 1/10/20.
 */

class CheckForSDCard {
    //Check If SD Card is present or not method
    public boolean isSDCardPresent() {
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            return true;
        }
        return false;
    }
}

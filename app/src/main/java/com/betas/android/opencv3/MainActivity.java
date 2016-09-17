package com.betas.android.opencv3;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    /**
     * A native method that is implemented by the 'native-lib' native opencv3,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' opencv3 on application startup.
    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("opencv_java3");
    }
}

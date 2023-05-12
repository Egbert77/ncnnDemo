package com.cvte.hher;

import android.content.res.AssetManager;
import android.graphics.Bitmap;

public class ChemRecNcnn
{
    public native boolean Init(AssetManager mgr);

    public native String Detect(Bitmap bitmap, boolean use_gpu);

    static {
        System.loadLibrary("chemicalrecognition");
    }
}

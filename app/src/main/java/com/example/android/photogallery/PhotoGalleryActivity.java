package com.example.android.photogallery;

import android.support.v4.app.Fragment;
import android.util.Log;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    private static final String TAG = "PG: PGalleryActivity";

    @Override
    protected Fragment createFragment() {
        Log.d(TAG, "onCreate");
        return PhotoGalleryFragment.newInstance();
    }
}

package com.qwerfghi.criminalintent;

import android.content.Context;

import java.io.File;

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mContext;


    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mContext = context.getApplicationContext();
    }

    public File getPhotoFile(Crime crime) {
        File filesDir = mContext.getFilesDir();
        return new File(filesDir, crime.getPhotoFilename());
    }
}
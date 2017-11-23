package com.qwerfghi.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Павел on 23.11.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
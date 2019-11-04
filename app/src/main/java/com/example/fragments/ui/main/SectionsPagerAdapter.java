package com.example.fragments.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragments.FirstFragment;
import com.example.fragments.R;
import com.example.fragments.SecondFragment;
import com.example.fragments.ThirdFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

//    @StringRes
   // private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1);
        Fragment fragment;
        if(position==0) {
            fragment = new FirstFragment();
        } else if(position==1) {
            fragment = new SecondFragment();
        } else {
            fragment = new ThirdFragment();
        }

        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //return mContext.getResources().getString(TAB_TITLES[position]);
        if(position==0) {
            return "First";
        } else if(position==1) {
            return "Second";
        } else {
            return "Third";
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }
}
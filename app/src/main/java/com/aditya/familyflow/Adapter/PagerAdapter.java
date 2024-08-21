package com.aditya.familyflow.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import com.aditya.familyflow.Fragment.FamilyFragment;
import com.aditya.familyflow.Fragment.GalleryFragment;
import com.aditya.familyflow.Fragment.MessageFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    int numberOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.numberOfTabs = NumOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FamilyFragment();
            case 1:
                return new MessageFragment();
            case 2:
                return new GalleryFragment();
            default:
                return null;
        }
    }



    @Override
    public int getCount() {
        return numberOfTabs;
    }

}

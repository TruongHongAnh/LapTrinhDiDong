package com.example.btviewpage;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new LinearFragment();
            case 1: return new GridFragment();
            case 2: return new StaggeredFragment();
            default: return new LinearFragment();
        }
    }

    @Override
    public int getCount() {
        return 3; // 3 tabs
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Linear";
            case 1: return "Grid";
            case 2: return "Staggered";
            default: return "Tab";
        }
    }
}

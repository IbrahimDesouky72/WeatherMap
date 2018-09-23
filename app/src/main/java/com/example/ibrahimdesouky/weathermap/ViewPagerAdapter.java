package com.example.ibrahimdesouky.weathermap;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IbrahimDesouky on 9/21/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragments = new ArrayList<>();
    private final List<String> fragmentsTitle = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsTitle.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentsTitle.get(position);
    }

    public void addFragment(Fragment fragment , String title){
        fragments.add(fragment);
        fragmentsTitle.add(title);
    }
}

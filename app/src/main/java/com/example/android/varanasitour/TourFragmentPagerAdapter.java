package com.example.android.varanasitour;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    public TourFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }



    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
         return "Temples";
        }else{
            if(position == 1){
                return "Foods";
            }else{
                return "University";
            }
        }
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new TempleFragment();
        }else{
            if(i == 1){
                return  new FoodFragment();
            }else{
                return new UniversityFragment();
            }
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

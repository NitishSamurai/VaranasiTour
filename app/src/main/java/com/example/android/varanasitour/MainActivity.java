package com.example.android.varanasitour;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
         TourFragmentPagerAdapter tourFragmentPagerAdapter = new TourFragmentPagerAdapter(getSupportFragmentManager());

         viewPager.setAdapter(tourFragmentPagerAdapter);
       TabLayout tabLayout = (TabLayout)findViewById(R.id.tab);
        // Add Dependency "android.support.design.widget.TabLayout" to get Tablayout SetUpWithViewpager
        tabLayout.setupWithViewPager(viewPager);
        // Set Icon to each tab
        tabLayout.getTabAt(0).setIcon(R.drawable.om);
        tabLayout.getTabAt(1).setIcon(R.drawable.foood);
        tabLayout.getTabAt(2).setIcon(R.drawable.universityicon);
    }


}

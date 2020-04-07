package com.t.androidca2project.P2;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.t.androidca2project.P5.FragmentOne;
import com.t.androidca2project.P5.ViewPagerAdapter;
import com.t.androidca2project.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements Main1Fragment.SendMessage{

    TabLayout tabLayout;
    ViewPager viewPager;
    FragmentAdapter viewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void sendData(String message) {
        String tag = "android:switcher:" + R.id.viewPager + ":" + 1;
        Main2Fragment f = (Main2Fragment) getSupportFragmentManager().findFragmentByTag(tag);
        f.displayReceivedData(message);
    }
}
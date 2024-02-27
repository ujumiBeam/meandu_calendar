package com.example.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    HomeFragment homeFragment;
    DiaryFragment diaryFragment;
    ContactFragment contactFragment;
    StatisticsFragment statisticsFragment;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homeFragment = new HomeFragment();
        diaryFragment = new DiaryFragment();
        contactFragment = new ContactFragment();
        statisticsFragment = new StatisticsFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.containers, homeFragment).commit();

        NavigationBarView navigationBarView = findViewById(R.id.bottom_navigationview);
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, homeFragment).commit();
                        return true;
                    case R.id.contact:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, contactFragment).commit();
                        return true;
                    case R.id.diary:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, diaryFragment).commit();
                        return true;
                    case R.id.statistics:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, statisticsFragment).commit();
                        return true;
                }
                return false;
            }
        });

    }
}
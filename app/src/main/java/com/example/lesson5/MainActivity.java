package com.example.lesson5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        transaction.replace(R.id.fragment_container, HomeFragment.newInstance("value 1", "value 2")).commit();
                        item.setChecked(true);
                        break;
                    case R.id.nav_list:
                        transaction.replace(R.id.fragment_container, ListFragment.newInstance("value 1", "value 2")).commit();
                        item.setChecked(true);
                        break;
                    case R.id.nav_profil:
                        transaction.replace(R.id.fragment_container, ProfileFragment.newInstance("value 1", "value 2")).commit();
                        item.setChecked(true);
                        break;

                }

                return false;
            }

        });
    }

    }

package com.example.navigationdrawersample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout draw = findViewById(R.id.draw);
        NavigationView navigationView = findViewById(R.id.naviView);
        Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, draw, tool, R.string.OpenDrawer, R.string.CloseDrawer);
        draw.addDrawerListener(toggle);
        


        toggle.syncState();
        AFragment aFragment = new AFragment();
        BFragment bFragment = new BFragment();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.note:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,aFragment).commit();
                       return  true;
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,bFragment).commit();
                        return  true;

                }


                return true;
            }

        });
        getSupportFragmentManager().beginTransaction().replace(R.id.container,aFragment).commit();
    }




    }

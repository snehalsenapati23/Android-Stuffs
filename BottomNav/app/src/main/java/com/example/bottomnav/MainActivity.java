package com.example.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView btnView=findViewById(R.id.bnView);
        AFragment afragment = new AFragment();
        BFragment bfragment = new BFragment();
        CFragment cfragment = new CFragment();
        DFragment dfragment = new DFragment();
        EFragment efragment = new EFragment();
btnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,afragment).commit();
                return true;
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,bfragment).commit();
                return true;
            case R.id.search:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,cfragment).commit();
                return true;
            case R.id.util:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,dfragment).commit();
                return true;
            case R.id.con:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,efragment).commit();
                return true;


        }
        return false;


    }


    });
btnView.setSelectedItemId(R.id.home);
}
}
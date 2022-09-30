package com.prime.drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.sax.StartElementListener;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.menu_Open,R.string.close_menu);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        Log.i("Menu_Drawer_Tag","Home menu was clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.food:
                        Log.i("Menu_Drawer_Tag","food menu was clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.computers:
                        Log.i("Menu_Drawer_Tag","computers menu was clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.print:
                        Log.i("Menu_Drawer_Tag","office menu was clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.logout:
                        Log.i("Menu_Drawer_Tag","logout menu was clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.settings:
                        Log.i("Menu_Drawer_Tag","Settings menu was clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.share:
                        Log.i("Menu_Drawer_Tag","share menu was clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.donate:
                        Log.i("Menu Drawer Tag","Donate menu was clicked");
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                }
                return true;
            }
        });

    }
}
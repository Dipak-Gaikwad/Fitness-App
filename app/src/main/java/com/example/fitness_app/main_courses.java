package com.example.fitness_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.BuildConfig;

import java.text.DateFormat;
import java.util.Calendar;

import Adapters.Pager;

public class main_courses extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, DatePickerDialog.OnDateSetListener {
    //menu
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    //profile
    String dbuser , dbemail , dbgender ;

    //tabs
    ViewPager pager;
    TabLayout mTabLayout;
    TabItem firstItem, secondItem, thirdItem;
    Pager pagerAdapter;

    @SuppressLint({"ResourceType", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.Workout);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //menu
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.menu_view);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        //profile
        dbuser = getIntent().getStringExtra("db_user");
        dbemail = getIntent().getStringExtra("db_email");
        dbgender = getIntent().getStringExtra("db_gender");

        //tabs
        pager = findViewById(R.id.view_page);
        mTabLayout = findViewById(R.id.tab_layout);
        firstItem = findViewById(R.id.beginner);
        secondItem = findViewById(R.id.intermediate);
        thirdItem = findViewById(R.id.advance);

        pagerAdapter = new Pager(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, mTabLayout.getTabCount());
        pager.setAdapter(pagerAdapter);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));

    }

    //menu
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        int id = item.getItemId();

        switch (id)
        {
            case R.id.menu_logout:
                startActivity(new Intent(getApplicationContext(), startPage.class));
                finish();
                break;
            case  R.id.menu_calendar:
                DialogFragment datePicker = new Classes.DatePickerFragmnet();
                datePicker.show(getSupportFragmentManager(), "date picker");
                break;
            case  R.id.menu_profile:
                Intent intent_profile = new Intent(getApplicationContext(), Profile.class);
                intent_profile.putExtra("profile_user", dbuser);
                intent_profile.putExtra("profile_email", dbemail);
                intent_profile.putExtra("profile_gender", dbgender);
                startActivity(intent_profile);
                break;
            case R.id.menu_workout:
                item.setChecked(true);
                break;
            case R.id.menu_about:
                startActivity(new Intent(getApplicationContext(), AboutUs.class));
                break;
            case R.id.menu_alarm:
                startActivity(new Intent(getApplicationContext(), Alarm_man.class));
                break;
            case R.id.menu_timer:
                startActivity(new Intent(getApplicationContext(), timer.class));
                break;
            case R.id.menu_music:
                startActivity(new Intent(getApplicationContext(), Music.class));
                break;
            case R.id.menu_invite:
                try {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Home Workout");
                    String sharemsg = "Home Workout\nhttps://play.google.com/store/apps/details?=en" + BuildConfig.APPLICATION_ID + "\n\n";
                    intent.putExtra(Intent.EXTRA_TEXT, sharemsg);
                    startActivity(Intent.createChooser(intent, "Invite From"));
                } catch (Exception e) {
                    Toast.makeText(this, "Error Occured", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        return true;
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

    }

}
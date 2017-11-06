package com.ravrani_software_developers.studymate;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.download);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String intent_url = "https://parthravrani.github.io/studymate/syllabus/computer%20department/sem1/3300001%20Basic%20Mathematics.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(intent_url));
                startActivity(i);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().findItem(R.id.result).getIcon().setColorFilter(Color.parseColor("#222222"),
                PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.time_table).getIcon().setColorFilter(Color.parseColor("#222222"),
                PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.syllabus).getIcon().setColorFilter(Color.parseColor("#222222"),
                PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.ref_books).getIcon().setColorFilter(Color.parseColor("#222222"),
                PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.official_sites).getIcon().setColorFilter(Color.parseColor("#222222"),
                PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.lyp).getIcon().setColorFilter(Color.parseColor("#222222"),
                PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.req).getIcon().setColorFilter(Color.parseColor("#222222"),
                PorterDuff.Mode.SRC_ATOP);
        navigationView.getMenu().findItem(R.id.feed).getIcon().setColorFilter(Color.parseColor("#222222"),
                PorterDuff.Mode.SRC_ATOP);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.result) {
            String s = "http://result1.gtu.ac.in";
            Intent intent = new Intent(this, Result.class);
            intent.putExtra("url_res",s);
            startActivity(intent);
        }
        else if (id == R.id.time_table){
            Intent intent = new Intent(this, TimeTable.class);
            startActivity(intent);
        }
        else if (id == R.id.syllabus){
            Intent intent = new Intent(this, Syllabus.class);
            startActivity(intent);
        }
        else if (id == R.id.lyp){
            Intent intent = new Intent(this, Lyp.class);
            startActivity(intent);
        }
        else if (id == R.id.req){
            Log.i("Request","");

            String[] TO = {"pmrav007@gmail.com"};
            String[] CC = {""};
            Intent emailIntent = new Intent(Intent.ACTION_SEND);
            emailIntent.setData(Uri.parse("mail to:"));
            emailIntent.setType("text/plain");

            emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
            emailIntent.putExtra(Intent.EXTRA_CC, CC);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Programme or any Question");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Request details");

            try{
                startActivity(Intent.createChooser(emailIntent, "Send Request..."));
                Log.i("Request Mail Send...", "");
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(MainActivity.this, "There is no mailing client or app installed.", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        else if(id == R.id.about_us){
            Intent intent = new Intent(this, About.class);
            startActivity(intent);
        }
        else if(id == R.id.share){
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plan");
            String shareBodyText = "Check the all new StudyMate Android application for diploma CE students. This app contains all study related material and much more stuff...";
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT,"Educational App");
            sharingIntent.putExtra(Intent.EXTRA_TEXT,shareBodyText);
            startActivity(Intent.createChooser(sharingIntent,"Share via..."));
        }
        else if (id == R.id.ref_books){
            Intent intent = new Intent(this, Reference.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

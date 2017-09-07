package com.example.rohankanoo.project_1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.ViewPager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.viewpagerindicator.CirclePageIndicator;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private static final Integer[] IMAGES= {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.five};
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);

        ImageView circularImageView = (ImageView)findViewById(R.id.imageView2);
        circularImageView.setImageBitmap(circularBitmap);*/

        //Creating Button Instances
        Button faucets = (Button) findViewById(R.id.faucets);
        Button sink = (Button) findViewById(R.id.sink);
        Button bath = (Button) findViewById(R.id.bath);
        Button cistern = (Button) findViewById(R.id.cistern);
        Button ptmt = (Button) findViewById(R.id.ptmt);
        Button showers = (Button) findViewById(R.id.showers);
        TextView phone1 = (TextView) findViewById(R.id.phone_text);
        TextView phone2 = (TextView) findViewById(R.id.phone2_text);
        TextView email = (TextView) findViewById(R.id.mail_text);

        faucets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent faucets = new Intent(MainActivity.this,faucets.class);
                startActivity(faucets);
            }
        });

        sink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sink = new Intent(MainActivity.this,sink.class);
                startActivity(sink);
            }
        });

        bath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent bath = new Intent(MainActivity.this,bath.class);
                startActivity(bath);
            }
        });

        cistern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent cistern = new Intent(MainActivity.this,cistern.class);
                startActivity(cistern);
            }
        });

        ptmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent ptmt = new Intent(MainActivity.this,ptmt.class);
                startActivity(ptmt);
            }
        });

        showers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent showers = new Intent(MainActivity.this,showers.class);
                startActivity(showers);
            }
        });

        phone1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent phoneIntent_1 = new Intent(Intent.ACTION_DIAL);
                phoneIntent_1.setData(Uri.parse("tel:+917376747707"));
                startActivity(phoneIntent_1);
            }
        });

        phone2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent phoneIntent_2 = new Intent(Intent.ACTION_DIAL);
                phoneIntent_2.setData(Uri.parse("tel:+919876543210"));
                startActivity(phoneIntent_2);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:navnirmansjth@gmail.com"));
                startActivity(emailIntent);

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
        navigationView.setNavigationItemSelectedListener(this);
        init();

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.statusBarColor));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_cart) {
            Intent viewShoppingCartIntent = new Intent(getBaseContext(), ShoppingCartActivity.class);
            startActivity(viewShoppingCartIntent);
        }

        return super.onOptionsItemSelected(item);
    }

    private void init() {
        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) findViewById(R.id.pager);


        mPager.setAdapter(new SlidingImage_Adapter(MainActivity.this,ImagesArray));


        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(3 * density);

        NUM_PAGES =IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

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

        if (id == R.id.nav_website) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.co.in"));
            startActivity(browserIntent);
        }
        else if (id == R.id.nav_location) {
            Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                    Uri.parse("http://maps.google.com/maps?&daddr=25.324346,83.005295"));
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

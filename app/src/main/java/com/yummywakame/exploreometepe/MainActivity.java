package com.yummywakame.exploreometepe;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
/**
 * Displays a {@link ViewPager} where each page shows a different day of the week.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        // Give the tab an icon
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            tabLayout.getTabAt(0).setIcon(R.drawable.tab_icon_activities);
            tabLayout.getTabAt(1).setIcon(R.drawable.tab_icon_restaurants);
            tabLayout.getTabAt(2).setIcon(R.drawable.tab_icon_accommodation);
            tabLayout.getTabAt(3).setIcon(R.drawable.tab_icon_featured);
        }

        // Find the toolbar
        Toolbar mToolbar = findViewById(R.id.main_toolbar);
        // Add backwards compatibility to the toolbar
        setSupportActionBar(mToolbar);
        // Remove default title which is overridden in XML
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        // Change title text and color
        //mToolbar.setTitle(R.string.app_name);
        //mToolbar.setTitleTextColor(getResources().getColor(R.color.color_white_semi_trans));
    }
}

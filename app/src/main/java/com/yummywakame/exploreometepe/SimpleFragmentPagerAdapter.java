package com.yummywakame.exploreometepe;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Activities", "Restaurants", "Accommodation", "Featured" };

    private Context context;

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
       this.context = context;
    }



    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ActivitiesFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new AccommodationFragment();
        } else {
            return new FeaturedFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
//        return tabTitles[position];
        return null;
    }

}

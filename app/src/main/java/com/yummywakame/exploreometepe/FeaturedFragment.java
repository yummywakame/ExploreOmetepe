package com.yummywakame.exploreometepe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of Featured venues.
 */
public class FeaturedFragment extends Fragment {

    public ArrayList<Venue> VenuesDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public FeaturedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        //Create the ArrayList data
        VenuesDatabase.add(new Venue(
                getString(R.string.venue_5_title),
                getString(R.string.venue_5_intro),
                getString(R.string.venue_5_village),
                getString(R.string.venue_5_volcano),
                getString(R.string.venue_5_website_url),
                getString(R.string.venue_5_phone_number),
                getString(R.string.venue_5_features_services),
                getString(R.string.venue_5_map_url),
                R.drawable.venue_5));

        VenuesDatabase.add(new Venue(
                getString(R.string.venue_0_title),
                getString(R.string.venue_0_intro),
                getString(R.string.venue_0_village),
                getString(R.string.venue_0_volcano),
                getString(R.string.venue_0_website_url),
                getString(R.string.venue_0_phone_number),
                getString(R.string.venue_0_features_services),
                getString(R.string.venue_0_map_url),
                R.drawable.venue_0));

        VenuesDatabase.add(new Venue(
                getString(R.string.venue_6_title),
                getString(R.string.venue_6_intro),
                getString(R.string.venue_6_village),
                getString(R.string.venue_6_volcano),
                getString(R.string.venue_6_website_url),
                getString(R.string.venue_6_phone_number),
                getString(R.string.venue_6_features_services),
                getString(R.string.venue_6_map_url),
                R.drawable.venue_6));

        VenuesDatabase.add(new Venue(
                getString(R.string.venue_9_title),
                getString(R.string.venue_9_intro),
                getString(R.string.venue_9_village),
                getString(R.string.venue_9_volcano),
                getString(R.string.venue_9_website_url),
                getString(R.string.venue_9_phone_number),
                getString(R.string.venue_9_features_services),
                getString(R.string.venue_9_map_url),
                R.drawable.venue_9));

        VenuesDatabase.add(new Venue(
                getString(R.string.venue_14_title),
                getString(R.string.venue_14_intro),
                getString(R.string.venue_14_village),
                getString(R.string.venue_14_volcano),
                getString(R.string.venue_14_website_url),
                getString(R.string.venue_14_phone_number),
                getString(R.string.venue_14_features_services),
                getString(R.string.venue_14_map_url),
                R.drawable.venue_14));

        //Create a standard LinearLayout Manager to control how the recycler works
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        //Create an adapter based on the custom class you created
        VenueAdapter venueAdapter = new VenueAdapter(getContext(),VenuesDatabase);

        //Find your Recycler and set your layoutManger and adapter to it
        recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(venueAdapter);

        return rootView;
    }
}
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
 * {@link Fragment} that displays a list of Restaurant venues.
 */
public class RestaurantsFragment extends Fragment {

    public ArrayList<Venue> VenuesDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        //Create the ArrayList data
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
                getString(R.string.venue_10_title),
                getString(R.string.venue_10_intro),
                getString(R.string.venue_10_village),
                getString(R.string.venue_10_volcano),
                getString(R.string.venue_10_website_url),
                getString(R.string.venue_10_phone_number),
                getString(R.string.venue_10_features_services),
                getString(R.string.venue_10_map_url),
                R.drawable.venue_10));

        VenuesDatabase.add(new Venue(
                getString(R.string.venue_11_title),
                getString(R.string.venue_11_intro),
                getString(R.string.venue_11_village),
                getString(R.string.venue_11_volcano),
                getString(R.string.venue_11_website_url),
                getString(R.string.venue_11_phone_number),
                getString(R.string.venue_11_features_services),
                getString(R.string.venue_11_map_url),
                R.drawable.venue_11));

        VenuesDatabase.add(new Venue(
                getString(R.string.venue_12_title),
                getString(R.string.venue_12_intro),
                getString(R.string.venue_12_village),
                getString(R.string.venue_12_volcano),
                getString(R.string.venue_12_website_url),
                getString(R.string.venue_12_phone_number),
                getString(R.string.venue_12_features_services),
                getString(R.string.venue_12_map_url),
                R.drawable.venue_12));

        VenuesDatabase.add(new Venue(
                getString(R.string.venue_13_title),
                getString(R.string.venue_13_intro),
                getString(R.string.venue_13_village),
                getString(R.string.venue_13_volcano),
                getString(R.string.venue_13_website_url),
                getString(R.string.venue_13_phone_number),
                getString(R.string.venue_13_features_services),
                getString(R.string.venue_13_map_url),
                R.drawable.venue_13));

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
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
 * {@link Fragment} that displays a list of Activity venues.
 */
public class ActivitiesFragment extends Fragment {

    public ArrayList<Venue> VenuesDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        //Create the ArrayList data
        VenuesDatabase.add(new Venue(getString(R.string.venue_1_title),
                getString(R.string.venue_1_village),
                getString(R.string.venue_1_volcano),
                getString(R.string.venue_1_website_url),
                getString(R.string.venue_1_phone_number),
                getString(R.string.venue_1_features_services),
                getString(R.string.venue_1_map_url),
                R.drawable.venue_1));

        VenuesDatabase.add(new Venue(getString(R.string.venue_0_title),
                getString(R.string.venue_0_village),
                getString(R.string.venue_0_volcano),
                getString(R.string.venue_0_website_url),
                getString(R.string.venue_0_phone_number),
                getString(R.string.venue_0_features_services),
                getString(R.string.venue_0_map_url),
                R.drawable.venue_0));

        VenuesDatabase.add(new Venue(getString(R.string.venue_1_title),
                getString(R.string.venue_2_village),
                getString(R.string.venue_2_volcano),
                getString(R.string.venue_2_website_url),
                getString(R.string.venue_2_phone_number),
                getString(R.string.venue_2_features_services),
                getString(R.string.venue_2_map_url),
                R.drawable.venue_2));

        VenuesDatabase.add(new Venue(getString(R.string.venue_1_title),
                getString(R.string.venue_3_village),
                getString(R.string.venue_3_volcano),
                getString(R.string.venue_3_website_url),
                getString(R.string.venue_3_phone_number),
                getString(R.string.venue_3_features_services),
                getString(R.string.venue_3_map_url),
                R.drawable.venue_3));

        VenuesDatabase.add(new Venue(getString(R.string.venue_1_title),
                getString(R.string.venue_4_village),
                getString(R.string.venue_4_volcano),
                getString(R.string.venue_4_website_url),
                getString(R.string.venue_4_phone_number),
                getString(R.string.venue_4_features_services),
                getString(R.string.venue_4_map_url),
                R.drawable.venue_4));

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
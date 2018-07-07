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
 * {@link Fragment} that displays a list of Accommodation venues.
 */
public class AccommodationFragment extends Fragment {

    public ArrayList<Venue> VenuesDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public AccommodationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        //Create the ArrayList data
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
                getString(R.string.venue_7_title),
                getString(R.string.venue_7_intro),
                getString(R.string.venue_7_village),
                getString(R.string.venue_7_volcano),
                getString(R.string.venue_7_website_url),
                getString(R.string.venue_7_phone_number),
                getString(R.string.venue_7_features_services),
                getString(R.string.venue_7_map_url),
                R.drawable.venue_7));

        VenuesDatabase.add(new Venue(
                getString(R.string.venue_8_title),
                getString(R.string.venue_8_intro),
                getString(R.string.venue_8_village),
                getString(R.string.venue_8_volcano),
                getString(R.string.venue_8_website_url),
                getString(R.string.venue_8_phone_number),
                getString(R.string.venue_8_features_services),
                getString(R.string.venue_8_map_url),
                R.drawable.venue_8));

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
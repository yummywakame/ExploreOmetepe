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
 * {@link Fragment} that displays a list of number vocabulary words.
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
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create your ArrayList data
        VenuesDatabase.add(new Venue("Matthew", "News App Pt. 1",
                R.drawable.activities_concepcion_volcano));
        VenuesDatabase.add(new Venue("Olivia", "Tour Guide",
                R.drawable.activities_maderas_volcano));
        VenuesDatabase.add(new Venue("Chris", "News App Pt. 1",
                R.drawable.activities_ojo_de_agua));

        //Create a standard LinearLayout Manager to control how the recycler works
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        //Create an adapter based on the custom class you created
        VenueAdapter venueAdapter = new VenueAdapter(getActivity(),VenuesDatabase);

        //Find your Recycler and set your layoutManger and adapter to it
        recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(venueAdapter);

        return rootView;
    }
}
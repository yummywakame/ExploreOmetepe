package com.yummywakame.exploreometepe;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class VenueAdapter extends RecyclerView.Adapter<VenueAdapter.VenueHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Venue> VenuesDatabase;

    //Creates the actual method of performing the recycler
    public VenueAdapter(Context context, ArrayList<Venue> VenuesDatabase) {
        this.layoutInflater = LayoutInflater.from(context);
        this.VenuesDatabase = VenuesDatabase;
    }

    @NonNull
    @Override
    public VenueHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new VenueHolder(view);


    }

    //Binds your Array data to the particular layout views
    @Override
    public void onBindViewHolder(@NonNull VenueHolder holder, int position) {
        final Venue currentVenue = VenuesDatabase.get(position);

        //Assign the values of your ArrayList to the assigned holder views
        holder.venueTitle.setText(currentVenue.getVenueTitle());
//        holder.venueVillage.setText(currentVenue.getVenueVillage());
        holder.venueVolcano.setText(currentVenue.getVenueVolcano());
//        holder.venueWebsite.setText(currentVenue.getVenueWebsite());
//        holder.venuePhone.setText(currentVenue.getVenuePhone());
//        holder.venueFeatures.setText(currentVenue.getVenueFeatures());
        holder.venuePhotoId.setImageResource(currentVenue.getVenuePhotoId());
//        holder.venueMapUrl.setText(currentVenue.getVenueMapUrl());

        //On Click Listener that goes to the chosen Venue's ActivityDetail page
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent venueDetailsIntent = new Intent(v.getContext(), DetailActivity.class);

                // Add the venue details variables to be sent to venueDetailsActivity
                venueDetailsIntent.putExtra("VENUE_TITLE", currentVenue.getVenueTitle());
                venueDetailsIntent.putExtra("VENUE_VILLAGE", currentVenue.getVenueVillage());
                venueDetailsIntent.putExtra("VENUE_VOLCANO", currentVenue.getVenueVolcano());
                venueDetailsIntent.putExtra("VENUE_WEBSITE", currentVenue.getVenueWebsite());
                venueDetailsIntent.putExtra("VENUE_PHONE", currentVenue.getVenuePhone());
                venueDetailsIntent.putExtra("VENUE_FEATURES", currentVenue.getVenueFeatures());
                venueDetailsIntent.putExtra("VENUE_IMAGE", currentVenue.getVenuePhotoId());
                venueDetailsIntent.putExtra("VENUE_MAP_URL", currentVenue.getVenueMapUrl());
                v.getContext().startActivity(venueDetailsIntent);
            }
        });
    }

    //Returns your Array size
    @Override
    public int getItemCount() {
        return VenuesDatabase.size();
    }

    //This is a custom holder which is how your data binding occurs, this is where the ids are assigned.
    class VenueHolder extends RecyclerView.ViewHolder {
        private TextView venueTitle;
//        private TextView venueVillage;
        private TextView venueVolcano;
//        private TextView venueWebsite;
//        private TextView venuePhone;
//        private TextView venueFeatures;
        private ImageView venuePhotoId;
//        private TextView venueMapUrl;

        private VenueHolder(View venueView) {
            super(venueView);
            venueTitle = venueView.findViewById(R.id.venue_title);
//            venueVillage = venueView.findViewById(R.id.venue_village);
            venueVolcano = venueView.findViewById(R.id.venue_volcano);
//            venueWebsite = venueView.findViewById(R.id.venue_website);
//            venuePhone = venueView.findViewById(R.id.venue_phone);
//            venueFeatures = venueView.findViewById(R.id.venue_features);
            venuePhotoId = venueView.findViewById(R.id.venue_photo);
//            venueMapURL = venueView.findViewById(R.id.venue_map);
        }


    }


}

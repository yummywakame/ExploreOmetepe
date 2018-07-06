package com.yummywakame.exploreometepe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get the intent that was used to start this activity
        Intent selectedVenueDetails = getIntent();

        // Find the views for selected Venue
        TextView selectedVenueTitleTextView = findViewById(R.id.toolbar_title);
        TextView selectedVenueVillageTextView = findViewById(R.id.venue_village);
        TextView selectedVenueVolcanoTextView = findViewById(R.id.venue_volcano);
        TextView selectedVenueWebsiteTextView = findViewById(R.id.venue_website);
        TextView selectedVenuePhoneTextView = findViewById(R.id.venue_phone);
        TextView selectedVenueFeaturesTextView = findViewById(R.id.venue_features);
        ImageView selectedVenueImageView = findViewById(R.id.backdrop);

        // Set the views to the values pulled from the intent
        selectedVenueTitleTextView.setText(selectedVenueDetails.getStringExtra("VENUE_TITLE"));
        selectedVenueVillageTextView.setText(selectedVenueDetails.getStringExtra("VENUE_VILLAGE"));
        selectedVenueVolcanoTextView.setText(selectedVenueDetails.getStringExtra("VENUE_VOLCANO"));
        selectedVenueWebsiteTextView.setText(selectedVenueDetails.getStringExtra("VENUE_WEBSITE"));
        selectedVenuePhoneTextView.setText(selectedVenueDetails.getStringExtra("VENUE_PHONE"));
        selectedVenueFeaturesTextView.setText(selectedVenueDetails.getStringExtra("VENUE_FEATURES"));
        selectedVenueImageView.setImageResource(selectedVenueDetails.getIntExtra("VENUE_IMAGE",0));

        // Set up the custom toolbar and back button
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }
}

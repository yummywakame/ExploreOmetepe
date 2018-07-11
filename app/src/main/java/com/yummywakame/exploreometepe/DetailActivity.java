/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yummywakame.exploreometepe;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Venue details BUNDLE from MainActivity
        final String venueTitle = getIntent().getStringExtra("VENUE_TITLE");
        final String venueIntro = getIntent().getStringExtra("VENUE_INTRO");
        final String venueVillage = getIntent().getStringExtra("VENUE_VILLAGE");
        final String venueVolcano = getIntent().getStringExtra("VENUE_VOLCANO");
        final String venueWebsite = getIntent().getStringExtra("VENUE_WEBSITE");
        final String venuePhone = getIntent().getStringExtra("VENUE_PHONE");
        final String venueFeatures = getIntent().getStringExtra("VENUE_FEATURES");
        final int venueImage = getIntent().getIntExtra("VENUE_IMAGE",0);
        final String venueMapUrl = getIntent().getStringExtra("VENUE_MAP_URL");

        // Find the views for selected Venue
        TextView selectedVenueTitleTextView = findViewById(R.id.toolbar_title);
        TextView selectedVenueIntroTextView = findViewById(R.id.venue_intro);
        TextView selectedVenueVillageTextView = findViewById(R.id.venue_village);
        TextView selectedVenueVolcanoTextView = findViewById(R.id.venue_volcano);
        TextView selectedVenueWebsiteTextView = findViewById(R.id.venue_website);
        TextView selectedVenuePhoneTextView = findViewById(R.id.venue_phone);
        TextView selectedVenueFeaturesTextView = findViewById(R.id.venue_features);
        ImageView selectedVenueImageView = findViewById(R.id.backdrop);
        ImageView selectedVenueMapImageView = findViewById(R.id.venue_map);

        // Set the TextViews to the BUNDLE values for the selected Venue
        if (venueTitle.equals("") || venueTitle.equals("N/A")) {
            selectedVenueTitleTextView.setVisibility(View.GONE);
        } else {
            selectedVenueTitleTextView.setText(venueTitle);
        }

        if (venueIntro.equals("") || venueIntro.equals("N/A")) {
            selectedVenueIntroTextView.setVisibility(View.GONE);
        } else {
            selectedVenueIntroTextView.setText(venueIntro);
        }

        if (venueVillage.equals("") || venueVillage.equals("N/A")) {
            selectedVenueVillageTextView.setVisibility(View.GONE);
        } else {
            selectedVenueVillageTextView.setText(venueVillage);
        }

        if (venueVolcano.equals("") || venueVolcano.equals("N/A")) {
            selectedVenueVolcanoTextView.setVisibility(View.GONE);
        } else {
            selectedVenueVolcanoTextView.setText(venueVolcano);
        }

        if (venueWebsite.equals("") || venueWebsite.equals("N/A")) {
            selectedVenueWebsiteTextView.setVisibility(View.GONE);
        } else {
            selectedVenueWebsiteTextView.setText(venueWebsite);
        }

        if (venuePhone.equals("") || venuePhone.equals("N/A")) {
            selectedVenuePhoneTextView.setVisibility(View.GONE);
        } else {
            selectedVenuePhoneTextView.setText(venuePhone);
        }

        if (venueFeatures.equals("") || venueFeatures.equals("N/A")) {
            selectedVenueFeaturesTextView.setVisibility(View.GONE);
        } else {
            selectedVenueFeaturesTextView.setText(venueFeatures);
        }

        // Check if there is a url and display the map locator button if there is
        if (venueMapUrl.equals("") || venueMapUrl.equals("N/A")) {
            selectedVenueMapImageView.setVisibility(View.GONE);
        }

        // Display the venue image
        selectedVenueImageView.setImageResource(venueImage);

        // Set up the custom toolbar and back button
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Launch website in browser when url button is clicked
        findViewById(R.id.venue_website).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = venueWebsite;

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        // Launch phone number in dialer when phone button is clicked
        findViewById(R.id.venue_phone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = venuePhone;

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        // Launch maps when map button is clicked
        findViewById(R.id.venue_map).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri mapUri = Uri.parse(venueMapUrl);

                Intent intent = new Intent(Intent.ACTION_VIEW, mapUri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }

    // Make the Up Button behave like a Back Button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return(super.onOptionsItemSelected(item));
    }
}

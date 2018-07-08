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

        // Get the intent that was used to start this activity
        final Intent selectedVenueDetails = getIntent();

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
        if (TextUtils.isEmpty(selectedVenueDetails.getStringExtra("VENUE_TITLE"))
                || selectedVenueDetails.getStringExtra("VENUE_TITLE").equals("N/A")) {
            selectedVenueTitleTextView.setVisibility(View.GONE);
        } else {
            selectedVenueTitleTextView.setText(selectedVenueDetails.getStringExtra("VENUE_TITLE"));
        }

        if (TextUtils.isEmpty(selectedVenueDetails.getStringExtra("VENUE_INTRO"))
                || selectedVenueDetails.getStringExtra("VENUE_INTRO").equals("N/A")) {
            selectedVenueIntroTextView.setVisibility(View.GONE);
        } else {
            selectedVenueIntroTextView.setText(selectedVenueDetails.getStringExtra("VENUE_INTRO"));
        }

        if (TextUtils.isEmpty(selectedVenueDetails.getStringExtra("VENUE_VILLAGE"))
                || selectedVenueDetails.getStringExtra("VENUE_VILLAGE").equals("N/A")) {
            selectedVenueVillageTextView.setVisibility(View.GONE);
        } else {
            selectedVenueVillageTextView.setText(selectedVenueDetails.getStringExtra("VENUE_VILLAGE"));
        }

        if (TextUtils.isEmpty(selectedVenueDetails.getStringExtra("VENUE_VOLCANO"))
                || selectedVenueDetails.getStringExtra("VENUE_VOLCANO").equals("N/A")) {
            selectedVenueVolcanoTextView.setVisibility(View.GONE);
        } else {
            selectedVenueVolcanoTextView.setText(selectedVenueDetails.getStringExtra("VENUE_VOLCANO"));
        }

        if (TextUtils.isEmpty(selectedVenueDetails.getStringExtra("VENUE_WEBSITE"))
                || selectedVenueDetails.getStringExtra("VENUE_WEBSITE").equals("N/A")) {
            selectedVenueWebsiteTextView.setVisibility(View.GONE);
        } else {
            selectedVenueWebsiteTextView.setText(selectedVenueDetails.getStringExtra("VENUE_WEBSITE"));
        }

        if (TextUtils.isEmpty(selectedVenueDetails.getStringExtra("VENUE_PHONE"))
                || selectedVenueDetails.getStringExtra("VENUE_PHONE").equals("N/A")) {
            selectedVenuePhoneTextView.setVisibility(View.GONE);
        } else {
            selectedVenuePhoneTextView.setText(selectedVenueDetails.getStringExtra("VENUE_PHONE"));
        }

        if (TextUtils.isEmpty(selectedVenueDetails.getStringExtra("VENUE_FEATURES"))
                || selectedVenueDetails.getStringExtra("VENUE_FEATURES").equals("N/A")) {
            selectedVenueFeaturesTextView.setVisibility(View.GONE);
        } else {
            selectedVenueFeaturesTextView.setText(selectedVenueDetails.getStringExtra("VENUE_FEATURES"));
        }

        // Check if there is a url and display the map locator button if there is
        if (TextUtils.isEmpty(selectedVenueDetails.getStringExtra("VENUE_MAP_URL"))
                || selectedVenueDetails.getStringExtra("VENUE_MAP_URL").equals("N/A")) {
            selectedVenueMapImageView.setVisibility(View.GONE);
        } else {
            String mapUrl = selectedVenueDetails.getStringExtra("VENUE_MAP_URL");
        }

        // Display the venue image
        selectedVenueImageView.setImageResource(selectedVenueDetails.getIntExtra("VENUE_IMAGE",0));

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
                String url = selectedVenueDetails.getStringExtra("VENUE_WEBSITE");

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
                String phoneNumber = selectedVenueDetails.getStringExtra("VENUE_PHONE");

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
                Uri mapUri = Uri.parse(selectedVenueDetails.getStringExtra("VENUE_MAP_URL"));

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

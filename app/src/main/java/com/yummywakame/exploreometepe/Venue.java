package com.yummywakame.exploreometepe;

public class Venue {

    private String VenueTitle;
    private String VenueTown;
    private int VenuePhotoId;

    public Venue(String VenueTitle, String VenueTown, int VenuePhotoId) {
        this.VenueTitle = VenueTitle;
        this.VenueTown = VenueTown;
        this.VenuePhotoId = VenuePhotoId;
    }

    //These are your GETTERS to return the selected items
    public String getVenueTitle() {
        return VenueTitle;
    }
    public String getVenueTown() {
        return VenueTown;
    }
    public int getVenuePhotoId() {
        return VenuePhotoId;
    }
}

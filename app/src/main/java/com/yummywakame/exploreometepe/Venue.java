package com.yummywakame.exploreometepe;

public class Venue {

    private String VenueTitle;
    private String VenueVillage;
    private int VenuePhotoId;

    public Venue(String VenueTitle, String VenueVillage, int VenuePhotoId) {
        this.VenueTitle = VenueTitle;
        this.VenueVillage = VenueVillage;
        this.VenuePhotoId = VenuePhotoId;
    }

    //These are your GETTERS to return the selected items
    public String getVenueTitle() {
        return VenueTitle;
    }
    public String getVenueVillage() {
        return VenueVillage;
    }
    public int getVenuePhotoId() {
        return VenuePhotoId;
    }
}

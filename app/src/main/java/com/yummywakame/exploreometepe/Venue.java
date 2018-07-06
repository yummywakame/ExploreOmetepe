package com.yummywakame.exploreometepe;

public class Venue {

    private String VenueTitle;
    private String VenueVillage;
    private String VenueVolcano;
    private String VenueWebsite;
    private String VenuePhone;
    private String VenueFeatures;
    private int VenuePhotoId;

    public Venue(String VenueTitle,
                 String VenueVillage,
                 String VenueVolcano,
                 String VenueWebsite,
                 String VenuePhone,
                 String VenueFeatures,
                 int VenuePhotoId) {
        this.VenueTitle = VenueTitle;
        this.VenueVillage = VenueVillage;
        this.VenueVolcano = VenueVolcano;
        this.VenueWebsite = VenueWebsite;
        this.VenuePhone = VenuePhone;
        this.VenueFeatures = VenueFeatures;
        this.VenuePhotoId = VenuePhotoId;
    }

    //These are your GETTERS to return the selected items
    public String getVenueTitle() {
        return VenueTitle;
    }
    public String getVenueVillage() {
        return VenueVillage;
    }
    public String getVenueVolcano() {
        return VenueVolcano;
    }
    public String getVenueWebsite() {
        return VenueWebsite;
    }
    public String getVenuePhone() {
        return VenuePhone;
    }
    public String getVenueFeatures() {
        return VenueFeatures;
    }
    public int getVenuePhotoId() {
        return VenuePhotoId;
    }
}

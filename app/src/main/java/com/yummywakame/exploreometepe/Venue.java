package com.yummywakame.exploreometepe;

public class Venue {

    // Venue items
    private String VenueTitle;
    private String VenueIntro;
    private String VenueVillage;
    private String VenueVolcano;
    private String VenueWebsite;
    private String VenuePhone;
    private String VenueFeatures;
    private String VenueMapUrl;
    private int VenuePhotoId;


    public Venue(String VenueTitle,
                 String VenueIntro,
                 String VenueVillage,
                 String VenueVolcano,
                 String VenueWebsite,
                 String VenuePhone,
                 String VenueFeatures,
                 String VenueMapUrl,
                 int VenuePhotoId){
        this.VenueTitle = VenueTitle;
        this.VenueIntro = VenueIntro;
        this.VenueVillage = VenueVillage;
        this.VenueVolcano = VenueVolcano;
        this.VenueWebsite = VenueWebsite;
        this.VenuePhone = VenuePhone;
        this.VenueFeatures = VenueFeatures;
        this.VenueMapUrl = VenueMapUrl;
        this.VenuePhotoId = VenuePhotoId;

    }

    //These are your GETTERS to return the selected items
    public String getVenueTitle() {
        return VenueTitle;
    }
    public String getVenueIntro() {
        return VenueIntro;
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
    public String getVenueMapUrl() {
        return VenueMapUrl;
    }
    public int getVenuePhotoId() {
        return VenuePhotoId;
    }

}

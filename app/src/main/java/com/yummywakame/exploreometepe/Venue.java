package com.yummywakame.exploreometepe;

public class Venue {

    // Venue items
    private String mTitle;
    private String mIntro;
    private String mVillage;
    private String mVolcano;
    private String mWebsite;
    private String mPhone;
    private String mFeatures;
    private String mMapUrl;
    private int mPhotoId;

    public Venue(String mTitle,
                 String mIntro,
                 String mVillage,
                 String mVolcano,
                 String mWebsite,
                 String mPhone,
                 String mFeatures,
                 String mMapUrl,
                 int mPhotoId){
        this.mTitle = mTitle;
        this.mIntro = mIntro;
        this.mVillage = mVillage;
        this.mVolcano = mVolcano;
        this.mWebsite = mWebsite;
        this.mPhone = mPhone;
        this.mFeatures = mFeatures;
        this.mMapUrl = mMapUrl;
        this.mPhotoId = mPhotoId;
    }

    //These are your GETTERS to return the selected items
    public String getVenueTitle() {
        return mTitle;
    }
    public String getVenueIntro() {
        return mIntro;
    }
    public String getVenueVillage() {
        return mVillage;
    }
    public String getVenueVolcano() {
        return mVolcano;
    }
    public String getVenueWebsite() {
        return mWebsite;
    }
    public String getVenuePhone() {
        return mPhone;
    }
    public String getVenueFeatures() {
        return mFeatures;
    }
    public String getVenueMapUrl() {
        return mMapUrl;
    }
    public int getVenuePhotoId() {
        return mPhotoId;
    }
}
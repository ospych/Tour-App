package com.example.tourguide;

public class Item {
    private String mTitle;
    private String mDesc;
    private String mAbout;
    private String mPhone;
    private String mLocation;

    private final static String NO_CALL_NUMBER = null;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private final static int NO_IMAGE_PROVIDED = -1;


    public Item(String title, String desc, int imageResourceId, String location, String about){
        mTitle = title;
        mDesc = desc;
        mImageResourceId = imageResourceId;
        mLocation = location;
        mAbout = about;
    }

    public Item(String title, String desc, int imageResourceId, String location, String phone, String about){
        mTitle = title;
        mDesc = desc;
        mImageResourceId = imageResourceId;
        mLocation = location;
        mPhone = phone;
        mAbout = about;
    }

    public String getTitle(){return mTitle;}

    public String getDesc(){return mDesc;}

    public String getAbout(){return mAbout;}

    public String getPhone(){return mPhone;}

    public String getLocation() {return mLocation;}

    public boolean hasNumber() {return mPhone != NO_CALL_NUMBER; }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

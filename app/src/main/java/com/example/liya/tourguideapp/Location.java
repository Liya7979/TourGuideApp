package com.example.liya.tourguideapp;

public class Location {

    private int mTitleId;
    private int mDescriptionId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param titleId is the string resource ID for the title of the location.
     * @param descriptionId   is the string resource ID for the description of the location.
     * @param imageResourceId      is the resource ID for the audio file associated with this location
     */
    public Location(int titleId, int descriptionId, int imageResourceId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Location object.
     *
     * @param titleId is the string resource ID for the title of the location.
     * @param descriptionId   is the string resource ID for the description of the location.
     */
    public Location(int titleId, int descriptionId) {
        mTitleId = titleId;
        mDescriptionId = descriptionId;
    }

    /**
     * Get the string resource ID for the title of the location.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string resource ID for the description of the location.
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for the location.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    
}

package com.example.android.miwok;

/**
 * Created by admin on 24-06-2016.
 */
public class Word {

    //Default Translation for the words
    private String mDefaultTranslation;

    //Miwok Translation for the words
    private String mMiwokTranslation;

    //Audio
    private int mAudioResourceId;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;



    // constructor for the new word object with image Resource id
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Getter for audio resource
    public int getAudioResourceId(){return mAudioResourceId;}

    //get the default Translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //get the miwok Translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    //get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

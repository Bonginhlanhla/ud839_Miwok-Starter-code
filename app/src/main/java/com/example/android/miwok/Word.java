package com.example.android.miwok;

import android.media.Image;

/**
 * Created by Admin on 6/21/2017.
 */

public class Word {

    private String englishTranslation, zuluTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String englishTranslation, String zuluTranslation, int audioResourceId) {
        this.englishTranslation = englishTranslation;
        this.zuluTranslation = zuluTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String englishTranslation, String zuluTranslation, int mImageResourceId, int mAudioResourceId) {
        this.englishTranslation = englishTranslation;
        this.zuluTranslation = zuluTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public String getZuluTranslation() {
        return zuluTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public void setEnglishTranslation(String englishTranslation) {
        this.englishTranslation = englishTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}

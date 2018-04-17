package com.softbankrobotics.qisdktutorials.model.data;

import android.graphics.Bitmap;

import com.aldebaran.qi.sdk.object.human.AttentionState;
import com.aldebaran.qi.sdk.object.human.EngagementIntentionState;
import com.aldebaran.qi.sdk.object.human.ExcitementState;
import com.aldebaran.qi.sdk.object.human.Gender;
import com.aldebaran.qi.sdk.object.human.PleasureState;
import com.aldebaran.qi.sdk.object.human.SmileState;

import java.nio.ByteBuffer;

/**
 * Represents the human information.
 */
public class HumanInfo {

    private int age;
    private Gender gender;
    private PleasureState pleasureState;
    private ExcitementState excitementState;
    private EngagementIntentionState engagementIntentionState;
    private SmileState smileState;
    private AttentionState attentionState;
    private double distance;
    private Bitmap facePicture;

    public HumanInfo(int age, Gender gender, PleasureState pleasureState, ExcitementState excitementState, EngagementIntentionState engagementIntentionState, SmileState smileState, AttentionState attentionState, double distance) {
    public HumanInfo(int age, Gender gender, PleasureState pleasureState, ExcitementState excitementState, SmileState smileState, AttentionState attentionState, double distance, Bitmap facePicture) {
        this.age = age;
        this.gender = gender;
        this.pleasureState = pleasureState;
        this.excitementState = excitementState;
        this.engagementIntentionState = engagementIntentionState;
        this.smileState = smileState;
        this.attentionState = attentionState;
        this.distance = distance;
        this.facePicture = facePicture;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public PleasureState getPleasureState() {
        return pleasureState;
    }

    public ExcitementState getExcitementState() {
        return excitementState;
    }

    public EngagementIntentionState getEngagementIntentionState() { return engagementIntentionState; }

    public SmileState getSmileState() {
        return smileState;
    }

    public AttentionState getAttentionState() {
        return attentionState;
    }

    public double getDistance() {
        return distance;
    }

    public Bitmap getFacePicture() {
        return facePicture;
    }
}

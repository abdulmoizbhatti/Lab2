/*
 * File Name: CareProfile.java
 * Assignment: Lab 2 Exercise D
 * Completed by: Moiz Bhatti
 * Submission Date: July 11th, 2024
 */

public class CareProfile {
    private String feedingInstructions;
    private String medicationList;
    private String medicationInstructions;

    public CareProfile(String feedingInstructions, String medicationList, String medicationInstructions) {
        this.feedingInstructions = feedingInstructions;
        this.medicationList = medicationList;
        this.medicationInstructions = medicationInstructions;
    }

    public String getFeedingInstructions() {
        return feedingInstructions;
    }

    public String getMedicationList() {
        return medicationList;
    }

    public String getMedicationInstructions() {
        return medicationInstructions;
    }

    @Override
    public String toString() {
        return "Feeding Instructions: " + feedingInstructions + "\nMedication List: " + medicationList + "\nMedication Instructions: " + medicationInstructions;
    }
}

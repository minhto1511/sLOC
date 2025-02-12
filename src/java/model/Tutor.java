/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minht
 */
public class Tutor extends User {

    private String subject;
    private double rating;
    private String yearOfExperience;
    private String country;
    private String avatarURL;
    private String languageToSpeak;
    private String levelLanguageToSpeak;
    private String certification;
    private String education;
    private String profileDescription;
    private String payout;
    private String commissionRate;
    private String videoURL;

    public Tutor() {
    }

    public Tutor(String subject, double rating, String yearOfExperience, String country, String avatarURL, String languageToSpeak, String levelLanguageToSpeak, String certification, String education, String profileDescription, String payout, String commissionRate, String videoURL) {
        this.subject = subject;
        this.rating = rating;
        this.yearOfExperience = yearOfExperience;
        this.country = country;
        this.avatarURL = avatarURL;
        this.languageToSpeak = languageToSpeak;
        this.levelLanguageToSpeak = levelLanguageToSpeak;
        this.certification = certification;
        this.education = education;
        this.profileDescription = profileDescription;
        this.payout = payout;
        this.commissionRate = commissionRate;
        this.videoURL = videoURL;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(String yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public String getLanguageToSpeak() {
        return languageToSpeak;
    }

    public void setLanguageToSpeak(String languageToSpeak) {
        this.languageToSpeak = languageToSpeak;
    }

    public String getLevelLanguageToSpeak() {
        return levelLanguageToSpeak;
    }

    public void setLevelLanguageToSpeak(String levelLanguageToSpeak) {
        this.levelLanguageToSpeak = levelLanguageToSpeak;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public String getPayout() {
        return payout;
    }

    public void setPayout(String payout) {
        this.payout = payout;
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

}

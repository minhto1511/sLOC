/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minht
 */
public class Student extends User {

    private String paymentMedthod;
    private String paymentHistory;
    private String timeZone;

    public Student() {
    }

    public Student(String paymentMedthod, String paymentHistory, String timeZone) {
        this.paymentMedthod = paymentMedthod;
        this.paymentHistory = paymentHistory;
        this.timeZone = timeZone;
    }

    public String getPaymentMedthod() {
        return paymentMedthod;
    }

    public void setPaymentMedthod(String paymentMedthod) {
        this.paymentMedthod = paymentMedthod;
    }

    public String getPaymentHistory() {
        return paymentHistory;
    }

    public void setPaymentHistory(String paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

   

}

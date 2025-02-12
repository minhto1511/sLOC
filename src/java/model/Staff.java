/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author minht
 */


public class Staff extends User {
    private String tutorID;
    // CV có thể được lưu dưới dạng URL đến file CV (hoặc một chuỗi chứa nội dung, tùy theo thiết kế)
    private String cvURL;
    private Date submissionDate;
    private ApprovalStatus approvalStatus;
    
    public enum ApprovalStatus {
        PENDING,   
        APPROVED,  
        REJECTED   
    }
    
    
    public Staff() {
    }

    public Staff(String tutorID, String cvURL, Date submissionDate, ApprovalStatus approvalStatus) {
        this.tutorID = tutorID;
        this.cvURL = cvURL;
        this.submissionDate = submissionDate;
        this.approvalStatus = approvalStatus;
    }

    public String getTutorID() {
        return tutorID;
    }

    public void setTutorID(String tutorID) {
        this.tutorID = tutorID;
    }

    public String getCvURL() {
        return cvURL;
    }

    public void setCvURL(String cvURL) {
        this.cvURL = cvURL;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
    
   
}

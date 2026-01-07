package project;

import java.util.Date;

public class MedicalCertificate {
    private String certificateId;
    private Date issueDate;
    private Date expireDate;
    private String diagnosisSummary;
    private int restDays;
    private boolean isPrinted;
    private boolean isValid;

    public MedicalCertificate() {
        this.isPrinted = false;
        this.isValid = false;
    }

    public MedicalCertificate(String certificateId, Date issueDate, Date expireDate,
                              String diagnosisSummary, int restDays) {
        this.certificateId = certificateId;
        this.issueDate = issueDate;
        this.expireDate = expireDate;
        this.diagnosisSummary = diagnosisSummary;
        this.restDays = restDays;
        this.isPrinted = false;
        this.isValid = true;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getDiagnosisSummary() {
        return diagnosisSummary;
    }

    public void setDiagnosisSummary(String diagnosisSummary) {
        this.diagnosisSummary = diagnosisSummary;
    }

    public int getRestDays() {
        return restDays;
    }

    public void setRestDays(int restDays) {
        this.restDays = restDays;
    }

    public boolean isPrinted() {
        return isPrinted;
    }

    public boolean isValid() {
        return isValid;
    }

    public void generateCertificate() {
        this.issueDate = new Date();   
        this.isValid = true;
        this.isPrinted = false;
        System.out.println("Medical Certificate generated successfully.");
    }

    public void printCertificate() {
            System.out.println(" Medical Certificate ");
            System.out.println("Certificate ID: " + certificateId);
            System.out.println("Issue Date: " + issueDate);
            System.out.println("Expire Date: " + expireDate);
            System.out.println("Diagnosis: " + diagnosisSummary);
            System.out.println("Rest Days: " + restDays);
            System.out.println("Status: VALID");
            this.isPrinted = true;
    }

    public boolean verifyCertificate() {
            return isValid;
    }

    public void invalidateCertificate() {
        this.isValid = false;
        System.out.println("Medical Certificate has been invalidated.");
    }
}
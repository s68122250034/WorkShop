package project;

import java.time.LocalDate;
import java.time.LocalTime;

public class MedicalRecord {

    private String recordId;
    private String symptom;
    private String diagnosis;
    private String treatment;
    private String medicine;
    private String allergyNote;
    private LocalDate recordDate;
    private LocalTime recordTime;
    private boolean medicalCertificateIssued;
    private String remark;

    public static int recordCount = 0;


    public MedicalRecord() {
        recordCount++;
    }

    public MedicalRecord(String recordId, String symptom, String diagnosis, String treatment, 
    String medicine, String allergyNote, LocalDate recordDate, LocalTime recordTime, 
    boolean medicalCertificateIssued, String remark) {
        this.recordId = recordId;
        this.symptom = symptom;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medicine = medicine;
        this.allergyNote = allergyNote;
        this.recordDate = LocalDate.now();
        this.recordTime = LocalTime.now();
        this.medicalCertificateIssued = medicalCertificateIssued;
        this.remark = remark;
        recordCount++;
    }

    public String getRecordId() { return recordId; }
    public void setRecordId(String recordId) { this.recordId = recordId; }

    public String getSymptom() { return symptom; }
    public void setSymptom(String symptom) { this.symptom = symptom; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public String getTreatment() { return treatment; }
    public void setTreatment(String treatment) { this.treatment = treatment; }

    public String getMedicine() { return medicine; }
    public void setMedicine(String medicine) { this.medicine = medicine; }

    public String getAllergyNote() { return allergyNote; }
    public void setAllergyNote(String allergyNote) { this.allergyNote = allergyNote; }

    public LocalDate getRecordDate() { return recordDate; }
    public void setRecordDate(LocalDate recordDate) { this.recordDate = recordDate; }

    public LocalTime getRecordTime() { return recordTime; }
    public void setRecordTime(LocalTime recordTime) { this.recordTime = recordTime; }

    public boolean getmedicalCertificateIssued() { return medicalCertificateIssued; }
    public void setmedicalCertificateIssued(boolean medicalCertificateIssued) { this.medicalCertificateIssued = medicalCertificateIssued; }

    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }

    public void saveRecord() {
        System.out.println("Record saved: " + recordId);
    }

    public void updateRecord() {
        System.out.println("Record updated: " + recordId);
    }

    public void viewRecord() {
        System.out.println("Viewing record: " + recordId);
    }

    public void printMedicalCertificate() {
        if (medicalCertificateIssued) {
            System.out.println("Printing medical certificate for " + recordId);
        } else {
            System.out.println("No certificate issued for " + recordId);
        }
    }
}
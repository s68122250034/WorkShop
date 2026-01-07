package project;

public class Doctor {

    private String doctorId;
    private String licenseNumber;
    private String specialty;
    private String experienceYear;
    private String diagnosis;
    private String treatmentPlan;
    private String prescription;

    public static int doctorCount = 0;

    public Doctor() {
        doctorCount++;
    }

    public Doctor(String doctorId, String licenseNumber, String specialty, String experienceYear,
     String diagnosis, String treatmentPlan, String prescription) {
        this.doctorId = doctorId;
        this.licenseNumber = licenseNumber;
        this.specialty = specialty;
        this.experienceYear = experienceYear;
        this.diagnosis = diagnosis;
        this.treatmentPlan = treatmentPlan;
        this.prescription = prescription;
        doctorCount++;
    }


    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public String getExperienceYear() { return experienceYear; }
    public void setExperienceYear(String experienceYear) { this.experienceYear = experienceYear; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public String getTreatmentPlan() { return treatmentPlan; }
    public void setTreatmentPlan(String treatmentPlan) { this.treatmentPlan = treatmentPlan; }

    public String getPrescription() { return prescription; }
    public void setPrescription(String prescription) { this.prescription = prescription; }

    public void examinePatient() {
        System.out.println("Doctor examines patient.");
    }

    public void diagnose() {
        System.out.println("Doctor makes a diagnosis.");
    }

    public void prescribeMedicine() {
        System.out.println("Doctor prescribes medicine.");
    }

    public void issueMedicalCertificate() {
        System.out.println("Doctor issues a medical certificate.");
    }

    public void approveLeave() {
        System.out.println("Doctor approves leave.");
    }
}
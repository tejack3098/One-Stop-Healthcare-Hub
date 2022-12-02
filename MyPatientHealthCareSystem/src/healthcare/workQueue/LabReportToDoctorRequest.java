/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.workQueue;

/**
 *
 * @author Tejas
 */
public class LabReportToDoctorRequest extends WorkRequest{
    
    private String patientName;
    private String patientGender;
    private int patientAge;
    private String healthRisk;
    private String medicalDoseDetail;
    private String medicalHistory;
    private String labAssessmentResult;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getHealthRisk() {
        return healthRisk;
    }

    public void setHealthRisk(String healthRisk) {
        this.healthRisk = healthRisk;
    }

    public String getMedicalDoseDetail() {
        return medicalDoseDetail;
    }

    public void setMedicalDoseDetail(String medicalDoseDetail) {
        this.medicalDoseDetail = medicalDoseDetail;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getLabAssessmentResult() {
        return labAssessmentResult;
    }

    public void setLabAssessmentResult(String labAssessmentResult) {
        this.labAssessmentResult = labAssessmentResult;
    }
        
}

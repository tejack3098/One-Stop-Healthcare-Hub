/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.workQueue;

import java.util.ArrayList;

/**
 *
 * @author Shriya
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<PatientAppointmentRequest> patientAppointmentRequest;
    private ArrayList<DoctorLabRequest> doctorLabRequest;
    private ArrayList<DonorBankRequest> donorBankRequest;
    private ArrayList<EmergencyUnitRequest> emergencyUnitRequest;
    private ArrayList<PharmacyRequest> pharmacyRequest;
    private ArrayList<VaccinationRequest> vaccinationRequest;

    public WorkQueue() {
        this.workRequestList = new ArrayList<>();
        this.patientAppointmentRequest =  new ArrayList<>(); 
        this.doctorLabRequest = new ArrayList<>();
        this.donorBankRequest = new ArrayList<>();
        this.emergencyUnitRequest = new ArrayList<>();
        this.pharmacyRequest = new ArrayList<>();
        this.vaccinationRequest = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<PatientAppointmentRequest> getPatientAppointmentRequest() {
        return patientAppointmentRequest;
    }

    public void setPatientAppointmentRequest(ArrayList<PatientAppointmentRequest> patientAppointmentRequest) {
        this.patientAppointmentRequest = patientAppointmentRequest;
    }

    public ArrayList<DoctorLabRequest> getDoctorLabRequest() {
        return doctorLabRequest;
    }

    public void setDoctorLabRequest(ArrayList<DoctorLabRequest> doctorLabRequest) {
        this.doctorLabRequest = doctorLabRequest;
    }

    public ArrayList<DonorBankRequest> getDonorBankRequest() {
        return donorBankRequest;
    }

    public void setDonorBankRequest(ArrayList<DonorBankRequest> donorBankRequest) {
        this.donorBankRequest = donorBankRequest;
    }

    public ArrayList<EmergencyUnitRequest> getEmergencyUnitRequest() {
        return emergencyUnitRequest;
    }

    public void setEmergencyUnitRequest(ArrayList<EmergencyUnitRequest> emergencyUnitRequest) {
        this.emergencyUnitRequest = emergencyUnitRequest;
    }

    public ArrayList<PharmacyRequest> getPharmacyRequest() {
        return pharmacyRequest;
    }

    public void setPharmacyRequest(ArrayList<PharmacyRequest> pharmacyRequest) {
        this.pharmacyRequest = pharmacyRequest;
    }

    public ArrayList<VaccinationRequest> getVaccinationRequest() {
        return vaccinationRequest;
    }

    public void setVaccinationRequest(ArrayList<VaccinationRequest> vaccinationRequest) {
        this.vaccinationRequest = vaccinationRequest;
    }
    
 }

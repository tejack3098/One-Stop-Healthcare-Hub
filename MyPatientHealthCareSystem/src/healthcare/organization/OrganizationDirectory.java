/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.organization;

import healthcare.enterprise.emergencyUnit.EmergencyUnitOrganization;
import healthcare.enterprise.vaccination.VaccinationOrganization;
import healthcare.enterprise.pharmacy.PharmacyOrganization;
import healthcare.enterprise.supplyChain.SupplierOrganization;
import healthcare.enterprise.lab.LabOrganization;
import healthcare.Enterprise.donorBank.DonorBankOrganization;
import healthcare.enterprise.healthCare.PatientOrganization;
import healthcare.enterprise.healthCare.NurseOrganization;
import healthcare.enterprise.healthCare.DoctorOrganization;
import healthcare.enterprise.emergencyUnit.EmergencyUnitEnterprise;
import healthcare.organization.Organization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList =  new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createNewOrganization(OrganizationType organizationType){
        Organization organization = null;
       
        if(organizationType != null){
        
            switch(organizationType){
            
                case Doctor:
                    organization = new DoctorOrganization();
                    this.organizationList.add(organization);
                    break;
                    
                case DonorBank:
                    organization = new DonorBankOrganization();
                    this.organizationList.add(organization);
                    break;
                    
                case EmergencyUnit:
                    organization = new EmergencyUnitOrganization();
                    this.organizationList.add(organization);
                    break;
                    
                case Lab:
                    organization = new LabOrganization();
                    this.organizationList.add(organization);
                    break;
                    
                case Nurse:
                    organization = new NurseOrganization();
                    this.organizationList.add(organization);
                    break;
                    
                case Patient:
                    organization = new PatientOrganization();
                    this.organizationList.add(organization);
                    break;
                    
                case Pharmacy:
                    organization = new PharmacyOrganization();
                    this.organizationList.add(organization);
                    break;
                    
                case Supplier:
                    organization = new SupplierOrganization();
                    this.organizationList.add(organization);
                    break;
                    
                case Vaccination:
                    organization = new VaccinationOrganization();
                    this.organizationList.add(organization);
                    break;
                
                default:
                    break;
            }
        
        }
        return organization;
    }
    
    public void deleteOrganization(Organization organization){
        organizationList.remove(organization);
    }
    
}

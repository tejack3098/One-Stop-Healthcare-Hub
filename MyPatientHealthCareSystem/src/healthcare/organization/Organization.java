/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.organization;

import healthcare.enterprise.Enterprise;
import healthcare.person.PersonDirectory;
import healthcare.role.Role;
import healthcare.userAccount.UserAccountDirectory;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public abstract class Organization {
    
    private String organizationName;
    private int organizationId ;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private static int counter;
    
    static{
        counter = 100;
    }
    
    public Organization(String organizationName) {
        this.organizationName = organizationName;
        this.personDirectory = new PersonDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.organizationId = counter;
        counter += 1;
    }
    
    public abstract ArrayList<Role> getSupportedRole();

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public int getOrganizationID() {
        return organizationId;
    }
    
    public String getOrganizationName() {
        return organizationName;
    }
    
    public enum OrganizationType {
        Administrator("Admin Organization", null),
        Doctor("Doctor Organization",Enterprise.EnterpriseType.HealthCare),
        Patient("Patient Organization", Enterprise.EnterpriseType.HealthCare),
        Nurse("Nurse Organization", Enterprise.EnterpriseType.HealthCare),
        Lab("Lab Organization", Enterprise.EnterpriseType.Lab),
        Pharmacy("Pharmacy Organization", Enterprise.EnterpriseType.Pharmacy),
        Supplier("SupplyChain Organization", Enterprise.EnterpriseType.SupplyChain),
        Vehicle("Vehicle Organization",Enterprise.EnterpriseType.SupplyChain),
        EmergencyUnit("Emergency Unit Organization",Enterprise.EnterpriseType.EmergencyUnit),
        Ambulance("Ambulance Organization",Enterprise.EnterpriseType.EmergencyUnit),
        DonorBank("DonorBank Organization",Enterprise.EnterpriseType.DonorBank),
        Vaccination("Vaccination Organization",Enterprise.EnterpriseType.Vaccination);
        
        private String value;
        private Enterprise.EnterpriseType enterprise;

        private OrganizationType(String value, Enterprise.EnterpriseType enterprise) {
            this.value = value;
            this.enterprise = enterprise;
        }

        public String getValue() {
            return value;
        }

        public Enterprise.EnterpriseType getEnterpriseType() {
            return enterprise;
        }
    } 
}

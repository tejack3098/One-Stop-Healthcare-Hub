/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise;

import healthcare.organization.Organization;
import healthcare.organization.OrganizationDirectory;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shriya
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String enterpriseName,EnterpriseType enterpriseType){
        super(enterpriseName);
        this.enterpriseType = enterpriseType;
        this.organizationDirectory = new OrganizationDirectory();
    }

    public enum EnterpriseType{
        HealthCare("HealthCare"),
        DonorBank("DonorBank"),
        Pharmacy("Pharmacy"),
        Lab("Lab"),
        EmergencyUnit("EmergencyUnit"),
        SupplyChain("SupplyChain"),
        Vaccination("Vaccination");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    
    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise;

import healthcare.enterprise.pharmacy.PharmacyEnterprise;
import healthcare.enterprise.supplyChain.SupplyChainEnterprise;
import healthcare.enterprise.lab.LabEnterprise;
import healthcare.Enterprise.donorBank.DonorBankEnterprise;
import healthcare.enterprise.healthCare.HealthCareEnterprise;
import java.util.ArrayList;

/**
 *
 * @author Shriya
 */
public class EnterpriseMasterDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseMasterDirectory() {
        this.enterpriseList = new ArrayList<Enterprise>();
    }
    
    public void removeEnterprise(Enterprise enterprise) {
        enterpriseList.remove(enterprise);
    }
    
    public Enterprise createAndAddEnterprise(Enterprise.EnterpriseType enterpriseType, String name) {
        
        Enterprise enterprise = null;

        if (Enterprise.EnterpriseType.HealthCare == enterpriseType) {
            enterprise = new HealthCareEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if (Enterprise.EnterpriseType.DonorBank == enterpriseType) {
            enterprise = new DonorBankEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if (Enterprise.EnterpriseType.Lab == enterpriseType) {
            enterprise = new LabEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if (Enterprise.EnterpriseType.Pharmacy == enterpriseType) {
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if (Enterprise.EnterpriseType.SupplyChain == enterpriseType) {
            enterprise = new SupplyChainEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
}

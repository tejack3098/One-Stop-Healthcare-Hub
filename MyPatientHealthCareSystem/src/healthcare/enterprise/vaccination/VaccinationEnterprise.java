/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.vaccination;

import healthcare.enterprise.Enterprise;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class VaccinationEnterprise extends Enterprise {
    
    public VaccinationEnterprise(String enterpriseName) {
        super(enterpriseName, Enterprise.EnterpriseType.SupplyChain);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

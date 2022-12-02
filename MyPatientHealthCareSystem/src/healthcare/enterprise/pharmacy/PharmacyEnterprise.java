/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.pharmacy;

import healthcare.enterprise.Enterprise;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shriya
 */
public class PharmacyEnterprise extends Enterprise {

    public PharmacyEnterprise(String enterpriseName) {
        super(enterpriseName,Enterprise.EnterpriseType.Pharmacy);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

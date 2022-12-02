/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.Enterprise.donorBank;

import healthcare.enterprise.Enterprise;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shriya
 */
public class DonorBankEnterprise extends Enterprise {

    public DonorBankEnterprise(String enterpriseName) {
        super(enterpriseName,Enterprise.EnterpriseType.DonorBank);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

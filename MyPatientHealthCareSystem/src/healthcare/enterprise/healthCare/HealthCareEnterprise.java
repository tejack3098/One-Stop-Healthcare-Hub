/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.healthCare;

import healthcare.enterprise.Enterprise;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shriya
 */
public class HealthCareEnterprise extends Enterprise{

    public HealthCareEnterprise(String enterpriseName) {
        super(enterpriseName,Enterprise.EnterpriseType.HealthCare);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

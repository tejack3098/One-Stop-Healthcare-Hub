/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.lab;

import healthcare.enterprise.Enterprise;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class LabEnterprise extends Enterprise {

    public LabEnterprise(String enterpriseName) {
        super(enterpriseName, Enterprise.EnterpriseType.Lab);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

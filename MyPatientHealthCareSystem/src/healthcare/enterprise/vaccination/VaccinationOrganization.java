/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.vaccination;

import healthcare.organization.Organization;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class VaccinationOrganization extends Organization{

    public VaccinationOrganization() {
        super(Organization.OrganizationType.Vaccination.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.emergencyUnit;

import healthcare.organization.Organization;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class EmergencyUnitOrganization extends Organization {
       
    private ArrayList<AmbulanceHandlerRole> ambulanceHandler;
    private ArrayList<Ambulance> ambulance;
    
    
    public EmergencyUnitOrganization() {
        super(Organization.OrganizationType.EmergencyUnit.getValue());
    }
        
    public ArrayList<AmbulanceHandlerRole> getAmbulanceHandler() {
        return ambulanceHandler;
    }

    public void setAmbulanceHandler(ArrayList<AmbulanceHandlerRole> ambulanceHandler) {
        this.ambulanceHandler = ambulanceHandler;
    }

    public ArrayList<Ambulance> getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(ArrayList<Ambulance> ambulance) {
        this.ambulance = ambulance;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

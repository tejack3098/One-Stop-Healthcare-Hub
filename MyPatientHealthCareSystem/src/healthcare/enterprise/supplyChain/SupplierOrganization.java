/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.supplyChain;

import healthcare.organization.Organization;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class SupplierOrganization extends Organization {
    
    private ArrayList<HandlerRole> handler;
    private ArrayList<Vehicle> vehicle;
    
    public SupplierOrganization() {
        super(Organization.OrganizationType.Supplier.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<HandlerRole> getHandler() {
        return handler;
    }

    public void setHandler(ArrayList<HandlerRole> handler) {
        this.handler = handler;
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
}

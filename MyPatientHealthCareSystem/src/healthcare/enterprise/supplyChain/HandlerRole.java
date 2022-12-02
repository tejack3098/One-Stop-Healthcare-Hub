/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.supplyChain;

import healthcare.role.Role;

/**
 *
 * @author Tejas
 */
public class HandlerRole extends Role {
    
    private Vehicle vehicle;
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

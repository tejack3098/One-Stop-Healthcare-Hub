/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.supplyChain;

/**
 *
 * @author Tejas
 */
public class Vehicle {
    private String vehicleName;
    private String vehicleNumber;
    private String vehicleType;
    private String vehicalDescription;

    public Vehicle(String vehicleName, String vehicleNumber, String vehicleType, String vehicalDescription) {
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.vehicalDescription = vehicalDescription;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicalDescription() {
        return vehicalDescription;
    }

    public void setVehicalDescription(String vehicalDescription) {
        this.vehicalDescription = vehicalDescription;
    }
    
    
}

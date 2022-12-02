/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.network;

import healthcare.enterprise.EnterpriseMasterDirectory;

/**
 *
 * @author Tejas
 */
public class Network {
    
    private String networkName;
    private EnterpriseMasterDirectory enterpriseMasterList;

    public Network() {
        this.enterpriseMasterList = new EnterpriseMasterDirectory();
    }

    public EnterpriseMasterDirectory getEnterpriseMasterList() {
        return enterpriseMasterList;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    @Override
    public String toString(){
        return this.networkName;
    }
       
}

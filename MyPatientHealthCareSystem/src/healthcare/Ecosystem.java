/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import healthcare.network.Network;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class Ecosystem {
    
    private static Ecosystem ecosystem;
    private ArrayList<Network> networkList;
    
    public static Ecosystem getEcosystemInstance(){
        if(ecosystem == null){
            ecosystem = new Ecosystem();
        }
        return ecosystem;
    }
}

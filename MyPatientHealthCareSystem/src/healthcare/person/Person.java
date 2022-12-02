/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.person;

/**
 *
 * @author Tejas
 */
public class Person {
    
    private String personName;
    int personId;
    private static int count;
    
    static{
        count = 100;
    }
    
    public Person(){
        personId = count;
        count +=1;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.person;

import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }
    
    public Person createAndAddPerson(String personName){
        Person person = new Person();
        person.setPersonName(personName);
        personList.add(person);
        return person;
    }
    
    public void removePerson(Person person){
        personList.remove(person);
    }
    
}

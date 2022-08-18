/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccineprogramgp;

/**
 *19.03.2022
 *Mark Cummins
 * x20400634
 */

//Class that allows for the assignment of a priority key to a person element
public class PQElement {
    
    private int key;
    private Person element;

    public PQElement(int priority, Person e) {
        key = priority;
        element = e;
    }

    //Getters and setters for the priority key and the person element
    public int getKey() {
        return key;
    }

    public void setKey(int val) {
        key = val;
    }

    public Person getElement() {
        return element;
    }

    public void setElement(Person e) {
        element = e;
    }
    
    //Will print the details of a person added to the system.
    public String printPerson() {
        String msg;
        msg = "Name: " + element.getName() + ", Age: " + element.getAge() + ", Medical Condition: " + element.getHasCond();
        return msg;
    }
}

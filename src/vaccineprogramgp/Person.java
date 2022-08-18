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

public class Person {

    private String name;
    //Boolean for if a person has a medical condition or not.
    private boolean hasCond;
    private String age;

    public Person() {
        name = new String();
        //Medical conditions will automatically be set to false.
        hasCond = false;
        age = new String();
    }

    //Getters and setters for the variables used in the person class.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getHasCond() {
        return hasCond;
    }

    public void setHasCond(boolean hasCond) {
        this.hasCond = hasCond;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

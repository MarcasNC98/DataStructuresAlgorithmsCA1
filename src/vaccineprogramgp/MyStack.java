/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccineprogramgp;

import java.util.ArrayList;

/**
 *19.03.2022
 *Mark Cummins
 * x20400634
 */
public class MyStack implements StackInterface {

    //Creates an ArrayList called noPriorityStack that will store people details before they are given a priority cohort.
    private ArrayList<Person> noPriorityStack;

    //Creates a new instance of the stack.
    public MyStack() {
        noPriorityStack = new ArrayList<Person>();
    }

    //Finds the size of the stack.
    public int size() {
        return noPriorityStack.size();
    }

    //Checks if the stack is empty.
    public boolean isEmpty() {
        return noPriorityStack.isEmpty();
    }

    //Will always return false as there is no limit on how many people can be stored in the stack.
    public boolean isFull() {
        return false;
    }

    //Will remove a person from the top of the stack if the stack is populated. Else, it will return nothing.
    public Object pop() {
        if (!(noPriorityStack.isEmpty())) {
            return noPriorityStack.remove(0);
        } else {
            return null;
        }
    }

    //Will add a person to the top of the stack.
    public void push(Object newItem) {
        noPriorityStack.add(0, (Person) newItem);
    }

    //Will return every person that is stored in the stack, displaying their details.
    public String displayStack() {
        Person p;
        int i;
        String s = new String();
        if (noPriorityStack.isEmpty()) {
            s = ("There are no people registered.");
        } else {
            for (i = 0; i < noPriorityStack.size(); i++) {
                p = noPriorityStack.get(i);
                s = s.concat("Name: " + p.getName() + ", Age: " + p.getAge() + ", Medical Condition: " + p.getHasCond() + "\n");
            }
        }
        return s;
    }
}

    


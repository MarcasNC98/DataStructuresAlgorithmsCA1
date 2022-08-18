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

//Interface for the stack containing unprioritised people.
public interface StackInterface {

    public boolean isEmpty();

    public boolean isFull();

    public void push(Object newItem);

    public Object pop();

    public int size();

    public String displayStack();
}

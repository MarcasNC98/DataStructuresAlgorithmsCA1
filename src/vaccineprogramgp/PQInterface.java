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

//Interface for the priority queue used to give people vaccine priority cohorts.
public interface PQInterface {

    public void enqueue(int key, Object element);

    public int size();

    public boolean isEmpty();

    public Object dequeue();

    public Object nextPerson();

}


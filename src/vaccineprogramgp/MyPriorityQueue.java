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
public class MyPriorityQueue implements PQInterface {
    
    //Creates an ArrayList for storing people who have been given a vaccine priority cohort.
    private final ArrayList<PQElement> originalPQ;
    
    //Creates a new instance of the priority queue.
    public MyPriorityQueue() {
        originalPQ = new ArrayList<>();
    }
    
    //Checks if the priority queue is empty.
    @Override
    public boolean isEmpty() {
        return originalPQ.isEmpty();
    }
    
    //Finds the size of the priority queue.
    @Override
    public int size() {
        return originalPQ.size();
    }
    
    //Will return the position in the priority queue of a priority key.
    private int findInsertPosition(int newkey) {
        boolean found;
        PQElement elem;
        int position;
        found = false;
        position = 0;
        while (position < originalPQ.size() && !found) {
            elem = originalPQ.get(position);
            if (elem.getKey() > newkey) {
                position = position + 1;
            } else {
                found = true;
            }
        }
        return position;
    }

 
    //Will add a person to the priority queue.
    public void enqueue(int priKey, Object item) {
        int index;

        PQElement pElem = new PQElement(priKey, (Person) item);

        index = findInsertPosition(priKey);

        if (index == size()) {
            originalPQ.add(pElem);
        } else {
            originalPQ.add(index, pElem);
        }
    }

    //Will remove the first element in the priority queue (the person with the highest priority).
    @Override
    public Object dequeue() {
        return originalPQ.remove(0);
    }
    
    //Will allow a person in the priority queue to be displayed before being removed from the queue, needed for my for-loop in 'Display Next Vaccine Group' to work.
    @Override
    public Object nextPerson() {
        return originalPQ.get(0);
    }
}

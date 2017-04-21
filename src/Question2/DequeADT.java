/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 * 
 * @author devey
 * @param <E> 
 */
interface DequeADT<E> {
    public void enqueueRear(E element);
    public E dequeueFront();
    public E first();
    public void enqueueFront (E element);
    public E dequeueRear();
    public E last();
    public boolean isEmpty();
    public int size();
}

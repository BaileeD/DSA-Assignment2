/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author devey
 */
public class Main {

    public static void main(String args[]) {
        ArrayDeque<Integer> array = new ArrayDeque<>();
        System.out.println("Beginning array deque: " + array);
        System.out.println("Is array empty: " + array.isEmpty());
        array.enqueueFront(6);
        System.out.println("Enqueue front: " + array);
        array.enqueueFront(3);
        System.out.println("Enqueue front: " + array);
        array.enqueueFront(7);
        System.out.println("Enqueue front: " + array);
        array.enqueueFront(1);
        System.out.println("Enqueue front: " + array);
        array.enqueueFront(9);
        System.out.println("Enqueue front: " + array);
        array.enqueueRear(4);
        System.out.println("Enqueue rear: " + array);
        array.enqueueRear(2);
        System.out.println("Enqueue rear: " + array);
        array.enqueueRear(8);
        System.out.println("Enqueue rear: " + array);
        System.out.println("Array size: " + array.size());
        array.dequeueFront();
        System.out.println("Dequeue front: " + array);
        array.dequeueFront();
        System.out.println("Dequeue front: " + array);
        array.dequeueRear();
        System.out.println("Dequeue rear: " + array);
        array.dequeueRear();
        System.out.println("Dequeue rear: " + array);
        System.out.println("First element: " + array.first());
        System.out.println("Last element: " + array.last());
        System.out.println("Is array empty: " + array.isEmpty());
        System.out.println("Array size: " + array.size());

        System.out.println("");

        LinkedDeque<Integer> linked = new LinkedDeque<>();
        System.out.println("Beginning linked deque: " + linked);
        System.out.println("Is linked deque empty: " + linked.isEmpty());
        linked.enqueueFront(6);
        System.out.println("Enqueue front: " + linked);
        linked.enqueueFront(3);
        System.out.println("Enqueue front: " + linked);
        linked.enqueueFront(7);
        System.out.println("Enqueue front: " + linked);
        linked.enqueueFront(1);
        System.out.println("Enqueue front: " + linked);
        linked.enqueueFront(9);
        System.out.println("Enqueue front: " + linked);
        linked.enqueueRear(4);
        System.out.println("Enqueue rear: " + linked);
        linked.enqueueRear(2);
        System.out.println("Enqueue rear: " + linked);
        linked.enqueueRear(8);
        System.out.println("Enqueue rear: " + linked);
        System.out.println("Linked deque size: " + linked.size());
        linked.dequeueFront();
        System.out.println("Dequeue front: " + linked);
        linked.dequeueFront();
        System.out.println("Dequeue front: " + linked);
        linked.dequeueRear();
        System.out.println("Dequeue rear: " + linked);
        linked.dequeueRear();
        System.out.println("Dequeue rear: " + linked);
        System.out.println("First element: " + linked.first());
        System.out.println("Last element: " + linked.last());
        System.out.println("Is linked deque empty: " + linked.isEmpty());
        System.out.println("Linked deque size: " + linked.size());
    }
}

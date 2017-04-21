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
public class ArrayDeque<E> implements DequeADT<E> {

    private final int INITIALSIZE = 15;
    private E[] elements;
    private int front = 0;
    private int rear = 0;
    private int numOfElements = 0;

    public ArrayDeque() {
        elements = (E[]) (new Object[INITIALSIZE]);
    }

    @Override
    public void enqueueRear(E element) {
        if (numOfElements == 0) {
            elements[0] = element;
            rear = 0;
            front = 0;
            numOfElements++;
        } else if (rear + 1 > INITIALSIZE - 1) {
            if (elements[0] == null) {
                elements[0] = element;
                rear = 0;
                numOfElements++;
            }

        } else {
            if (elements[rear + 1] == null) {
                elements[++rear] = element;
                numOfElements++;
            }
        }
    }

    @Override
    public E dequeueFront() {
        if (numOfElements > 0) {
            E beginning = elements[front];
            elements[front] = null;
            if (front + 1 > INITIALSIZE - 1) {
                front = 0;
            } else {
                front++;
            }
            numOfElements--;
            return beginning;
        }
        return null;
    }

    @Override
    public E first() {
        return elements[front];
    }

    @Override
    public void enqueueFront(E element) {
        if (numOfElements == 0) {
            elements[0] = element;
            rear = 0;
            front = 0;
            numOfElements++;
        } else if (front - 1 < 0) {
            if (elements[INITIALSIZE - 1] == null) {
                elements[INITIALSIZE - 1] = element;
                front = INITIALSIZE - 1;
                numOfElements++;
            }
        } else {
            if (elements[front - 1] == null) {
                elements[--front] = element;
                numOfElements++;
            }
        }
    }

    @Override
    public E dequeueRear() {
        if (numOfElements > 0) {
            E end = elements[rear];
            elements[rear] = null;
            if (rear - 1 < 0) {
                rear = INITIALSIZE - 1;
            } else {
                rear--;
            }
            numOfElements--;
            return end;
        }
        return null;
    }

    @Override
    public E last() {
        return elements[rear];
    }

    @Override
    public boolean isEmpty() {
        if (numOfElements > 0) {
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return numOfElements;
    }

    public String toString() {
        String ans = "[";
        int i = front;
        for (int j = 0; j < numOfElements; j++) {
            ans += elements[i].toString();
            if (i + 1 > INITIALSIZE - 1) {
                i = 0;
            } else {
                i++;
            }
            if (j < numOfElements - 1) {
                ans += ",";
            }
        }
        ans += "]";
        return ans;
    }
}

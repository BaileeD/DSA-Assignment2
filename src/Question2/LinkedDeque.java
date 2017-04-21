/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Collection;
import java.util.NoSuchElementException;

/**
 *
 * @author devey
 * @param <E>
 */
public class LinkedDeque<E> implements DequeADT<E> {

    private Node<E> front;
    private Node<E> rear;
    private int numOfElements = 0;

    public LinkedDeque() {
        super();
        numOfElements = 0;
        front = null;
        rear = null;
    }

    public LinkedDeque(Collection<? extends E> c) {
        this();
        for (E element : c) {
            enqueueRear(element);
        }
    }

    @Override
    public void enqueueRear(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.left  = rear;
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.right = newNode;
            rear = newNode;
        }
        numOfElements++;
    }

    @Override
    public E dequeueFront() throws NoSuchElementException {
        if (front != null) {
            E frontEle = front.element;
            front = front.right;
            numOfElements--;
            if (numOfElements == 0) {
                rear = null;
            }
            return frontEle;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public E first() throws NoSuchElementException {
        if (numOfElements > 0) {
            return front.element;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public void enqueueFront(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.right = front;
        if (front == null) {
            rear = newNode;
            front = newNode;
        } else {
            front.left = newNode;
            front = newNode;
        }
        numOfElements++;
    }

    @Override
    public E dequeueRear() throws NoSuchElementException {
        if (rear != null) {
            E rearEle = rear.element;
            rear = rear.left;
            rear.right = null;
            numOfElements--;
            if (numOfElements == 0) {
                front = null;
            }
            return rearEle;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public E last() {
        return rear.element;
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
        Node currentNode = front;
        while (currentNode != null) {
            ans += currentNode.element.toString();
            if (currentNode.right != null) {
                ans += ",";
            }
            currentNode = currentNode.right;
        }
        ans += "]";
        return ans;
    }
}
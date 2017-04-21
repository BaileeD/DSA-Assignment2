/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author devey
 * @param <E>
 */
public class LinkedRRSet<E extends Comparable<E>> extends LinkedSet<E> {

    public LinkedRRSet() {
        super();
    }

    @Override
    public boolean add(E o) {
        if (!(contains(o)) && o != null) {
            Node<E> newNode = new Node<>(o);
            if (firstNode == null || o.compareTo(firstNode.element) <= 0) {
                newNode.next = firstNode;
                firstNode = newNode;
            } else {
                Node<E> currentNode = firstNode;
                while (currentNode.next != null && o.compareTo(currentNode.next.element) >= 0) {
                    currentNode = currentNode.next;
                }
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                numElements++;
            }
            return true;
        }
        return false;
    }

    public void retain(E start, E end) {
        Node<E> current = firstNode;
        if (start != null) {
            while (current.next != null && start.compareTo(current.next.element) >= 0) {
                Node<E> temp = current.next;
                current.next = null;
                current = temp;
            }
        }
        firstNode = current;
        if (end != null) {
            while (current.next != null && end.compareTo(current.next.element) >= 0) {
                current = current.next;
            }
            while (current != null) {
                Node<E> temp = current.next;
                current.next = null;
                current = temp;
            }
        }
    }

    public void remove(E start, E end) {
        Node<E> current = firstNode;
        Node<E> link = null;
        if (start != null) {
            while (current.next != null && start.compareTo(current.next.element) > 0) {
                current = current.next;
            }
            link = current;
        }
        if (end != null) {
            while (current.next != null && end.compareTo(current.element) >= 0) {
                Node<E> temp = current.next;
                current.next = null;
                current = temp;
            }
            if (link == null) {
                firstNode = current;
            } else {
                link.next = current;
            }
        } else {
            while (current.next != null) {
                Node<E> temp = current.next;
                current.next = null;
                current = temp;
            }
            if (start == null && end == null) {
                firstNode = null;
            }
        }
    }
}

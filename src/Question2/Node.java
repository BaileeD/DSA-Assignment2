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
public class Node<E> {

        public E element;
        public Node<E> left;
        public Node<E> right;

        public Node(E element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }
}
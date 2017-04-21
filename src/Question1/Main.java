/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 * 
 * @author devey
 */
public class Main {
    public static void main(String args[]){
        LinkedSet<Integer> linkedSet = new LinkedSet();
        linkedSet.add(3);
        System.out.println("Adding 3 to the linked set..." + linkedSet);
        linkedSet.add(11);
        System.out.println("Adding 11 to the linked set..." + linkedSet);
        linkedSet.add(1);
        System.out.println("Adding 1 to the linked set..." + linkedSet);
        linkedSet.add(9);
        System.out.println("Adding 9 to the linked set..." + linkedSet);
        linkedSet.add(7);
        System.out.println("Adding 7 to the linked set..." + linkedSet);
        linkedSet.add(5);
        System.out.println("Adding 5 to the linked set..." + linkedSet);
        System.out.println("The linked set is: "+linkedSet);
        
        System.out.println("");
        
        LinkedRRSet<Integer> linkedRRSet = new LinkedRRSet();
        linkedRRSet.add(3);
        System.out.println("Adding 3 to the linked RR set..." + linkedRRSet);
        linkedRRSet.add(11);
        System.out.println("Adding 11 to the linked RR set..." + linkedRRSet);
        linkedRRSet.add(1);
        System.out.println("Adding 1 to the linked RR set..." + linkedRRSet);
        linkedRRSet.add(9);
        System.out.println("Adding 9 to the linked RR set..." + linkedRRSet);
        linkedRRSet.add(7);
        System.out.println("Adding 7 to the linked RR set..." + linkedRRSet);
        linkedRRSet.add(5);
        System.out.println("Adding 5 to the linked RR set..." + linkedRRSet);
        linkedRRSet.add(7);
        System.out.println("Adding 7 to the linked RR set..." + linkedRRSet);
        System.out.println("The linked RR set is: "+linkedRRSet);
        
        System.out.println("");
        
        System.out.println("Retaining 3 to 9...");
        linkedRRSet.retain(3, 9);
        System.out.println("The linked RR set is: "+linkedRRSet);
        
        System.out.println("");
        
        System.out.println("Removing 5 to 7");
        linkedRRSet.remove(5, 7);
        System.out.println("The linked RR set is: "+linkedRRSet);
        
    }
}

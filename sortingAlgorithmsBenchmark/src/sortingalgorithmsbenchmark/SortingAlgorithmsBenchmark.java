/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

/**
 *
 * @author enrique
 */
import Structures.SimpleList;

import sortingalgorithmsbenchmark.BubbleSort;
import sortingalgorithmsbenchmark.ShellSort;
import sortingalgorithmsbenchmark.InsertionSort;
import sortingalgorithmsbenchmark.RadixSort;

public class SortingAlgorithmsBenchmark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleList<Integer> l=new SimpleList<>();
       
        l.insert(552174, 0);
        l.insert(35, 1);
        l.insert(190, 2);
        l.insert(1, 3);
        l.insert(2, 4);
        l.insert(3, 5);
        l.insert(14, 6);
        l.insert(500, 7);
        l.insert(3, 8);
        l.insert(6, 9);
        l.insert(78, 10);
        l.insert(42, 11);
        l.insert(0, 12);
        l.insert(456, 13);

       
    /*   l.insert(7, 0);
       l.insert(1024, 1);
       l.insert(78, 2);
       l.insert(3, 3);
       l.insert(56, 4);
       l.insert(21, 5);
       l.insert(32, 6);
       l.insert(4, 7);
       l.insert(41, 8);
       l.insert(9, 9);
     */  
       
       
        l.print();
       BubbleSort b=new BubbleSort(l);
        InsertionSort in=new InsertionSort(l);
        ShellSort sh=new ShellSort(l);
        RadixSort r=new RadixSort(l);
        
        System.out.println("BubbleSort");
        b.print();
        System.out.println("InsertionSort");
        in.print();
        System.out.println("ShellSort");
        sh.print();
        System.out.println("RadixSort");
        r.print();
    }
    
}

    


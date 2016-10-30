/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithmsbenchmark;

/**
 *
 * @author enrique
 */
import Structures.SimpleList;

import sortingalgorithmsbenchmark.BubbleSort;
import sortingalgorithmsbenchmark.ShellSort;
import sortingalgorithmsbenchmark.InsertionSort;
import sortingalgorithmsbenchmark.RadixSort;
import sortingalgorithmsbenchmark.QuickSort;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleList<Integer> l=new SimpleList<>();
       
        l.insert(47,0);
        l.insert(1650, 1);
        l.insert(0, 2);
        l.insert(1, 3);
        l.insert(8, 4);
        l.insert(3, 5);
        l.insert(14, 6);
        l.insert(15, 7);
        l.insert(16, 8);
        l.insert(5643, 9);
        l.insert(7654, 10);
        l.insert(4232, 11);
        l.insert(4, 12);
        l.insert(4560, 12);
        l.insert(7276, 0);
        l.insert(1290, 1);
        l.insert(38, 2);
        l.insert(38, 3);
        l.insert(98, 4);
        l.insert(27, 5);
        l.insert(5649, 6);
        l.insert(9876, 7);
        l.insert(2313, 8);
        l.insert(5678, 9);
     
       
       
       // l.print();
        BubbleSort b=new BubbleSort(l);
        InsertionSort in=new InsertionSort(l);
        ShellSort sh=new ShellSort(l);
        RadixSort r=new RadixSort(l);
        QuickSort q=new QuickSort(l);
        
        System.out.println("BubbleSort");
        b.print();
        System.out.println("InsertionSort");
        in.print();
        System.out.println("ShellSort");
        sh.print();
        System.out.println("RadixSort");
        r.print();
       System.out.println("QuickSort");
       q.print();

    }
    
}


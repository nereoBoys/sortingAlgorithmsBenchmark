/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithmsbenchmark;

import Structures.SimpleList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enrique
 */
public class BubbleSortTest {
    
    public BubbleSortTest() {
    }

    /**
     * Test of _BubbleSort method, of class BubbleSort.
     */
    @Test
    public void test_BubbleSort() {
        System.out.println("_BubbleSort");
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
        BubbleSort instance = new BubbleSort(l);
        SimpleList<Integer> expResult = l;
        SimpleList<Integer> result = instance._BubbleSort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class BubbleSort.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
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
        BubbleSort instance = new BubbleSort(l);
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

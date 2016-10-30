/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithmsbenchmark;

import Structures.GenericNode;
import Structures.SimpleList;

/**
 *
 * @author enrique
 */
public class QuickSort <T extends Comparable> {
    
    SimpleList<T> list;
    
    public QuickSort(SimpleList<T> pDato){
        list=pDato;
        _QuickSort();
    }
    
     /**
     * Metodo encargado de ordenar la lista mediante QuickSort
     * @return un lista simple ordenada
     */
    public SimpleList<T> _QuickSort(){
        GenericNode<T> tmp=list.getHead();
        GenericNode<T> tmp2=list.getHead();
        GenericNode<T> tmp3=list.getHead();
        GenericNode<T> tmp4=list.getHead();
        
        
    }
    
    
}

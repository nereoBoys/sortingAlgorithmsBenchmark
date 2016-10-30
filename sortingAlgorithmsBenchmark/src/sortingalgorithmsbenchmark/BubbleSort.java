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

import Structures.GenericNode;
import Structures.SimpleList;

public class BubbleSort<T extends Comparable> {
    
    private SimpleList<T> list;
    
    public BubbleSort(SimpleList<T> pDato){
        list=pDato;
        _BubbleSort();
    }
    
    /**
     * Metodo encargado de ordenar la lista mediante BubbleSort
     * @return un lista simple ordenada
     */
    public SimpleList<T> _BubbleSort(){
    
        boolean estado=true;
        int cont=0;
        GenericNode<T> tmp;
        
        while(true){
            if(cont==list.size()-1){
                if(estado==false){
                    cont=0;
                    estado=true;
                }else{
                    break;
                }
            }else{
                if(cont==0){
                    //System.out.println("EEEEE");
                    //System.out.println(cont);
                    if(list.returnNode(cont).getData().compareTo(list.returnNode(cont+1).getData())==-1){
                        /*System.out.println("QQQQQ");
                        System.out.println(list.returnNode(cont).getData());
                        System.out.println(list.returnNode(cont+1).getData());
                        */
                        tmp=list.returnNode(cont+1);
                        list.returnNode(cont).setNext(tmp.getNext());
                        tmp.setNext(list.returnNode(cont));
                        list.setHead(tmp);
                        
                        //System.out.println(list.getHead().getData());
                        cont+=1;
                        estado=false;
                        //System.out.println("DDD");
                        //list.print();
                        //System.out.println("DDD");
                    }else{
                        //System.out.println("PPPPP");
                        cont+=1;
                    }
                }
                else {
                   if(list.returnNode(cont).getData().compareTo(list.returnNode(cont+1).getData())==-1){
                        //System.out.println("SSS");
                        //list.print();
                        //System.out.println("SSS");
                        //System.out.println(cont);
                        tmp=list.returnNode(cont+1);
                        list.returnNode(cont).setNext(tmp.getNext());
                        tmp.setNext(list.returnNode(cont));
                        list.returnNode(cont-1).setNext(tmp);
                        cont+=1;
                        estado=false;
                        //System.out.println("HHH");
                        //list.print();
                        //System.out.println("HHH");
                }else{
                       //System.out.println("AAAAA");
                       //System.out.println(cont);
                       cont+=1;
                }
            }
        }
    }
        return list;
    }
    
    /**
     * Metodo que muestra como se encuentra conformada la lista
     */
    public void print() {
		GenericNode<T> tmp = list.returnNode(0);
		while (tmp != null){
			System.out.println(tmp.getData());
			//System.out.println(tmp.get_Dato());
			tmp = tmp.getNext();
		}

	}
    
}

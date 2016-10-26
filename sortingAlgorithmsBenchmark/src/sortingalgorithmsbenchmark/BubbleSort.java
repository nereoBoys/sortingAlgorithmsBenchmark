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

public class BubbleSort {
    
    private SimpleList<Integer> list;
    
    public BubbleSort(SimpleList<Integer> pDato){
    
        list=pDato;
        boolean estado=true;
        int cont=0;
        GenericNode<Integer> tmp=new GenericNode<>(0);
        
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
                    if(list.returnNode(cont).getData()>list.returnNode(cont+1).getData()){
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
                   if(list.returnNode(cont).getData()>list.returnNode(cont+1).getData()){
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
    }
    
    public void print() {
		GenericNode<Integer> tmp = list.returnNode(0);
		while (tmp != null){
			System.out.println(tmp.getData());
			//System.out.println(tmp.get_Dato());
			tmp = tmp.getNext();
		}

	}
    
}

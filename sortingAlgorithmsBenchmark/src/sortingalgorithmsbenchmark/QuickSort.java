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
        GenericNode<T> pivot=list.getHead();
        
        //System.out.println("EEEEE");
        //System.out.println(list.getHead().getData());
        //System.out.println(" ");
        
        int i=0; // variable que recorre la lista de izquierda a derecha buscando mayores al pivot
        int j=list.size()-1;//variable que recorre la lista de derecha a izquierda buscando menores
        //a al pivot
        int bandera=1;// variable que indica de donde hacia donde continua la comparacion
        
        while(i!=j){
            if(bandera==1){
                            /*System.out.println("11111111");
                            System.out.println(pivot.getData());
                            System.out.println(list.returnNode(i).getData());
                            System.out.println(list.returnNode(j).getData());
                            System.out.println(i);
                            System.out.println(j);
                */
                            //System.out.println(list.find_pos(pivot));
                        if(list.returnNode(j).getData().compareTo(pivot.getData())==-1
                                && j-list.find_pos(pivot)==1 ){
                            //System.out.println("IOIO");
                            tmp=pivot;
                            tmp2=list.returnNode(j);
                            tmp3=list.returnNode(j-1);
                            tmp2.setNext(tmp.getNext());
                            tmp3.setNext(tmp);
                            tmp.setNext(tmp2);
                            pivot=tmp3.getNext();
                            i+=1;
                            bandera=0;
           
                            
                        }else if(list.returnNode(j).getData().compareTo(pivot.getData())==-1 
                                && j-list.find_pos(pivot)>=2 ){
                            //System.out.println("IxIx");
                            tmp=pivot;
                            tmp2=list.returnNode(list.find_pos(pivot)-1);
                            tmp3=list.returnNode(j);
                            tmp4=list.returnNode(j-1);
                            tmp4.setNext(tmp3.getNext());
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4.getNext());
                            tmp2.setNext(tmp3);
                            tmp4.setNext(tmp);
                            pivot=tmp4.getNext();
                            i+=1;
                            bandera=0;
                            //System.out.println("listo");
                        /*}else if(list.returnNode(j).getData().compareTo(pivot.getData())==0 
                                && j-list.find_pos(pivot)>=2 ){
                            //System.out.println("IxIX");
                            tmp=pivot;
                            tmp2=list.returnNode(list.find_pos(pivot)-1);
                            tmp3=list.returnNode(j);
                            tmp4=list.returnNode(j-1);
                            tmp4.setNext(tmp3.getNext());
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4.getNext());
                            tmp2.setNext(tmp3);
                            tmp4.setNext(tmp);
                            pivot=tmp4.getNext();
                            i+=1;
                            bandera=0;
                        }else if(list.returnNode(j).getData().compareTo(pivot.getData())==0 
                                && j-list.find_pos(pivot)==1 ){
                            //System.out.println("IoIO");
                            tmp=pivot;
                            tmp2=list.returnNode(j);
                            tmp3=list.returnNode(j-1);
                            tmp2.setNext(tmp.getNext());
                            tmp3.setNext(tmp);
                            tmp.setNext(tmp2);
                            pivot=tmp3.getNext();
                            i+=1;
                            bandera=0;*/
                        }else{
                            //System.out.println("IMIM");
                            j-=1;
                        }
                    
                    }
            if(bandera==0){
                /*System.out.println("2222222");
                System.out.println(pivot.getData());
                System.out.println(i);
                System.out.println(j);
                System.out.println(list.find_pos(pivot));
                System.out.println(list.returnNode(i).getData());
                System.out.println(list.returnNode(j).getData());
                            */
                        if(list.returnNode(i).getData().compareTo(pivot.getData())==1 
                                && i-list.find_pos(pivot)==1 ){
                            //System.out.println("ZZZZ");
                            tmp=pivot;
                            tmp2=list.returnNode(i);
                            tmp3=list.returnNode(i-1);
                            tmp2.setNext(tmp.getNext());
                            tmp3.setNext(tmp);
                            tmp.setNext(tmp2);
                            pivot=tmp3.getNext();
                            j-=1;
                            bandera=1;
                            
                        }else if(list.returnNode(i).getData().compareTo(pivot.getData())==1 
                                && i-list.find_pos(pivot)>=2 ){
                            //System.out.println("LLL");
                            tmp=pivot;
                            tmp2=list.returnNode(list.find_pos(pivot)-1);
                            tmp3=list.returnNode(i);
                            tmp4=list.returnNode(i-1);
                            tmp4.setNext(tmp3.getNext());
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4.getNext());
                            tmp2.setNext(tmp3);
                            tmp4.setNext(tmp);
                            pivot=tmp4.getNext();
                            j-=1;
                            bandera=1;
                       /* }else if(list.returnNode(i).getData().compareTo(pivot.getData())==0 
                                && i-list.find_pos(pivot)==1 ){
                            //System.out.println("DDDD");
                            tmp=pivot;
                            tmp2=list.returnNode(i);
                            tmp3=list.returnNode(i-1);
                            tmp2.setNext(tmp.getNext());
                            tmp3.setNext(tmp);
                            tmp.setNext(tmp2);
                            pivot=tmp3.getNext();
                            j-=1;
                            bandera=1;
                            
                        }else if(list.returnNode(i).getData().compareTo(pivot.getData())==0 
                                && i-list.find_pos(pivot)>=2 ){
                            //System.out.println("PPPP");
                            tmp=pivot;
                            tmp2=list.returnNode(list.find_pos(pivot)-1);
                            tmp3=list.returnNode(i);
                            tmp4=list.returnNode(i-1);
                            tmp4.setNext(tmp3.getNext());
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4.getNext());
                            tmp2.setNext(tmp3);
                            tmp4.setNext(tmp);
                            pivot=tmp4.getNext();
                            j-=1;
                            bandera=1;*/
                        }else{
                            //System.out.println("WWWW");
                            i+=1;
                        }
                    
                    }
                }      
                if(list.inOrder()){
                    return list;
                }else{
                    return _QuickSort(); 
                }
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
            
        
    
        
        
    
    
    


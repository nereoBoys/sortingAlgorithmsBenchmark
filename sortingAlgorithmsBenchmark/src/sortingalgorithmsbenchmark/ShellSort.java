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

public class ShellSort <T extends Comparable>{
    
    SimpleList<T> list;
    
    public ShellSort(SimpleList<T> pDato){
        list=pDato;
        _ShellSort();
    }
    
    /**
     * Metodo encargado de ordenar la lista mediante ShellSort
     * @return un lista simple ordenada
     */
    public SimpleList<T>_ShellSort(){
        
        GenericNode<T> tmp=list.getHead();
        GenericNode<T> tmp2=list.getHead();
        GenericNode<T> tmp3=list.getHead();
        GenericNode<T> tmp4=list.getHead();
        
        int gap=(list.size())/2;
        
        int cont=0;
        
        while(gap!=0){
            /*System.out.println("else");
            System.out.println(list.size());
            System.out.println(cont);*/
            if(cont+gap==list.size()){
                //System.out.println("sobrepasa");
                cont=0;
                gap-=1;
                
            }else{
                
                if (cont==0){
                    if(list.returnNode(cont).getData().compareTo(list.returnNode(cont+gap).getData())==-1&&
                           (cont+gap)-cont==1){
                        /*System.out.println("QQQQQ");
                        System.out.println(list.returnNode(i).getData());
                        System.out.println(list.returnNode(i+1).getData());
                        */
                        tmp=list.returnNode(cont+gap);
                        list.returnNode(cont).setNext(tmp.getNext());
                        tmp.setNext(list.returnNode(cont));
                        list.setHead(tmp);
                        cont+=1;
                    
                    }
                    else if(list.returnNode(cont).getData().compareTo(list.returnNode(cont+gap).getData())==-1 
                        && (cont+gap)-cont>2){
                        /*System.out.println("QQQQQ");
                        System.out.println(list.returnNode(cont).getData());
                        System.out.println(list.returnNode(cont+gap).getData());*/
                        /*
                        System.out.println(list.returnNode(i).getData());
                        System.out.println(list.returnNode(i+1).getData());
                        */
                        tmp=list.returnNode(cont+gap);
                        tmp2=list.returnNode((cont+gap)-1);
                        tmp3=list.returnNode(cont);
                        tmp4=list.returnNode(cont+1);
                        tmp3.setNext(tmp.getNext());
                        tmp.setNext(tmp4);
                        tmp2.setNext(tmp3);
                        list.setHead(tmp);
                        cont+=1;
                        
                        
                        //System.out.println(list.getHead().getData());
                       // System.out.println("DDD");
                        /*System.out.println("list");
                        list.print();*/
                        //System.out.println("DDD");
                    }
                else if(list.returnNode(cont).getData().compareTo(list.returnNode(cont+gap).getData())==-1
                        && (cont+gap)-cont==2){
                            tmp=list.returnNode(cont+gap);
                            tmp2=list.returnNode((cont+gap)-1);
                            tmp3=list.returnNode(cont);
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp2);
                            tmp2.setNext(tmp3);
                            list.setHead(tmp);
                            cont+=1;
                }
                else{
                    cont+=1;
                }
            }else{
                    if(list.returnNode(cont).getData().compareTo(list.returnNode(cont+gap).getData())==-1
                            && (cont+gap)-cont==1 ){
                            /*System.out.println("CCCC");    
                            System.out.println(list.returnNode(cont).getData());
                            System.out.println(list.returnNode(cont+gap).getData());
                        */
                            tmp=list.returnNode(cont+gap);
                            tmp2=list.returnNode(cont);
                            tmp3=list.returnNode(cont-1);
                            tmp2.setNext(tmp.getNext());
                            tmp3.setNext(tmp);
                            tmp.setNext(tmp2);
                            cont+=1;
                            
                           /* System.out.println("list");
                            list.print();*/
                            
                        }else if(list.returnNode(cont).getData().compareTo(list.returnNode(cont+gap).getData())==-1
                                && (cont+gap)-cont>=2 ){
                            //System.out.println(gap);
                           /* System.out.println("WWWWWW");
                            System.out.println(list.returnNode(cont).getData());
                            System.out.println(list.returnNode(cont+gap).getData());*/
                            tmp=list.returnNode(cont+gap);
                            tmp2=list.returnNode((cont+gap)-1);
                            tmp3=list.returnNode(cont);
                            tmp4=list.returnNode(cont-1);
                            tmp4.setNext(tmp3.getNext());
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4.getNext());
                            tmp2.setNext(tmp3);
                            tmp4.setNext(tmp);
                            cont+=1;
                            /*
                            System.out.println("list");
                            list.print();*/
                        }
                        else{
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

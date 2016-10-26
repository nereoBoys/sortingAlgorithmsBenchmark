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

public class ShellSort {
    
    SimpleList<Integer> list;
    
    public ShellSort(SimpleList<Integer> pDato){
        
        list=pDato;
        GenericNode<Integer> tmp=list.getHead();
        GenericNode<Integer> tmp2=list.getHead();
        GenericNode<Integer> tmp3=list.getHead();
        GenericNode<Integer> tmp4=list.getHead();
        
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
                    if(list.returnNode(cont).getData()>list.returnNode(cont+gap).getData()&&
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
                    else if(list.returnNode(cont).getData()>list.returnNode(cont+gap).getData() 
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
                else if(list.returnNode(cont).getData()>list.returnNode(cont+gap).getData()
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
                    if(list.returnNode(cont).getData()>list.returnNode(cont+gap).getData()
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
                            
                        }else if(list.returnNode(cont).getData()>list.returnNode(cont+gap).getData()
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

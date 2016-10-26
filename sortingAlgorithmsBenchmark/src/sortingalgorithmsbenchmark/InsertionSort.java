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

public class InsertionSort {
    SimpleList<Integer> list;
    
    
    public InsertionSort(SimpleList<Integer> pDato){
        
        list=pDato;
        GenericNode<Integer> tmp=list.getHead();
        GenericNode<Integer> tmp2=list.getHead();
        GenericNode<Integer> tmp3=list.getHead();
        GenericNode<Integer> tmp4=list.getHead();

        //System.out.println(list.size());
        for(int i=1;i<list.size();i++){
            if (i==1){
                if(list.returnNode(i-1).getData()>list.returnNode(i).getData()){
                        /*System.out.println("QQQQQ");
                        System.out.println(list.returnNode(i).getData());
                        System.out.println(list.returnNode(i+1).getData());
                        */
                        tmp=list.returnNode(i);
                        list.returnNode(i-1).setNext(tmp.getNext());
                        tmp.setNext(list.returnNode(i-1));
                        list.setHead(tmp);
                        
                        //System.out.println(list.getHead().getData());
                       // System.out.println("DDD");
                        //list.print();
                        //System.out.println("DDD");
                    }
            }else{
                for(int j=0;j<i;j++){
                    if(j==0){
                       /* System.out.println("i y j");
                        System.out.println(i);
                        System.out.println(j);
*/
                        if(list.returnNode(j).getData()>list.returnNode(i).getData()&& i-j==2){
                            tmp=list.returnNode(i);
                            tmp2=list.returnNode(i-1);
                            tmp3=list.returnNode(j);
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp2);
                            tmp2.setNext(tmp3);
                            list.setHead(tmp);
                    }
                        else if(list.returnNode(j).getData()>list.returnNode(i).getData()&& i-j>2){
                            tmp=list.returnNode(i);
                            tmp2=list.returnNode(i-1);
                            tmp3=list.returnNode(j);
                            tmp4=list.returnNode(j+1);
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4);
                            tmp2.setNext(tmp3);
                            list.setHead(tmp);
                            
                        }
                    }else{
                        if(list.returnNode(j).getData()>list.returnNode(i).getData()&& i-j==1 ){
                            tmp=list.returnNode(i);
                            tmp2=list.returnNode(j);
                            tmp3=list.returnNode(j-1);
                            tmp2.setNext(tmp.getNext());
                            tmp3.setNext(tmp);
                            tmp.setNext(tmp2);
                            
                        }else if(list.returnNode(j).getData()>list.returnNode(i).getData()&& i-j>=2 ){
                            tmp=list.returnNode(i);
                            tmp2=list.returnNode(i-1);
                            tmp3=list.returnNode(j);
                            tmp4=list.returnNode(j-1);
                            tmp4.setNext(tmp3.getNext());
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4.getNext());
                            tmp2.setNext(tmp3);
                            tmp4.setNext(tmp);
                        }
                    
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


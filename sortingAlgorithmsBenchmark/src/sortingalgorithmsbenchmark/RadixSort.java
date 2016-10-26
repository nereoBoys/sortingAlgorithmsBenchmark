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
import Structures.GenericNode;
import java.lang.Math.*;

public class RadixSort {

    SimpleList<Integer> list;
    
    public RadixSort(SimpleList<Integer> pDato){
    
        list=pDato;
        GenericNode<Integer> tmp=list.getHead();
        GenericNode<Integer> tmp2=list.getHead();
        GenericNode<Integer> tmp3=list.getHead();
        GenericNode<Integer> tmp4=list.getHead();
        
        boolean estado=true;
        int cont=1;
        int cont2=0;
        
        while(true){
            /*System.out.println("else");
            System.out.println(list.size());
            System.out.println(cont);*/
            if(cont2==list.size()-1){
                //System.out.println("sobrepasa");
                if(estado==false){
                    cont+=1;
                    cont2=0;
                    estado=true;
                }else{
                    break;
                }
            }else{
                
                if (cont2==0){
                    if((list.returnNode(cont2).getData()%Math.pow(10, cont))>
                            (list.returnNode(cont2+1).getData()%Math.pow(10, cont))
                            &&(cont2+1)-cont2==1){
                        //System.out.println("QQQQQ");
                        //System.out.println(cont);
                        /*
                        System.out.println(list.returnNode(i).getData());
                        System.out.println(list.returnNode(i+1).getData());
                        */
                        tmp=list.returnNode(cont2+1);
                        list.returnNode(cont2).setNext(tmp.getNext());
                        tmp.setNext(list.returnNode(cont2));
                        list.setHead(tmp);
                        cont2+=1;
                        //System.out.println("list");
                        //list.print();
                        estado=false;
                        
                    
                    }
                    else if((list.returnNode(cont2).getData()%Math.pow(10, cont))>
                            (list.returnNode(cont2+1).getData()%Math.pow(10, cont))
                        && (cont2+1)-cont2>2){
                        //System.out.println("KKK");
                        //System.out.println(cont);
/*
                        System.out.println(list.returnNode(cont).getData());
                        System.out.println(list.returnNode(cont+gap).getData());*/
                        /*
                        System.out.println(list.returnNode(i).getData());
                        System.out.println(list.returnNode(i+1).getData());
                        */
                        tmp=list.returnNode(cont2+1);
                        tmp2=list.returnNode((cont2+1)-1);
                        tmp3=list.returnNode(cont2);
                        tmp4=list.returnNode(cont2+1);
                        tmp3.setNext(tmp.getNext());
                        tmp.setNext(tmp4);
                        tmp2.setNext(tmp3);
                        list.setHead(tmp);
                        cont2+=1;
                        //System.out.println("list");
                        //list.print();
                        estado=false;                        
                        //System.out.println(list.getHead().getData());
                       // System.out.println("DDD");
                        /*System.out.println("list");
                        list.print();*/
                        //System.out.println("DDD");
                    }
                else if((list.returnNode(cont2).getData()%Math.pow(10, cont))>
                        (list.returnNode(cont2+1).getData()%Math.pow(10, cont))
                        && (cont2+1)-cont2==2){
                            tmp=list.returnNode(cont2+1);
                            tmp2=list.returnNode((cont2+1)-1);
                            tmp3=list.returnNode(cont2);
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp2);
                            tmp2.setNext(tmp3);
                            list.setHead(tmp);
                            cont2+=1;
                           /* System.out.println("PPPPP");
                            System.out.println(cont);

                            System.out.println("list");
                            list.print();*/
                            estado=false;

                }
                else{
                    cont2+=1;
                }
            }else{
                    if((list.returnNode(cont2).getData()%Math.pow(10, cont))>
                        (list.returnNode(cont2+1).getData()%Math.pow(10, cont))
                        && (cont2+1)-cont2==1 ){
                        //System.out.println("CCCC"); 
                        //System.out.println(cont);
/*  
                        System.out.println(list.returnNode(cont).getData());
                        System.out.println(list.returnNode(cont+gap).getData());
                        */
                        tmp=list.returnNode(cont2+1);
                        tmp2=list.returnNode(cont2);
                        tmp3=list.returnNode(cont2-1);
                        tmp2.setNext(tmp.getNext());
                        tmp3.setNext(tmp);
                        tmp.setNext(tmp2);
                        cont2+=1;
                            
                        //System.out.println("list");
                        //list.print();
                        estado=false;
                            
                        }else if((list.returnNode(cont2).getData()%Math.pow(10, cont))>
                                (list.returnNode(cont2+1).getData()%Math.pow(10, cont))
                                && (cont2+1)-cont2>=2 ){
                            //System.out.println(gap);
                            //System.out.println("WWWWWW");
                            //System.out.println(cont);
/*
                            System.out.println(list.returnNode(cont).getData());
                            System.out.println(list.returnNode(cont+gap).getData());*/
                            tmp=list.returnNode(cont2+1);
                            tmp2=list.returnNode((cont2+1)-1);
                            tmp3=list.returnNode(cont2);
                            tmp4=list.returnNode(cont2-1);
                            tmp4.setNext(tmp3.getNext());
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4.getNext());
                            tmp2.setNext(tmp3);
                            tmp4.setNext(tmp);
                            cont2+=1;
                            
                            //System.out.println("list");
                            //list.print();
                            estado=false;

                        }
                        else{
                            cont2+=1;
                        }
        }
        
    }
}
    
    
    }
    
    public int Max(){
        int max=0;
        for(int i=0;i<list.size();i++){
           if(Exp(list.returnNode(i).getData())>max){
               max=Exp(list.returnNode(i).getData());
           } 
        }
        
        return max;
    }
    
    
    public int Exp(int pDato){
        int res=0;
        int num=pDato;
        while(num!=0){
            num=num/10;
            res+=1;
        }
        return res;
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


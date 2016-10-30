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
        _QuickSort(list);
        
    }
    
     /**
     * Metodo encargado de ordenar la lista mediante QuickSort
     * @return un lista simple ordenada
     */
    public SimpleList<T> _QuickSort(SimpleList<T> pDato){
        
        SimpleList<T> list=pDato;
        GenericNode<T> tmp;
        GenericNode<T> tmp2;
        GenericNode<T> tmp3;
        GenericNode<T> tmp4;
        GenericNode<T> pivot=list.getHead();
        
        //System.out.println("EEEEE");
        //System.out.println(list.getHead().getData());
        //System.out.println(" ");
        
        int i=0; // variable que recorre la lista de izquierda a derecha buscando mayores al pivot
        int j=list.size()-1;//variable que recorre la lista de derecha a izquierda buscando menores
        //a al pivot
        int bandera=1;// variable que indica de donde hacia donde continua la comparacion
        
        while(i!=j){
            //System.out.println("iguales");
            //System.out.println(i==j);
            
            if(bandera==1){
                /*System.out.println("11111111");
                            System.out.println(pivot.getData());
                            System.out.println(list.returnNode(i).getData());
                            System.out.println(list.returnNode(j).getData());
                            System.out.println(i);
                            System.out.println(j);
                            System.out.println(list.find_pos(pivot.getData()));
                */
                if(list.returnNode(j).getData().compareTo(pivot.getData())==-1
                                && j-list.find_pos(pivot.getData())==1 && pivot==list.getHead()){
                            //System.out.println("IOIo");
                            
                        tmp=list.returnNode(j);
                        pivot.setNext(tmp.getNext());
                        tmp.setNext(pivot);
                        list.setHead(tmp);
                        i+=1;
                        bandera=0;
                        
                }else if(list.returnNode(j).getData().compareTo(pivot.getData())==-1 && 
                        j-list.find_pos(pivot.getData())>=2 && pivot==list.getHead()){
                            //System.out.println("77777");
                            tmp=list.returnNode(list.find_pos(pivot.getData()));
                            tmp2=list.returnNode(j);
                            tmp3=list.returnNode(j-1);
                            tmp4=list.returnNode(list.find_pos(pivot.getData())+1);
                            tmp.setNext(tmp2.getNext());
                            tmp3.setNext(tmp);
                            tmp2.setNext(tmp4);
                            list.setHead(tmp2);
                            i+=1;
                            bandera=0;
                            
                }else if(list.returnNode(j).getData().compareTo(pivot.getData())==-1
                                && j-list.find_pos(pivot.getData())==1){
                            //System.out.println("IOIO");
                            tmp=pivot;
                            tmp2=list.returnNode(j);
                            tmp3=list.returnNode(list.find_pos(pivot.getData())-1);
                            tmp.setNext(tmp2.getNext());
                            tmp2.setNext(tmp);
                            tmp3.setNext(tmp2);
                            pivot=tmp2.getNext();
                            i+=1;
                            bandera=0;
           
                            
                }else if(list.returnNode(j).getData().compareTo(pivot.getData())==-1 
                                && j-list.find_pos(pivot.getData())>=2 ){
                            //System.out.println("IxIx");
                            tmp=pivot;
                            tmp2=list.returnNode(list.find_pos(pivot.getData())-1);
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
                            /*
                        }else if(list.returnNode(j).getData().compareTo(pivot.getData())==0 
                                && j-list.find_pos(pivot.getData())>=2 ){
                            System.out.println("IxIX");
                            tmp=pivot;
                            tmp2=list.returnNode(list.find_pos(pivot.getData())-1);
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
                                && j-list.find_pos(pivot.getData())==1 ){
                            System.out.println("IoIO");
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
                    
        }else if(bandera==0){
                /*System.out.println("2222222");
                System.out.println(pivot.getData());
                System.out.println(list.getHead().getData());
                System.out.println(i);
                System.out.println(j);
                System.out.println(list.find_pos(pivot.getData()));
                System.out.println(list.returnNode(i).getData());
                System.out.println(list.returnNode(j).getData());
                System.out.println(i-list.find_pos(pivot.getData()));
                            */
                        if(list.returnNode(i).getData().compareTo(pivot.getData())==1 
                                && list.find_pos(pivot.getData())-1==1 ){
                           // System.out.println("ZZZZ");
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
                                && list.find_pos(pivot.getData())-1>=2 ){
                            //System.out.println("LLL");
                            tmp=pivot;
                            tmp2=list.returnNode(list.find_pos(pivot.getData())-1);
                            tmp3=list.returnNode(i);
                            tmp4=list.returnNode(i-1);
                            tmp4.setNext(tmp3.getNext());
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4.getNext());
                            tmp2.setNext(tmp3);
                            tmp4.setNext(tmp);
                            pivot=tmp4.getNext();
                            j-=1;
                            bandera=1;/*
                        }else if(list.returnNode(i).getData().compareTo(pivot.getData())==0 
                                && i-list.find_pos(pivot.getData())==1 ){
                            System.out.println("DDDD");
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
                                && i-list.find_pos(pivot.getData())>=2 ){
                            System.out.println("PPPP");
                            tmp=pivot;
                            tmp2=list.returnNode(list.find_pos(pivot.getData())-1);
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
                } /*     
                if(list.inOrder()){
                    
                    
                    return list;
                }*/
               /*
                    SimpleList<T> listMenores=new SimpleList<>();
                    SimpleList<T> listMayores=new SimpleList<>();
                    int contMayores=0;
                    for(int k=0;i<list.find_pos(pivot.getData());k++){
                        listMenores.insert(list.returnNode(k).getData(),k);
                    }
                    for(int z=list.find_pos(pivot.getData())+1;z<list.size();z++){
                        listMayores.insert(list.returnNode(z).getData(),contMayores);
                        contMayores+=1;
                    }
               */   //list=_RadixSortAux(list);
                    return list;
                }
            
    
    
    /**
     * Metodo que muestra como se encuentra conformada la lista
     */
     public void print(){
		GenericNode<T> tmp = list.returnNode(0);
		while (tmp != null){
			System.out.println(tmp.getData());
			//System.out.println(tmp.get_Dato());
			tmp = tmp.getNext();
		}

	}
     
     
     public SimpleList<T> _RadixSortAux(SimpleList<T> pDato){
        System.out.println("AKSjkljalk");
        pDato.print();
        SimpleList<T> lista=pDato;
        GenericNode<T> tmp=list.getHead();
        GenericNode<T> tmp2=list.getHead();
        GenericNode<T> tmp3=list.getHead();
        GenericNode<T> tmp4=list.getHead();

        //System.out.println(list.size());
        for(int i=1;i<lista.size();i++){
            if (i==1){
                //>
                if(lista.returnNode(i-1).getData().compareTo(lista.returnNode(i).getData())==-1){
                        /*System.out.println("QQQQQ");
                        System.out.println(list.returnNode(i).getData());
                        System.out.println(list.returnNode(i+1).getData());
                        */
                        tmp=lista.returnNode(i);
                        lista.returnNode(i-1).setNext(tmp.getNext());
                        tmp.setNext(lista.returnNode(i-1));
                        lista.setHead(tmp);
                        
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
                        if(lista.returnNode(j).getData().compareTo(lista.returnNode(i).getData())==-1 && i-j==2){
                            tmp=lista.returnNode(i);
                            tmp2=lista.returnNode(i-1);
                            tmp3=lista.returnNode(j);
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp2);
                            tmp2.setNext(tmp3);
                            lista.setHead(tmp);
                    }
                        else if(lista.returnNode(j).getData().compareTo(lista.returnNode(i).getData())==-1 && i-j>2){
                            tmp=lista.returnNode(i);
                            tmp2=lista.returnNode(i-1);
                            tmp3=lista.returnNode(j);
                            tmp4=lista.returnNode(j+1);
                            tmp3.setNext(tmp.getNext());
                            tmp.setNext(tmp4);
                            tmp2.setNext(tmp3);
                            lista.setHead(tmp);
                            
                        }
                    }else{
                        if(lista.returnNode(j).getData().compareTo(lista.returnNode(i).getData())==-1 && i-j==1 ){
                            tmp=lista.returnNode(i);
                            tmp2=lista.returnNode(j);
                            tmp3=lista.returnNode(j-1);
                            tmp2.setNext(tmp.getNext());
                            tmp3.setNext(tmp);
                            tmp.setNext(tmp2);
                            
                        }else if(lista.returnNode(j).getData().compareTo(lista.returnNode(i).getData())==-1 && i-j>=2 ){
                            tmp=lista.returnNode(i);
                            tmp2=lista.returnNode(i-1);
                            tmp3=lista.returnNode(j);
                            tmp4=lista.returnNode(j-1);
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
        return lista;
    }
    
    }
            
        
    
        
        
    
    
    


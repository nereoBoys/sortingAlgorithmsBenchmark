/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structures;

/**
 *
 * @author enrique
 */
public class SimpleList<T> implements GenericList<T> {
     private GenericNode<T> _head;

	public SimpleList(){
		this._head = null;
		
	}
	
	/**
	 * Metodo que inserta segun posicion
	 */
	
	@Override
	public void insert(T pDato, int pPos) {
		if (pPos <= size() + 1)    {
            GenericNode<T> nuevo = new GenericNode<>(pDato);
            if (pPos == 0){
                nuevo.setNext(_head);
                _head = nuevo;
            }else if (pPos == -1){
            	if(size() == 0){
                    _head = nuevo;
            	}else{
            		GenericNode<T> tmp = _head;
                    while (tmp.getNext()!= null) {
                        tmp = tmp.getNext();
                    }
                    tmp.setNext(nuevo);
            	}
            }else
                if (pPos == size() + 1)    {
                    GenericNode<T> tmp = _head;
                    while (tmp.getNext()!= null) {
                        tmp = tmp.getNext();
                    }
                    tmp.setNext(nuevo);
                  
//                    nuevo.set_next(null);
                }else {
                    GenericNode<T> tmp = _head;
                    for (int i = 0 ; i <= pPos - 2 ; i++)
                        tmp = tmp.getNext();
                    GenericNode<T> siguiente = tmp.getNext();
                    tmp.setNext(nuevo);
                   
                    nuevo.setNext(siguiente);
                }
		}
	}
	/**
	 * Metodo que Borra al final
	 */
	@Override
	public T delete(int pPos) {
		 if (pPos <= size())    {
	            if (pPos == 1) {
	                _head = _head.getNext();
	            } else {
	                GenericNode<T> tmp = _head;
	                for (int i = 1 ; i <= pPos - 2 ; i++)
	                    tmp = tmp.getNext();
	                GenericNode<T> siguiente = tmp.getNext();
	                siguiente = siguiente.getNext();
	                tmp.setNext(siguiente);
	            }
	        }
			return null;   
	}
	
	
	/**
	 * Metodo que busca un elemento
	 */
	@Override
	public T search(T pDato) {
        GenericNode<T> tmp = _head;
        while (tmp != null){
        	if(tmp.getData() == pDato){
        		System.out.println("Encontrado: "+tmp.getData());
        		return tmp.getData();
        	}
        	else
        		tmp = tmp.getNext();
        }
        return null;
	}
	
	/**
	 * Metodo que imprime la lista 
	 */
	@Override
	public void print() {
		GenericNode<T> tmp = _head;
		while (tmp != null){
			System.out.println(tmp.getData());
			//System.out.println(tmp.get_Dato());
			tmp = tmp.getNext();
		}

	}
	

	@Override
	/**
	 * Metodo que obtiene el valor del atributo _Dato de un nodo en una lista
	 * @return retorna el atributo _Dato de un nodo en una lista de acuerdo a un indice
	 *  dado en la lista
	 */
	public T returnPos(int pPos) {
		if(size() != 0){
			GenericNode<T> tmp = _head;
			for(int i=0; pPos <= size() && i < pPos;i++){
				tmp = tmp.getNext();
			}return (T) tmp.getData();
		}
		return null;
	}
	
	@Override
	/**
	 * Metodo que devuelve un nodo en la lista de acuerdo en una posicion dada
	 * @return retorna un nodo de acuerdo a una posicion dada 
	 */
	public GenericNode<T> returnNode(int pPos) {
		if(size() != 0){
			GenericNode<T> tmp = _head;
			for(int i=0; pPos <= size() && i < pPos;i++){
				tmp = tmp.getNext();
			}return tmp;
		}
		return null;
	}

	/**
	 * 
	 * Metodo que obtiene el tamaño de la lista
	 *@return retorna el largo (tamaño) de la lista 
	 */
	
	@Override
	public int size() {
		int cant = 0;
        GenericNode<T> tmp = _head;
        while (tmp != null) {
            tmp = tmp.getNext();
            cant++;
        }
        return cant;
	}

    public GenericNode<T> getHead() {
        return _head;
    }
    
    public void setHead(GenericNode<T> pDato){
        _head=pDato;
    }

}

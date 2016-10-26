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
public class GenericNode<T> {
    private T _data;
    private GenericNode<T> _next;
	
	public GenericNode(T pDato){
		this._data = pDato;
		this._next = null;
	}
	/*
	 * Metodo que retorna el atributo _data
	 * @return _data
	 */
	public T getData() {
		return _data;
	}
	/**
	 * Metodo que establece un valor para el atributo _dato
	 * @param pData
	 */
	public void setData(T pData) {
		this._data = pData;
	}
	/**
	 * Metodo que obtiene el atributo _next del nodo, este atributo
	 * _next hace una referencia al siguiente nodo que esta conectado a un determinado 
	 * nodo 
	 * @return un objeto de tipo nodo 
	 */
	public GenericNode<T> getNext() {
		return _next;
	}
	/**
	 *  Metodo que estblece un valor para el atributo _next del nodo, este atributo
	 * _next hace una referencia al siguiente nodo que esta conectado a un determinado 
	 * nodo
	 * @param pNext
	 */
	public void setNext(GenericNode<T> pNext) {
		this._next = pNext;
	}
	
}

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
public interface GenericList<T> {
     public void insert(T pDato, int pPos);
	public int size();
	public T returnPos(int pPos);
	public GenericNode<T> returnNode(int pPos);
	public T delete(int pPos);
	public T search(T pDato);
	public void print();
       
}



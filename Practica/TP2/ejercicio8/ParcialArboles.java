package Practica.TP2.ejercicio8;

import Practica.TP2.ejercicio1.BinaryTree;

public class ParcialArboles {
	
		
	public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		if(arbol1.isEmpty() || arbol2.isEmpty()) 
			return arbol1.isEmpty() && arbol2.isEmpty();
		return esPrefijoHelper(arbol1,arbol2);
	}
	
	private boolean esPrefijoHelper(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		if(arbol1.getData() != arbol2.getData()) {
			return false;
		}
		boolean res = true;
		if(arbol1.hasLeftChild()) {
			if(arbol2.hasLeftChild()) {
				res = res && esPrefijoHelper(arbol1.getLeftChild(), arbol2.getLeftChild());
			}else return false;
		}
		if(arbol1.hasRightChild()) {
			if(arbol2.hasRightChild()) {
				res = res && esPrefijoHelper(arbol1.getRightChild(), arbol2.getRightChild());
			}else return false;
		}
		return res;
	}
	
	

}

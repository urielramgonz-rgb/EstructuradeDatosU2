package listas.simples;
/**
*Elemento nodo de una lista
*@author Uriel Ramirez
*@date 15 Octubre
*/

public class Nodo{

	private int valor;
	private Nodo sig;

	public int getValor(){
		return valor;
	}

	public void setValor(int valor){
		this.valor = valor;
	}

	public Nodo getSig(){
		return sig;
	}

	public void setSig(Nodo sig){
		this.sig = sig;
	}

	

}
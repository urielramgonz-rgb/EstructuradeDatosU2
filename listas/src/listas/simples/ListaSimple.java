package listas.simples;
/**
*Definicion de una lista simple
*author Uriel Ramírez
*@date 15 octubre 2026
*/
public class ListaSimple{
	private Nodo cabeza;

	public ListaSimple(){
		this.cabeza = null;
	}
    	public void insertarAlInicio(int valor) {
        	Nodo nuevo = new Nodo();
        	nuevo.setValor(valor);
        	nuevo.setSig(cabeza);
        	cabeza = nuevo;
    	}

       	public void recorrer() {
        Nodo actual = cabeza;
        
        if (actual == null) {
            System.out.println("Lista vacía");
            return;
        }

        while (actual != null) {
            System.out.print("[" + actual.getValor() + "] -> ");
            actual = actual.getSig();
        }
        System.out.println("null");
    }
}

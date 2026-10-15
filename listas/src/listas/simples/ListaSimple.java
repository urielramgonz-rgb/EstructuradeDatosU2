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
		if (cabeza == null){
			Nodo t = new Nodo(valor);
			Cabeza = t;

		}
	}

    	public void recorrer() {
        Nodo actual = cabeza;

	while (actual != null) {
            System.out.print("[" + actual.getValor() + "] -> ");
            actual = actual.getSig();
        }
        System.out.println("null");
        
    }
}

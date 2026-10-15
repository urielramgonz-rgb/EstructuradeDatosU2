package listas.simples;
/**
*Main
*@author Uriel Ramírez
*@Date 15 agosto 2026
*/
public class Main {
    public static void main(String[] args) {
	ListaSimple lista = new ListaSimple();
        lista.insertarAlInicio(10);
        lista.recorrer();

        lista.insertarAlInicio(20);
        lista.recorrer();

        lista.insertarAlInicio(30);
        lista.recorrer();
    }
}

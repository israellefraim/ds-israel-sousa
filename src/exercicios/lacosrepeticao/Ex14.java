package exercicios.lacosrepeticao;

import java.util.ArrayList;

public class Ex14
{
	public static void main(String[] args) {
	    ArrayList<Integer> lista = new ArrayList<>();
	    
	    lista.add(0);
	    lista.add(1);
	    int i = 1;
	    
	    do {
	        i++;
	        lista.add(lista.get(i-1) + lista.get(i-2));
	    } while (lista.get(i) <= 500);
	    
	    for (int num : lista) System.out.print(num + " ");
	}
}
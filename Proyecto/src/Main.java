import java.util.*;


public class Main {



	private static void Imprimir(Map mapita){
		
		for(int i = 0 ; i < 5 ; i ++){
			System.out.println(i+1 + " - " + mapita.get(i));
		}
	}

    public static void main(String[] args) {

	Map<Integer,String> mapita = new HashMap<>();
	int contador = 0;

        System.out.println("Inicio del programa.\n");

        System.out.println("Miembros del curso:");
        

        mapita.put(contador,"Diego.");
	contador++;
        mapita.put(contador,"Marta.");
	contador++;
        mapita.put(contador,"Pedro.");
	contador++;
        mapita.put(contador,"Ivan.");
	contador++;
        mapita.put(contador,"Manu.");

	Imprimir(mapita);

        System.out.println("\nFinal del programa.");
    }
}

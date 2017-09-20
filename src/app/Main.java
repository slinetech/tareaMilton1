package app;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public Main() {
		menu();
	}
	@SuppressWarnings("resource")
	public void menu(){
		Scanner keyboard=
				new Scanner(
						new InputStreamReader(System.in));
		String contines;
		Matriz m;
		do {
			int res;
			System.out.println("1) Hacer un método que genere una matriz n x m , en la cual asigne ceros a todos "+
					"los elementos, excepto a los de la diagonal principal donde asignaran unos.");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("2) Codificar un programa que genere una matriz n x m con ceros en la diagonal principal hacia arriba.");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("3) Dada una matriz de M*M elementos, hacer un programa que construya un vector B, donde cada"
					+" uno de sus componentes sea la suma de los elementos de valores numéricos pares de las filas de la matriz.");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("4) Escribir un programa que lea las dimensiones de una matriz, lea y visualice la matriz y a"
					+" continuación encuentre el mayor y menor elemento de la matriz y sus posiciones.");
			System.out.println("---------------------------------------------------------------------------------");
			res=keyboard.nextInt();
			switch (res) {
				case 1:
					m= new Matriz();
					m.diagonal();
					break;
				case 2:
					m= new Matriz();
					m.diagonalInvertida();
					break;
				case 3:
					m= new Matriz();
					m.paresEnVector();
					break;
				case 4:
					m= new Matriz();
					m.mayMenor();
					break;
				default:
					System.out.println("NO SE ENCONTRO ESA OPCION");
					break;
			}
			System.out.println("Desea escoger otra opcion?(Y/N)");
			contines=keyboard.next();
		} while (!contines.equalsIgnoreCase("n"));
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Main main = new Main();
	}
}

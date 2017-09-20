	package app;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Matriz {
	
	private Scanner keyboard;
	private int f;
	private int c;
	private int[][] matriz;
	public Matriz() {	
		keyboard = 
				new Scanner(new InputStreamReader(System.in));
		System.out.print("Numero de filas: ");
		this.f=keyboard.nextInt();
		System.out.print("Numeros de Colmnas: ");
		this.c=keyboard.nextInt();
	}
	
	public void diagonal(){
		if (f == c) {
			matriz=new int[f][c];
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (j == i) {
						matriz[i][j]=1;
					}else{
						matriz[i][j]=0;
					}
				}
			}
			printArray(matriz);
		}else{
			System.out.println("NO TIENE DIAGONAL");
		}
	}
	
	public void diagonalInvertida(){
		if (f == c) {
			matriz=new int[f][c];
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (j == this.f-1) {
						matriz[i][j]=0;
						this.f--;
					}else{
						matriz[i][j]=1;
					}
				}
			}
			printArray(matriz);
		}else{
			System.out.println(" NO TIENE DIAGONAL INVERTIDA");
		}
	}
	public void paresEnVector(){
		if (f == 0 && c == 0) {
			System.out.print("Numero de filas: ");
			this.f=keyboard.nextInt();
			System.out.print("Numeros de Colmnas: ");
			this.c=keyboard.nextInt();
		}
		this.matriz=new int[f][c];
		llenarMatriz(matriz);
		int[] sumaFila = new int[f];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if ( isPar(matriz[i][j]) ) {
					sumaFila[i]+=matriz[i][j];
				}
			}
		}
		printArray(matriz);
		for (int i = 0; i < sumaFila.length; i++) {
			System.out.println("La suma de la fila " + (i+1) + " es: " + sumaFila[i]);
		}
	}
	
	public void mayMenor(){
		matriz= new int[f][c];
		System.out.println("\n1)LLENAR LA MATRIZ MANULMENTE");
		System.out.println("2)LLENAR LA MATRIZ CON VALORES POR DEFAULT\n");
		int res=this.keyboard.nextInt();
		if (res == 1) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j]=keyboard.nextInt();
				}
			}
		}else if (res == 2) {
			llenarMatriz(matriz);
		}else{
			System.out.println("\nOPCION NO ENCONTRADA");
			System.out.println("Desea Intentarlo nueva mente?\n1) SI\n2) NO");
			res = keyboard.nextInt();
			if (res == 1) {
				mayMenor();
			}
		}
		printArray(matriz);
		
		int may=matriz[0][0];
		String posMay="";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]>may) {
					may=matriz[i][j];
					posMay="("+(i+1)+","+(j+1)+")";
				}
			}
		}
		 System.out.println ("El numero maximo es : "+may+" en la posicion "+ posMay);
		 int men=may;
		 String posMen="";
		 for (int i=0; i<matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j]<men){
				   men=matriz[i][j];
				   posMen="("+(i+1)+","+(j+1)+")";
				}
			}
		  }
		 System.out.println ("EL numero minimo es : "+men+" en la posicion "+ posMen);
	}
	//Llenar la matriz
	public void llenarMatriz(int[][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int) (Math.random()*50);
			}
		}
	}
	//Conocer si un numero es pares
	public boolean isPar(int number){
		if(number % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	//Print Array
	public void printArray(int[][] matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}
	public Scanner getKeyboard() {
		return keyboard;
	}
}

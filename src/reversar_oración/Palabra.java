package reversar_oración;

import java.util.Scanner;

public class Palabra {
	String oración;
	String palabra;
	String oración2;
	int numero_espacios;
	int contador;
	String vector[];
	
	
	public Palabra() {
		Scanner Oración=new Scanner(System.in);
		System.out.println("Escribe la oracion");
		this.oración = Oración.nextLine(); // CAPTURAR TEXTO
		this.palabra=""; // capturador de String
		this.numero_espacios=1; // espacio del vector por numero de espacios en blanco
		Oración.close();
	}
	
	public void reversa() {
		
		for(int i=0; i<oración.length();i++) {
			if(oración.charAt(i) == ' ' ) { //capturar los espacios en blanco
				numero_espacios++;
			}
		}
		
		
		vector = new String[numero_espacios]; // asignar el espacio del vector
		this.numero_espacios=0; // se utiliza de nuevo la variable y se inicializa en 0
		
		for(int a=0;a<oración.length();a++) {
			if(oración.charAt(a) != ' ' ) {
				palabra= palabra+oración.charAt(a); //asignar palabras al vector
				vector[numero_espacios]=palabra;
			}else {
				this.palabra=""; // SE BORRA LA PALABRA cuando halla un espacio
				numero_espacios++; // SE AUMENTA EL indice del vector
			}
		}
		
		
		
		for(int j=vector.length-1;j>=0;j--) {
			System.out.print(vector[j]+" "); // se invirte el vector y se le asigana espacio
		}
	}
}

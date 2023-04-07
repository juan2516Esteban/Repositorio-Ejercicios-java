package java_Task;

import java.util.Scanner;

public class Kata_Task {
	private int edad;
	
	
	public Kata_Task(){

		Scanner numeros=new Scanner(System.in);
		
		System.out.println("Por favor ingresa una edad");
		this.edad = numeros.nextInt();
		
		numeros.close();
	}
	
	public int Get_Edad() {
		
		return edad;
	}
	
	public void Set_Edad(int Set_Edad) {
		this.edad = Set_Edad;
		System.out.print("Se cambio la edad a: "+edad);
		System.out.println("");
	}
	
	public void mostrar_edad(Human_Years humano,CatYears gato,DogYears perro){
		System.out.print("la edad del humano es: "+humano.Get_Edad()+
				" la edad del gato es "+ gato.Caular_edad()
				+" la edad del perro es "+ perro.Caular_edad());
	}
}




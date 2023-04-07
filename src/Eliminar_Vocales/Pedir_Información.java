package Eliminar_Vocales;

import java.util.Scanner;

public class Pedir_Información {
	String Texto;
	String Texto_Sin_Vocales;
	
	public Pedir_Información() {
		
		Scanner oración=new Scanner(System.in);
		System.out.println("Escribe la frase a modificar sin vocales");
		this.Texto = oración.nextLine();
		this.Texto_Sin_Vocales = "";
		oración.close();
	}
	
	public String eliminar_vocales() {
		
		for(int i=0;i<Texto.length();i++) {
			
			if(Texto.charAt(i)!= 'a' && Texto.charAt(i)!= 'A' && 
				Texto.charAt(i)!= 'e'  && Texto.charAt(i)!= 'E' && 
				Texto.charAt(i)!= 'o' && Texto.charAt(i)!= 'O' &&
				Texto.charAt(i)!= 'u' && Texto.charAt(i)!= 'U' &&
				Texto.charAt(i)!= 'i'  && Texto.charAt(i)!= 'I' ) {
				
			
				Texto_Sin_Vocales = Texto_Sin_Vocales+Texto.charAt(i);
				
			}
		}
		
		System.out.print(Texto_Sin_Vocales);
		return Texto_Sin_Vocales;
	}
}

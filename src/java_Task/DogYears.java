package java_Task;

public class DogYears extends Animales {
	
	public DogYears(Kata_Task edad){
	super(edad);
	}
	
public int Caular_edad() {
		
		if(calcular == 1) {
			edad = 15;
			return edad;
		}else if(calcular== 2) {
			edad= edad+9;
			return edad;
		}
		else if(calcular<1) {
			System.out.println("numero menor a 1 ERROR ");
			return 1;
		}
		else {
			edad=edad+9;
			for(int i =3;i<=calcular;i++) {
				edad= edad+5;
				}
			return edad;
		}
	
	}
}

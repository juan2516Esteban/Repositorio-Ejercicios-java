package java_Task;

public class Animales {
	protected int edad;
	protected int calcular;
	
	public Animales(Kata_Task edades) {
		this.calcular = edades.Get_Edad();
		this.edad = 15;
	}
	
	protected int Caular_edad() {
		
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
			edad= edad+4;
			}
			return edad;
		}
	
	}
}

package java_Task;

public class Human_Years {
	int edad;
	
	public Human_Years(Kata_Task ObjetoEdad) {
		this.edad = ObjetoEdad.Get_Edad();
	}
	
	int Get_Edad() {
		return edad;
	}
	
	void Set_Edad(int Edad) {
		this.edad = Edad;
		System.out.println("Se cambio la Edad del humano a: "+edad);
	}
}

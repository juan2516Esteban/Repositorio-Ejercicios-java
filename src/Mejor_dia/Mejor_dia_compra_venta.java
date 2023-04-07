package Mejor_dia;

public class Mejor_dia_compra_venta {
	int vector [] = {17,3,6,9,15,8,6,1,10};
	int valor;
	int ganacia_mayor;
	int vector_ganacia[];
	
	public Mejor_dia_compra_venta() {
		this.valor=0;
		this.ganacia_mayor=0;
		vector_ganacia = new int[2];
	}
	
	public void mejor_dia() {
		for(int i=0;i<vector.length;i++) {
			
			for(int j=i+1;j<vector.length;j++) {
				
				if(vector[i]<vector[j]) {
					valor=vector[j]-vector[i];
					
					if(valor>ganacia_mayor) {
						ganacia_mayor = valor;
						vector_ganacia[0] = i;
						vector_ganacia[1] = j;
					}
				}
			}
		}
		
		System.out.println(ganacia_mayor);
		System.out.println(vector_ganacia[0]+ ","+ vector_ganacia[1]);
		System.out.print("El mejor dia para comprar es el: "+(vector_ganacia[0]+1)+
				" con un precio de "+vector[vector_ganacia[0]]+
				" Y el mejor dia para vender es: "+(vector_ganacia[1]+1)+
				" con un precio de: "+vector[vector_ganacia[1]]);
	}
}

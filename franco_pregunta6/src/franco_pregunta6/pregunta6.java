package franco_pregunta6;

import java.util.Scanner;


public class pregunta6 {

	public static int leer(String mensaje) {
		Scanner teclado= new Scanner (System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}

	public static void main(String[] args) {
		int dimension=leer("ingrese la dimension del vector:");
		int[]numeros=new int[dimension];
		for(int i=0;i<dimension;i++) {
			numeros[i]=leer("ingrese el numero"+(i+1)+"del vector");
		}
		
		int[]m=new int[dimension-3];
		int[]n=new int[dimension-3];
		int[]promax=new int[4];
		for(int i=0 ; i<dimension-7;i++) {
			m[i]=numeros[i]*numeros[i+1]*numeros[i+2]*numeros[i+3];
			n[i]=numeros[i+4]*numeros[i+5]*numeros[i+6]*numeros[i+7];
			promax[i]= Math.max(m[i], n[i]);
			
		}
		
		for(int i=0;i<dimension-7;i++) {
			if(promax[i]<m[i]) {
				promax[i]=numeros[i];
				System.out.println("vector mayor:"+promax[i]);
			}
			else if (promax[i]<n[i]) {
				promax[i]=numeros[i+4];
				System.out.println("vector mayor:"+promax[i]);
			}
		}
	}
}

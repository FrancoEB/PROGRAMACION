package franco_pregunta5;


	import java.util.Scanner;

	public class pregunta5 {
		
		public static String leer (String mensaje) {
			Scanner teclado=new Scanner (System.in);
			System.out.println(mensaje);
			return teclado.nextLine();
			
		}
		public static void main (String[] args) {
			String palabra= leer("ingrese la palabra :");
			char[]vector=new char[palabra.length()];
			
		for(int i=0; i<palabra.length();i++) {
			vector[i]=palabra.charAt(i);
		}
		for(int i=0;i<palabra.length();i++)
		System.out.println(vector[i]);
		
		char[] m=new char[palabra.length()];
		char[] n=new char[palabra.length()];
		for(int i=0; i<palabra.length();i++) {
			m[i]=vector[i];
			n[i]=vector[palabra.length()-(++i)];
			
		}
			for(int i=0;i<palabra.length();i++) {
				if(m[i]!=n[i])
					System.out.println("no es palindroma");
				else
					System.out.println("si es palidroma");
					
			}
					
		}
		
	}




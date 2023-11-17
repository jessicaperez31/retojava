import java.util.*;
public class Ejercicio2_NumeroPositivo {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		
		System.out.println("INTRODUZCA UN NUMERO POSITIVO: ");
		int numero=entrada.nextInt();
		
		while(numero<=0) {
			
			System.out.println("EL NUMERO INTRODUCIDO NO ES CORRECTO. INTENTALO DE NUEVO.");
			System.out.println("INTRODUZCA UN NUMERO POSITIVO.");
			numero=entrada.nextInt();
			
		}
		
		System.out.println("LOS PRIMEROS 20 NUMEROS SUCESIVOS SON: ");
		
		for(int i=1;i<=20;i++) {
			
			System.out.println(numero + i);
		}
		entrada.close();
	}

}

import java.util.*;
public class Ejercicio4_AscendenteDescendente {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Ingrese el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = entrada.nextInt();

        
        System.out.print("Ingrese el orden (ascendente o descendente): ");
        String orden = entrada.next();

        System.out.println("Números ordenados en " + orden + " orden:");

        if ("ascendente".equalsIgnoreCase(orden)) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else if ("descendente".equalsIgnoreCase(orden)) {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        } else {
            System.out.println("Orden no válido. Por favor, ingrese 'ascendente' o 'descendente'.");
        }

        entrada.close();
		
		
	}

}

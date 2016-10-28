package dia281016;

import java.util.Scanner;

public class CalculadoraSimples {

	public CalculadoraSimples() {
			int n1, n2;
			System.out.println("Introduza dois numeros");
			n1 = (new Scanner(System.in)).nextInt();
			n2= (new Scanner(System.in)).nextInt();
			
			System.out.println("A soma dos dois numeros e: " + (n1+n2));
	}

}

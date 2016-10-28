package dia281016;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNum {
	int escondido;
	final int VALORMAX = 5;
	
	public AdivinhaNum() {
		Random r = new Random();
		escondido = r.nextInt(VALORMAX);
		
		tentarAdivinhar();
	}
	
	public void tentarAdivinhar() {
		int n;
		System.out.println("Qual o seu numero?");
		n = new Scanner(System.in).nextInt();
		if (n > escondido) {
			System.out.println("O numero escondido e menor");
		} else if (n < escondido) {
			System.out.println("O numero escondido e maior");
		} else {
			System.out.println("Acertaste!!! Here's a potato medal O");
		}
	}

}

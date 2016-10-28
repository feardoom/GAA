package dia281016;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNum {
	int escondido;
	final int VALORMAX = 100;
	final int TENTATIVAS = 7;
	
	public AdivinhaNum() {
		Random r = new Random();
		escondido = r.nextInt(VALORMAX);
		
		for (int i=1;i<=TENTATIVAS;i++) {
			tentarAdivinhar();
		}
	}
	
	public void tentarAdivinhar() {
		int n;
		System.out.println("Qual o seu numero entre 0 e " + VALORMAX + "?");
		n = readInt();
		if (n > escondido) {
			System.out.println("O numero escondido e menor");
		} else if (n < escondido) {
			System.out.println("O numero escondido e maior");
		} else {
			System.out.println("Acertaste!!! Here's a potato medal O");
		}
	}
	
	public int readInt() {
		return new Scanner(System.in).nextInt();
	}

}

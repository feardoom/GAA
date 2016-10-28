package dia281016;

import java.util.Scanner;

public class BalancoGAA {
	int totalReceitas;
	int totalDespesas;
	
	public BalancoGAA() {
		
		calcularReceitas();
		System.out.println("O total de receitas é: €" + totalReceitas + "\n");
		calcularDespesas();
		System.out.println("O total de despesas é: €" + totalDespesas);
		
		System.out.println("\nO balanço final é: €" + (totalReceitas - totalDespesas));
	}
	
	public void calcularReceitas() {
		int quotas ,recBaile,recBar;
		
		System.out.println("Qual foi o seu valor de quotas?");
		quotas = new Scanner(System.in).nextInt();
		System.out.println("Qual foi a sua receita do baile?");
		recBaile = new Scanner(System.in).nextInt();
		System.out.println("Qual foi a seu receita do bar?");
		recBar = new Scanner(System.in).nextInt();
		
		totalReceitas = quotas + recBaile + recBar;
	}
	
	public void calcularDespesas() {
		int agua, luz, telefone;
		
		System.out.println("Quanto pagou de agua?");
		agua = new Scanner(System.in).nextInt();
		System.out.println("Quanto pagou de luz?");
		luz = new Scanner(System.in).nextInt();
		System.out.println("Quando pagou de telefone?");
		telefone = new Scanner(System.in).nextInt();
		
		totalDespesas = agua + luz + telefone;
	}

}

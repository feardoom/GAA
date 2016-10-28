package dia281016;

import java.util.Scanner;

public class BalancoGAA {
	
	public BalancoGAA() {
		int receitas = getReceitas();
		int despesas = getDespesas();
		int balanco = getBalanco(receitas, despesas);
		
		System.out.println("O total de receitas é: €" + receitas);
		System.out.println("O total de despesas é: €" + despesas);
		System.out.println("\nO balanço final é: €" + balanco);
		
		if (balanco > 0) {
			System.out.println("Pode continuar a sua atividade!");
		}else if (balanco == 0) {
			System.out.println("\nPrecisa de mais esforço!");
		} else {
			System.out.println("\nÉ melhor dedicar-se à pesca!");
		}
	}
	
	public int getReceitas() {
		int quotas, recBaile, recBar, totalReceitas;
		
		System.out.println("Qual foi o seu valor de quotas?");
		quotas = new Scanner(System.in).nextInt();
		System.out.println("Qual foi a sua receita do baile?");
		recBaile = new Scanner(System.in).nextInt();
		System.out.println("Qual foi a seu receita do bar?");
		recBar = new Scanner(System.in).nextInt();
		
		totalReceitas = quotas + recBaile + recBar;
		
		return totalReceitas;
	}
	
	public int getDespesas() {
		int agua, luz, telefone, totalDespesas;
		
		System.out.println("Quanto pagou de agua?");
		agua = new Scanner(System.in).nextInt();
		System.out.println("Quanto pagou de luz?");
		luz = new Scanner(System.in).nextInt();
		System.out.println("Quando pagou de telefone?");
		telefone = new Scanner(System.in).nextInt();
		
		totalDespesas = agua + luz + telefone;
		
		return totalDespesas;
	}
	
	public int getBalanco(int receita, int despesa) {
		return receita - despesa;
	}

}

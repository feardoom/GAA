
public class exercicioBalanco {

	public exercicioBalanco() {
		
		int quotas = 300, 
			recBaile = 200, 
			recBar = 250;
		int totalReceitas = quotas + recBaile + recBar;
		
		int agua = 100,
			luz = 60,
			telefone = 70;
		int totalDespesas = agua + luz + telefone;
		
		System.out.println("O total de receitas �: �" + totalReceitas);
		System.out.println("O total de despesas �: �" + totalDespesas);
		System.out.println("O balan�o final �: �" + (totalReceitas - totalDespesas));
	}

}

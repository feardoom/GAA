
public class exercicioBalanco {
	int totalReceitas;
	int totalDespesas;
	
	public exercicioBalanco() {
		
		calcularReceitas();
		calcularDespesas();
		
		System.out.println("O total de receitas �: �" + totalReceitas);
		System.out.println("O total de despesas �: �" + totalDespesas);
		System.out.println("O balan�o final �: �" + (totalReceitas - totalDespesas));
	}
	
	public void calcularReceitas() {
		int quotas = 300, 
			recBaile = 200, 
			recBar = 250;
		totalReceitas = quotas + recBaile + recBar;
	}
	
	public void calcularDespesas() {
		int agua = 100,
				luz = 60,
				telefone = 70;
		totalDespesas = agua + luz + telefone;
	}

}

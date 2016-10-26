
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int quotas = 300, 
			recBaile = 200, 
			recBar = 250;
		int totalReceitas = quotas + recBaile + recBar;
		
		int agua = 100,
			luz = 60,
			telefone = 70;
		int totalDespesas = agua + luz + telefone;
		
		System.out.println("O balanço final é: €" + (totalReceitas - totalDespesas));
		
	}

}

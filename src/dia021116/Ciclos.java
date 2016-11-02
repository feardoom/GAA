package dia021116;

public class Ciclos {

	public Ciclos() {
		dePara();
	}
	
	public void enquanto() {
		int i = 1;
		String msg = "All you need is love";
		
		while (i <= 4) {
			System.out.println(msg);
			i+=1;
		}
		
	}
	
	public void fazerEnquanto() {
		int i = 1;
		String msg = "All you need is love";
		
		 do {
			System.out.println(msg);
			i+=1;
		} while (i <= 4); 
	}
	
	public void dePara() {
		String msg = "All you need is love";
		for (int i = 0; i < 7; i++) {
			System.out.println(msg);
		}
	}

}

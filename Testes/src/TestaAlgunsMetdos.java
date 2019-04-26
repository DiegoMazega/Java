
public class TestaAlgunsMetdos {

public static void main(String[]args) {
	Conta c1 = new Conta();
	c1.deposita(500);
		
	Conta c2 = new Conta();
	c2.deposita(200);
	
	c2.transfere(c1, 100);
	
	c1.rouba(c1, 100);
	c1.analise(c1);
}
}

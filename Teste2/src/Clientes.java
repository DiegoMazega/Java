
class contas{
	String titular;
	double saldo;
	int numero;
	private static int totaldecontas;
	
	contas(String titular, double saldo, int numero){
		this.titular = titular;
		this.saldo = saldo;
		this.numero = numero;
		System.out.println(this.titular+"\n"+this.saldo+"\n"+this.numero);
	}
	contas(){
		contas.totaldecontas+=1;
	}
	public static int gettotaldecontas() {
		return contas.totaldecontas;
	}
}

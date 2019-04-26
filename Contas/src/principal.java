
public class principal {
	
	public static void main(String[]args) {
		Contas contas = new Contas();
			Clientes clientes = new Clientes();
			contas.titular = clientes;
			contas.titular.nome = "diego";
	}

}

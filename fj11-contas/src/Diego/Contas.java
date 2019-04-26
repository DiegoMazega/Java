package Diego;
import Clientes.clientes;



public class Contas {
public double saldo;
public clientes dados;

	

	public void deposita(double deposita) {
		this.saldo+=deposita;
	}

	public double getSaldo() {
		return this.saldo;
	}
}

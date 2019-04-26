import Diego.Contas;
import Clientes.clientes;
import java.util.*;

public class principal {
	public static void main(String[] args) {
		var a = new Scanner(System.in);
		
		
		Contas conta = new Contas();
		clientes cliente = new clientes();
		conta.dados = cliente;
		
		System.out.println("Digite o Nome do Cliente: ");
		conta.dados.nome = a.nextLine();
	
		System.out.println("Deseja Fazer um deposito na sua conta?");
		char resposta = a.next().charAt(0);
		if(resposta == 's') {
			System.out.println("Deseja fazer um deposito de quanto?");
			double valor = a.nextDouble();
			conta.deposita(valor);
			System.out.println(conta.getSaldo());
		}
		else {
			System.out.println("OK, Adeus");
		}
		
		
		conta.deposita(200.00);
		System.out.println(conta.dados.nome+"\n"+ conta.getSaldo());
		conta.deposita(200.00);
		System.out.println(conta.getSaldo());
		
		
		
		
	}
}
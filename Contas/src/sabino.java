public class sabino {
	String nome;
    String sobrenome;
}

class Conta{
	sabino sabino;
	int conta;
	int saldo;
	int cpf;
	int data;


String Setabertura(String nome, String sobrenome) {
	this.sabino.nome = nome;
	this.sabino.sobrenome = sobrenome;
	return nome;
}

int deposito(int valor) {
	this.saldo = valor;
	return valor;
}

int saque(int valor) {
	boolean teste = false;
	do {
	if(valor<=this.saldo) {this.saldo -= valor;
	System.out.println("Saque feito com Sucesso");
	teste = true;
	}
	else {System.out.println("Saldo Insuficiente");}
	}while(teste == false);
	return valor;
}


}

class Clientes{
	String nome;
	String cpf;
	String endereço;
	String senha;
}
class Conta {
String titular;
int numero;
String agencia;
double saldo;
String abertura;
Clientes dados;

void Nome(String nomee) {
	dados.nome=nomee;
	System.out.println(nomee);
}

void deposita(double valor) {
	this.saldo+= valor;
	}

boolean saca(double valor) {
	if(this.saldo<valor) {
		System.out.println("Saldo Indipoínel para essa operção");
		return false;
	}
	else {
		this.saldo -= valor;
		return true;
	}
}

double rendimento(Conta referente) {
	double rendimento = this.saldo*0.1;
	System.out.println("Seu rendimento é de: "+rendimento);
	return rendimento;
 }

String RecuperaçãoDeDados(Conta referente) {
	String dados = "Titular: " + this.titular;
	dados += "\nNúmero: " + this.numero+"\nAgencia: "+this.agencia+"\nAberta em: "+this.abertura;
	System.out.println(dados);
	return dados;
}

boolean tranferencia(Conta Destino, double valor) {
	boolean retirou = saca(valor);
	if(retirou == false) {
		System.out.println("Sem saldo para a operação");
		return false;
	}
	else {
		Destino.deposita(valor);
		System.out.println("Transação Realizada Com Sucesso");
		System.out.println("Novo saldo: "+Destino.saldo);
		return true;
	}
}
}

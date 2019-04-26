class Teste {

	
	public static void main(String[]args) {
		Conta conta = new Conta();
		conta.titular="Diego Leandro Mazega Duarte";
		conta.agencia="111111";
		conta.numero = 01;
		conta.abertura= "07/08/2018";
		Clientes cliente = new Clientes();
		conta.dados = cliente;
		conta.Nome("lala");
		
		
		
		
		Conta conta2 = new Conta();
		conta2.titular="Carinha abdul jabbar";
		conta2.agencia="265248";
		conta2.numero = 02;
		conta2.abertura= "08/08/2018";
		
		conta.deposita(100);
		conta.saca(50);
		
		conta2.deposita(500);
		conta2.saca(550);
		
		conta.rendimento(conta);
		conta.RecuperaçãoDeDados(conta);

		conta2.rendimento(conta2);
		conta2.RecuperaçãoDeDados(conta2);
		
		conta.tranferencia(conta2, 20);
	}
}

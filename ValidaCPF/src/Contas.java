class Contas {
	private String nome;
	private String endereço;
	private String cpf;
	private int idade;
	private double saldo;

	public void mudaCPF(String cpf) {
		if(this.idade>=60) {
		validaCPF(cpf);
		}
		this.cpf = cpf;
	}
	
	private void validaCPF(String cpf) {
		
	}
	
	public double pegasaldo() {
		return this.saldo;
	}
	
}

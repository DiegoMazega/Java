import java.util.Scanner;
public class mainSabino {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		Conta conta =  new Conta();
		System.out.print("Deseja realizar qual ação: \nA)Abrir uma conta\nB) Saque\nc) Deposito\nD)ver dados cadastrados da conta");
		char opcao = in.nextLine().charAt(0);
		opcao = Character.toLowerCase(opcao);
	}

}

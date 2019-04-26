
public class Conta {
      int numero;
      String titular;
     private double saldo;
     
      
      boolean saca(double valor) {
    	  if(this.saldo<valor) {
    		  return false;
    	  }
    	  else {
    		  this.saldo = this.saldo - valor;
    		  System.out.println("Saldo atual: "+this.saldo);
    		  return true;
    	  }
      }
      
      void deposita(double quantidade) {
    	  this.saldo += quantidade;
    	  System.out.println("Deposito de: "+quantidade+" Realizado com sucesso\nSaldo:"+this.saldo);
      }
      
     boolean transfere(Conta destino, double valor) {
    	  boolean retirou = saca(valor);
    	   	  if(retirou == false) {
    		  System.out.println("Não há limite disponível para realizar essa operação");
    	   		  return false;
    	  }
    		  else {
    			  destino.deposita(valor);
    			  System.out.println("Deposito de: "+valor+" relizado com sucesso.\nSaldo: "+this.saldo );
    			  return true;
    			  }
    	  }
     
         void rouba(Conta referente, double valor ) {
        	 this.saldo -= valor;
         }
         
         
         boolean analise(Conta referente) {
        	 if(this.saldo >= 800) {
        		 System.out.println("Há um limite de 300 reais de crédito para a sua conta");
        		 return true;
        	 }
        	 else {
        		 System.out.println("Não há limite de crédito disponível para a sua conta");
        		 return false;
        	 }
         }
             
         
    		  public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

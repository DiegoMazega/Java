import java.util.Scanner;
public class uri1026 { 
    public static void main(String[] args){ 
    Scanner in = new Scanner(System.in);
    int a, b, xor, and, or, not;  
 a: while (in.hasNext()) { //sempre vai retornar enquanto houver a linha do Scanner "in" 
        a = in.nextInt(); 
        b = in.nextInt(); 
        xor = a^b; // operação com uma porta logica XOR
        and = a&b; // operação com uma porta logica AND
        or = a|b;  // operação com uma porta logica OR
        not = ~b;  // inverte o valor logico de B
        System.out.println(xor); 
        System.out.println(and);
        System.out.println(or);
        System.out.println(not);
        if(a==b)
        	break a;
  } 
  System.out.println("saiu");
  in.close();
    }
}
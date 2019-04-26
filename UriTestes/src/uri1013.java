import java.util.Scanner;
public class uri1013 {
	public static void main(String[]args) {
		int a, b, c, maior;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if(a>b && a>c) 
			maior = a;
		else if(b>a && b>c)
			maior = b;
		else
			maior = c;
		System.out.printf("%d eh o maior\n", maior);
		in.close();
	}

}

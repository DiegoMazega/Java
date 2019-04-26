public class teste {

	public static void main(String[] args) {
	a: for(int i = 1; i<=6; i++) {
		b: for(int j = 1; j<=6; j++) {
			int tab = i*j;
			if(tab%i == 1)
				continue a;
	        if(tab != 6)
	        	System.out.print(tab + "\n");
	        else
			System.out.println(tab);
		}
	}
					
	}}
		


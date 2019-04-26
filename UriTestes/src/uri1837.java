import java.util.Scanner;
public class uri1837 {

	public static void main(String[] args) {
		int a, b, c, d, e, f = 0, q, r;
Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
	    if(a<0)
	    {
	        e=b;
	        if(b<0) 
	        	e=b*-1;
	        for(r=0; r<e; r++)
	        {
	            f=a-r;
	            if(f%b==0) 
	            	break;
	        }
	        q=f/b;
	    }
	    else
	    {
	        q=a/b;
	        r=a%b;
	    }
	    
		System.out.println(q+" "+r);

	

	}

}

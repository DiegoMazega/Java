import java.util.Scanner;


public class uri1011 {

 public static void main(String[] args) {
  
  double raio;
  Scanner a = new Scanner(System.in);
  raio = a.nextDouble();
  
  System.out.printf("VOLUME = %.3f\n", (4 * 3.14 * Math.pow(raio, 3.0)) / 3);
  a.close();

 }

}
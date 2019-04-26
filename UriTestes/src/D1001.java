import java.io.*;


public class D1001 {

 public static void main(String[] args) throws IOException {
  double a, b, c;
  InputStreamReader in = new InputStreamReader(System.in);
  BufferedReader sc = new BufferedReader(in);
  a = Double.parseDouble(sc.readLine());
  b = Double.parseDouble(sc.readLine());
  c = Double.parseDouble(sc.readLine());
  System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
  System.out.printf("CIRCULO: %.3f\n", c * c * 3.14);
  System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
  System.out.printf("QUADRADO: %.3f\n", b * b);
  System.out.printf("RETANGULO: %.3f\n", a * b);

 }

}
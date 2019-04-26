import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer; // não é recomendada usar, melhor usar ".split("")"

public class uri1030 {

    static FastScanner in = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        int nc = in.nextInt(), n, k;
        for (int i = 1; i <= nc; i++) {
            n = in.nextInt();
            k = in.nextInt();
            out.println("Case " + i + ": " + (josephus(n, k) + 1));
        }
        in.close();
        out.close();
    }

    private static int josephus(int n, int k) {
        int a = 0;
        for (int i = 2; i <= n; i++) {
            a = (a + k) % i;
        }

        return a;
    }

    static class FastScanner implements Closeable {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner(InputStream input) {
            reader = new BufferedReader(new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        public String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String line = reader.readLine();
                if (line == null) {
                    return null;
                }
                tokenizer = new StringTokenizer(line);
            }
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        @Override
        public void close() throws IOException {
            tokenizer = null;
            reader.close();
        }
    }
}
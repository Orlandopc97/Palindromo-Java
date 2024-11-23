import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        String cadena=(bufferedReader.readLine());
        String resultado = validPalindrome(cadena);
        System.out.println(resultado);

    }

    public static String validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.toUpperCase().charAt(i) != s.toUpperCase().charAt(j)) {
                return "NO";
            }
        }
        return "SI";
    }

}
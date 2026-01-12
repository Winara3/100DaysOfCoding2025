package Day65;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);
        int n = 5, fak = 1;

  for (int i = 1; i <= n; i++) {
    fak *= i;
  }

  System.out.println(fak);
    }
}

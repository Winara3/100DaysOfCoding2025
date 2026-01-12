package Day058;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        int n = 12;

  for (int i = 1; i <= n; i++) {
    System.out.print(i + " ");
  }

  System.out.println("");

  for (int i = n; i >= 1; i--) {
    System.out.print(i + " ");
  }

  System.out.println("");
    }
}

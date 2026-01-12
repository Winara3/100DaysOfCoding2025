package Day064;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        int n = 20;
        int pangkat = 2;

  for (int i = 1; i <= n; i++) {
    System.out.println(Math.pow(pangkat, i));
  }
    }
}

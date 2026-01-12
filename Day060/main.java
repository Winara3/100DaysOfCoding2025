package Day060;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan Angka: ");
        int n = w.nextInt();

  for (int i = n; i >= 1; i--) {
    if (i % 2 != 0) {
      System.out.println(i + " ganjil");
    }
  }

  for (int i = n; i >= 1; i--) {
    if (i % 2 == 0) {
      System.out.println(i + " genap");
    }
    }
}
}
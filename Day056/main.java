package Day056;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int a = w.nextInt();
         do {
        for (int i = 0; i < a; i++) {
      System.out.println("Nilai i = " + i);
    }
  } while (a < 12);
    }
}

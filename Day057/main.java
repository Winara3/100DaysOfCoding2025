package Day057;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
         int a = w.nextInt();
         
         for (int i = 0; i < a; i++) {
        for (int j = 0; j < a; j++) {
      System.out.println(i + " " + j);
    }
  }
    }
}

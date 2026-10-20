import java.util.Scanner;
public class Bioskop {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int tiket, total;
  int hargaTiket = 50000;
  do {
    System.out.print("Berapa jumlah tiket yang dibeli: ");
    tiket = sc.nextInt();
    if (tiket <= 0) {
      System.out.println("Masukan jumlah tiket yang valid, Harap masukan jumlah tiket yang valid!");
      continue;
    }
    if (tiket > 10) {
    total = (tiket * hargaTiket) * 85 / 100;
      System.out.println("Total yang harus dibayar: Rp" + total);
    }
    else if (tiket > 4) {
    total = (tiket * hargaTiket) * 90 / 100;
      System.out.println("Total yang harus dibayar: Rp" + total);
    } else {
    total = tiket * hargaTiket;
      System.out.println("Total yang harus dibayar: Rp" + total);
    }
    } while (true);
}   
}
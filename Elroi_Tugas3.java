import java.util.Scanner;

public class Elroi_Tugas3 {
    public static void main(String[] args) {
        int x;
        Scanner nilai = new Scanner(System.in);
        
        while (true){
            System.out.print("MASUKKAN JUMLAH BARIS SEGITIGA YANG DIINGINKAN: ");
            x = nilai.nextInt();
            if (x >= 2){
                System.out.println("JUMLAH BARIS YANG DIMASUKKAN ADALAH: " + x);        
                break;
            }
            else{
                System.out.println("NILAI YANG DIMASUKKAN HARUS BERUPA ANGKA DAN MINIMAL 2 BARIS"); 
            }
        }
        for (int a = 1; a <= x; a++){
            for (int b = x-1; b >= a; b--) {
                System.out.print(' ');
            }
            for (int c = 1; c <= a; c++){
                System.out.print('*');
            }
            for (int d = 1; d <= a - 1; d++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}
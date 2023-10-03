import java.util.Scanner;
public class Pemilihan2Percobaan1 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        float tahun;

        System.out.print("masukan tahun :");
        tahun = input27.nextFloat();

        if ((tahun % 4) == 0){
            if ((tahun % 100) != 0){
                System.out.print("Tahun Kabisat");
            }else{
                if ((tahun % 400) == 0) {
                    System.out.println("Tahun Kabisat");
                }else
                System.out.println("Bukan Tahun Kabisat");
            }
        }
        else{ 
            System.out.print("Bukan Tahun Kabisat");
        }
    }
    
}
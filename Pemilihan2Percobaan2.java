import java.util.Scanner;
public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        int totalsudut;

        System.out.print("Masukan sudut 1 : ");
        int mSudut1 = input27.nextInt();
        System.out.print("Masukan sudut 2 : ");
        int mSudut2 = input27.nextInt();
        System.out.print("Masukan sudut 3 : ");
        int mSudut3 = input27.nextInt();

        totalsudut = mSudut1 + mSudut2 + mSudut3;

        if (totalsudut == 180) {
            if ((mSudut1 == 90) || (mSudut2 == 90) || (mSudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            
            }else
            System.out.println("segitiga tersebut bukan segitiga siku-siku");
              
        }else
            System.out.println("bukan segitiga");
    }
}

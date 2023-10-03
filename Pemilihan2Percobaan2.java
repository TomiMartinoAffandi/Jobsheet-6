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
            }else if ((mSudut1 == mSudut2) && (mSudut1 == mSudut3)) {
                System.out.println("segitiga sama sisi");
            }else if ((mSudut1 == mSudut2) || (mSudut1 == mSudut3) || (mSudut2 == mSudut3)) {
                System.out.println("segitiga sama kaki");
            }else{
                System.out.println("segitiga sembarang");
            } 
        }else
            System.out.println("bukan segitiga");
    }
}

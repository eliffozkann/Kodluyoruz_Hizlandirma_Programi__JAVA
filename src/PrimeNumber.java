import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        int sayac = 0;

        for(int i = 2; i < 100; i++)
        {
            sayac = 0;
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    sayac++;
                }
            }
            if (sayac == 0){
                System.out.print(i + " ");
            }
        }

    }
}

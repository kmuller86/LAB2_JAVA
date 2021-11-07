import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        System.out.println("Zad 1a");
        System.out.println("Podaj liczbe");
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());

        switch (a%2) {
            case 0:
                System.out.println("parzysta");
                break;
            default:
                System.out.println("nieparzysta");
                break;
        }

        System.out.println("Zad 1b");
        System.out.println("Podaj liczbe");
        int b = Integer.parseInt(scan.next());

        switch (b%7) {
            case 0:
                System.out.println("podzielna przez 7");
                break;
            default:
                System.out.println("niepodzielna przez 7");
                break;
        }

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        System.out.println("Zad 2a,b");

        int oCounter = 0;
        int pCounter = 0;
        int xCounter = 0;
        int zCounter = 0;
        int qCounter = 0;
        int Counter = 0;

        String word = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        char [] characters = word.toCharArray();

        for (char c: characters)
        {
            switch (c) {
                case 'o':
                    oCounter++;
                    break;
                case 'p':
                    pCounter++;
                    break;
                case 'x':
                    xCounter++;
                    break;
                case 'z':
                    zCounter++;
                    break;
                case 'q':
                    qCounter++;
                    break;
                default:
                    Counter++;
                    break;
            }
        }
    System.out.printf("'o' = %d, 'p' = %d, 'x' = %d, 'z' = %d, 'q' = %d, inne = %d", oCounter, pCounter, xCounter, zCounter, qCounter, Counter);
    }
}

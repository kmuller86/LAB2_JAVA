public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        System.out.println("Zad.1");

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i = 1000;

        do {
            if (i%58 == 0) {
                System.out.printf("Liczba %d podzielna przez 58. \n", i);
            }
            i--;
        } while (i >= 0 );

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        System.out.println("Zad.2a");

        int [] myArray = {5,25,6,78,13};

        int j = myArray.length;
        while (j > 0) {
            j--;
            System.out.println(myArray[j]);
        }

        System.out.println("Zad.2b");

        double [] myDoubleArray = {5.75342,25.34,6.233312,78,13.568};

        int k = myDoubleArray.length;
        while (k > 0) {
            k--;
            System.out.println(myDoubleArray[k]);
        }

        System.out.println("Zad.2c");

        String [] myStringArray = {"Basia", "Zosia", "Kasia", "Olek", "Maja"};

        int l = myStringArray.length;
        while (l > 0) {
            l--;
            System.out.println(myStringArray[l]);
        }
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        System.out.println("Zad.3a");



    }
}

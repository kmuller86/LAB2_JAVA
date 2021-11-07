public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        System.out.println("Pętla A:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Mimo pieciokrotnej pętli zostanie wypisana raz, bo jest tu break");
            break;
        }

        System.out.println("Pętla B:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Licznik pętli: " + (i+1));
            if(i == 0) {
                System.out.println("Pętla wykona się 5 razy, ale to co się dzieje pod continue nie jest wykonywane");
            }
            else {
                continue;
            }
            System.out.println("ale to wydrukuje się raz - continue jest w else");
        }

        System.out.println("Pętla C:");

        for (int i = 0; i<= 0; i--) {
            System.out.println("Gdyby nie return to pętla działałaby w nieskończoność");
            return;
        }




    }
}

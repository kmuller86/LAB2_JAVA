import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        Scanner scan = new Scanner (System.in);

        System.out.println("Zad 1");

        /* Polecam deklarować listy, sety, mapy za pomocą interfejsu, mozna wtedy zawsze później implementować różnymi klasami
            List<String> lista = new ArrayList<>();
            lista = new LinkedList<>();
        */
        ArrayList<String> animals = new ArrayList<>();


        System.out.println("Podaj nazwy zwierząt");

        for (int i = 0; i < 5; i++){
            animals.add(scan.next());
        }
        showAnimals(animals);

        animals.remove(animals.size()-1);
        animals.remove(animals.size()-1);

        animals.add("zebra");
        animals.add("zyrafa");
        animals.add("slon");

        showAnimals(animals);
        System.out.println(animals.size());

        Collections.sort(animals, Collections.reverseOrder());

        showAnimals(animals);

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        System.out.println("Zad 2");

        Set<Integer> numbers = new TreeSet<>();

        for(int i = 0; i <10; i++) {
            numbers.add(Integer.parseInt(scan.next()));
        }

        for(int numb: numbers) {
            System.out.println(numb);
        }








    }

    static void showAnimals (ArrayList<String> animals) {
        for (String animal: animals){
            System.out.println(animal);
        }
    }

}

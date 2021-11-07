import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        System.out.println("Zad 1");

        int [] numberAr = new int [20];
        fillArray(numberAr);
        showArray(numberAr);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        System.out.println("Zad 2");

        String [] stringAr = new String[6];
        fillStringArray(stringAr);
        showStringArray(stringAr);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        System.out.println("Zad 3");

        String myName = "Marta";
        showMyName(myName);

        String myLast = "Bartusch";
        showMe(myName, myLast);

        int myAge = 23;

        showMyAge(myName, myLast, myAge);

        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        System.out.println("Zad 4");

        int sum = add(4,66);
        int sum3 = add3(90,4,2);
        System.out.println("wynik: " + (add(5, 92) + add3(251, 33, 4)));
    }

    public static void fillArray(int [] ar) {
        int i = 40;
        int index = 0;
        while ((i >= 20) && index < ar.length) {
            ar[index] = i;
            i--;
            index ++;
        }
    }

    public static void showArray(int [] ar) {
        for (int numb: ar)
        System.out.println(numb);
        }

        public static void fillStringArray(String [] ar) {
            System.out.println("Podaj słowa");
            for (int i = 0; i < ar.length; i++) {
                Scanner scan = new Scanner(System.in);
                ar [i] = scan.next();
            }
        }

    public static void showStringArray(String [] ar) {
        for (int i = ar.length; i > 0; i--)
            System.out.println(ar[i-1]);
    }

    public static void showMyName (String name)
    {
        System.out.println(name);
    }

    public static void showMe (String name, String lastName)
    {
        System.out.println(name + " " + lastName);
    }

    public static void showMyAge (String name, String lastName, int age)
    {
        System.out.println(name + " " + lastName + " " + age);
    }

    public static int add (int a, int b)
    {
        return a + b;
    }

    public static int add3 (int a, int b, int c)
    {
        return a + b + c;
    }


}





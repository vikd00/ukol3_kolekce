package com.nothing;

import java.util.HashMap;
import java.util.Random;
import java.util.Vector;

public class Main {
    public static int randomCislo(int max) {
        Random r = new Random();
        return r.nextInt(max);
    }

    public static void ukolA() {
        //1] vytvorit vektor cisel o velikosti 100
        Vector<Integer> vector = new Vector<Integer>(100);

        //2] naplnit vektor nahodnymi cisly
        for (int i = 0; i < 100; i++) {
            vector.add(randomCislo(1000));
        }

        //3] vypsat vektor
        for (int i = 0; i < vector.toArray().length; i++) {
            System.out.println(vector.get(i));
        }

        //4] while cyklus, ktery na random pozici (0, delka vectoru) odebere dany prvek z vektornu na danem indexu
        //5] do doky nez bude zbyvat 10 prvku v tom vectoru
        while (vector.toArray().length > 10) {
            vector.remove(randomCislo(vector.toArray().length));
        }

    }

    public static void ukolB() {
        //1] vytvorit novou mapu, kde klic bude nejakjy string (=nazev)
        //  a pro tento klic prirad do mapy nejaky seznam
        HashMap<String, Vector> mapa = new HashMap<String, Vector>();

        //Vytvorime si 4 vektory
        Vector<Integer> vector1 = new Vector<Integer>(10);
        Vector<Integer> vector2 = new Vector<Integer>(10);
        Vector<Integer> vector3 = new Vector<Integer>(10);
        Vector<Integer> vector4 = new Vector<Integer>(10);

        //Vektory naplnime random cislami
        for (int i = 0; i < 10; i++) {
            vector1.add(randomCislo(1000));
            vector2.add(randomCislo(1000));
            vector3.add(randomCislo(1000));
            vector4.add(randomCislo(1000));
        }

        //Vlozime do mapy vektory s prislusnymi klucmi
        mapa.put("prvyVector", vector1);
        mapa.put("druhyVector", vector2);
        mapa.put("tretiVector", vector3);
        mapa.put("stvrtyVector", vector4);

        //2] proiterovat tuhle mapu a pro kazdy jeji klic vypsat jeho hodnotu
        for(String kluc : mapa.keySet()){
            //Vypisem klic
            System.out.println(kluc);
            //Preiterujem vector vlozeny do mapy pod tymto klicem
            for(int i = 0; i < mapa.get(kluc).toArray().length; i++){
                System.out.println(mapa.get(kluc).get(i));
            }
        }
    }

    public static void main(String[] args) {
        ukolA();
        ukolB();
    }
}

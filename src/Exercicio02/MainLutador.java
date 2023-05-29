package Exercicio02;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MainLutador {
    public static void main(String[] args) {

        ArrayList<Lutador>lutadores = new ArrayList<>();
        Lutador l1 = new Lutador("Jon Jones", 35,113,1.93,"mma","EUA");
        Lutador l2 = new Lutador("Conor McGregor", 34,71,1.75,"mma","IE");
        Lutador l3 = new Lutador("Demetrious Johnson", 36,57,1.6,"Luta Livre","US");
        Lutador l4 = new Lutador("JKhabib Nurmagomedov", 34,70,1.78,"mma","RU");
        Lutador l5 = new Lutador("Jose Aldo", 36,61,1.7,"jiu Jitsu","BR");

        lutadores.add(l1);
        lutadores.add(l2);
        lutadores.add(l3);
        lutadores.add(l4);
        lutadores.add(l5);






    }
}

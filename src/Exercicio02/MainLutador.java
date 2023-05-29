package Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class MainLutador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lutador lutador = new Lutador();

        System.out.print("Nome: ");
        String nome = scanner.next();
        lutador.setNome(nome);

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        lutador.setIdade(idade);

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        lutador.setAltura(altura);

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        lutador.setPeso(peso);

        System.out.print("Estilo de luta: ");
        String estiloLuta = scanner.next();
        estiloLuta = estiloLuta.toLowerCase(Locale.ROOT);
        lutador.setEstiloLuta(estiloLuta);

        lutador.mostrarLutador();
    }
}

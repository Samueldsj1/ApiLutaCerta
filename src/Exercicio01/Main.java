package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Nome: ");
        String nome = scanner.next();
        pessoa.setNome(nome);

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        pessoa.setIdade(idade);

        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        pessoa.setPeso(peso);

        System.out.print("Altura: ");
        double altura = scanner.nextDouble();
        pessoa.setAltura(altura);

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());
        pessoa.calcularImc();

    }
}

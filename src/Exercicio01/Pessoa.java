package Exercicio01;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    String situacao="";
    public void calcularImc(){
       double imc = this.peso / (this.altura * this.altura);

        if( imc >=18.5 && imc <= 25){
            situacao = "Peso Ideal!";
        }
        else if (imc > 25) {
            situacao = "Acima do Peso!!";
        }
        else {
            situacao = "Abaixo do Peso!";
        }
        System.out.printf("IMC: %.2f",imc);
        System.out.println("Situação: "+situacao);
    }
}
//1 – Faça uma classe Pessoa que tenha os atributos: Nome, idade, peso e altura.Faça um
//metodoque calcule o IMC desta pessoa. IMC = massa/ (altura ^2). Se o IMC estiver entre 18.5 e
//25 a pessoa estará no peso ideal, se for menos que isso está abaixo do peso e se for maior que
//isso estará acima do peso.
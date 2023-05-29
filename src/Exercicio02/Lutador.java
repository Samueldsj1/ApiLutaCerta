package Exercicio02;

public class Lutador {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String estiloLuta;


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

    public String getEstiloLuta() {
        return estiloLuta;
    }

    public void setEstiloLuta(String estiloLuta) {
        this.estiloLuta = estiloLuta;
    }

    public  void estiloLuta(){
        String boxe = "boxe";
        String mma = "mma";
        String muayThai = "muayThai";
        String Judo = "Judo";
        String jiuJitsu = "jiuJitsu";

        switch (this.estiloLuta)
        {
            case "boxe":
                this.estiloLuta = "Boxe";
                break;
            case "mma":
                this.estiloLuta = "mma";
                break;
            case "muayThai":
                this.estiloLuta = "muayThai";
                break;
            case "Judo":
                this.estiloLuta = "Judo";
                break;
            case "jiuJitsu":
                this.estiloLuta = "jiuJitsu";
                break;
        }
        System.out.println("Estilo de Luta: " + getEstiloLuta());
    }
    public void catPeso() {
        String categoriaPeso = "";

        if (this.peso <= 61.2) {
            categoriaPeso = "Peso Leve";
        } else if (this.peso <= 83.9) {
            categoriaPeso = "Peso Medio";
        } else {
            categoriaPeso = "Peso Pesado";
        }


        System.out.println("Categoria: " + categoriaPeso);
    }
    public void mostrarLutador (){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        estiloLuta();
        catPeso();
    }
}

//Faça uma classe que cadastre um lutador a faça uma abstração do que um lutador tem.
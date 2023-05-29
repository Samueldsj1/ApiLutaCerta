package Exercicio02;

public class Lutador {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String estiloLuta;
    private String nacionalidade;
    private String categoria;


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
    public String getCategoria() {
        return categoria;
    }
    public String setCategoria() {
        this.categoria = categoria;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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
    public void mostrarLutador (){
        System.out.println("Nome: "+getNome());
        System.out.println("Nacionalidade: "+getNacionalidade());
        System.out.println("Idade: "+getIdade());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        System.out.println("Categotria: "+getCategoria());
        estiloLuta();

    }

    public Lutador(String nome, int idade, double peso, double altura, String estiloLuta, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.estiloLuta = estiloLuta;
        this.nacionalidade = nacionalidade;
    }

    public void mostrarCategoria(){
        if (this.peso <= 61.2) {
            this.categoria = "Peso Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Peso Medio";
        } else {
            this.categoria = "Peso Pesado";
        }
    }
}

//Faça uma classe que cadastre um lutador a faça uma abstração do que um lutador tem.
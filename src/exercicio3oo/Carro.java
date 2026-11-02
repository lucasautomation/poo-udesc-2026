package exercicio3oo;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public Carro(String modelo, String marca, int ano, double velocidade){
        System.out.println("...");
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    //setter publicos
    public String getModelo() {return this.modelo;}
    public String getMarca(){return this.modelo;}
    public int getAno() {return this.ano;}
    public double getVelocidade() {return this.velocidade;}

    //getters públicos
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setAno(int ano) {this.ano = ano;}
    public void setVelocidade(double velocidade) {this.velocidade = velocidade;}
}

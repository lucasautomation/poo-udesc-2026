package exercicio3oo;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        System.out.println("...");
        this.largura = largura;
        this.altura = altura;
    }
    //getters publicos
    public double getAltura() {return this.altura;}
    public double getLargura() {return this.largura;}

    //setters públicos
    public void setAltura(double altura) {this.altura = altura;}
    public void setLargura(double largura) {this.largura = largura;}
}

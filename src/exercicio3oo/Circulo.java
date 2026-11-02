package exercicio3oo;

public class Circulo {
    private double raio;

    public Circulo(Double raio){
        System.out.println("...");
        this.raio = raio;
    }
    //getters públicos
    public Double getRaio(){return this.raio;}

    //setters públicos
    public void setRaio(){this.raio = raio;}
}
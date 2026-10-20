package privado;

public class Celular {
    private String marca;
    private String modelo;
    private int ano;

    public Celular(String marca, String modelo, int ano){
        System.out.println("Objeto esta criando ");
        this.marca = "";
        this.modelo = "";
        this.ano = 2025;
    }

    //getters públicos
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public int getAno(){return this.ano;}

    //setters públicos
    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setAno(int ano) {this.ano = ano;}
}


package exercicio1oo;

public class TesteCarro {
    public static void main(String[] args){
        Carro carro = new Carro();

        carro.ano = 2011;
        carro.marca = "Chevrolet";
        carro.modelo = "Corsa";
        carro.velocidade = 80.00;

        System.out.println("Ano do carro: " + carro.ano);
        System.out.println("Marca do carro: " + carro.marca);
        System.out.println("Modelo do carro: " + carro.modelo);
        System.out.println("A Velocidade máxima é: " + carro.velocidade + " km/h");
    }
}

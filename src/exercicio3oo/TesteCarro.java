package exercicio3oo;

public class TesteCarro {
    public static void main(String[] args){
        Carro carro = new Carro("Jetta", "Volkswagen", 2018, 180);

        System.out.printf("Modelo do carro: %s%n", carro.getModelo());
        System.out.printf("Marca: %s%n ", carro.getMarca());
        System.out.printf("Ano do carro: %d%n", carro.getAno());
        System.out.printf("Velocidade máxima: %b%n ", carro.getVelocidade());
    }
}

package exercicio1oo;

public class TesteCachorro {
    public static void main(String[] args){
        Cachorro dog = new Cachorro();

        dog.raca = "Vira lata";
        dog.idade = 3;
        dog.nome = "Rex";
        dog.vacinado = true;
        dog.peso = 3.75;

        System.out.println("O nome do cachorro é: " + dog.nome);
        System.out.println("A idade do " + dog.nome + " é " + dog.idade);
        System.out.println("A raça do " + dog.nome + " é " + dog.raca);
        System.out.println(" O peso do " + dog.nome + " é " + dog.peso + " Kg ");
        System.out.println("Vacina OK ? " + dog.vacinado);
    }
}

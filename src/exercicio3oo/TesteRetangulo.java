package exercicio3oo;

public class TesteRetangulo {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(20, 30);

        System.out.printf("A Medida da largura é: %d%n", retangulo.getLargura());
        System.out.printf("A Medida da altura é: %d%n", retangulo.getAltura());
    }
}

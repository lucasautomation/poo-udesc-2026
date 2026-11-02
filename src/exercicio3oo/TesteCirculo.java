package exercicio3oo;

import exercicio3oo.Circulo;

public class TesteCirculo {
    public static void main(String[] args){
        Circulo circulo = new Circulo(15);

        System.out.printf("A medida da circunferência é: %d%n", circulo.getRaio());
    }
}

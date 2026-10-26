package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo();

        retangulo.altura = 25;
        retangulo.largura = 60;

        System.out.println("altura" + retangulo.altura);
        System.out.println("largura" + retangulo.largura);
    }
}

package calculadora;

import javax.swing.*;

public class TestaCalculadora {
    public void main(String[] args){
        Calculadora calc = new Calculadora();
        calc.n1 = 40;
        calc.n2 = 2;


        System.out.println(calc.n1);
        System.out.println(calc.n2);
        System.out.println(calc.n2);

        System.out.println("Soma é: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Produto: " + calc.multiplicar());
        System.out.println("Quociente: " + calc.dividir());

        System.out.println(calc.somar(50,100));
        System.out.println(calc.subtrair(5,100));
        System.out.println(calc.multiplicar(50,10));
        System.out.println(calc.dividir(25,5));


        JOptionPane.showMessageDialog(
                null,
                calc.mostrarUltimoResultadoCalculado()
        );
    }
}

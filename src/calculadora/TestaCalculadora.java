package calculadora;

import javax.swing.*;

public class TestaCalculadora {
    public void main(String[] args){
        Calculadora calc = new Calculadora();

        System.out.println("Soma é: " + calc.somar(50, 100));
        System.out.println("Subtração: " + calc.subtrair(50, 100));
        System.out.println("Produto: " + calc.multiplicar(50, 100));
        System.out.println("Quociente: " + calc.dividir(50, 100));

        do{
            //Recebe os valores do usuário e remove os espaços em branco (trim())
            String numero1 = JOptionPane.showInputDialog("Digite o primeiro numero");
            String numero2 = JOptionPane.showInputDialog("Digite o segundo numero");
            System.out.println(numero1);
            System.out.println(numero2);

            //Verificações de erro
            if(numero1 == null || numero2 == null){
                System.exit(0);
            } else if(numero1.trim().equals("")|| numero1.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Erro na entrada de dados, Digite novamente! ");
            }
            else {
                //Conversão obrigatória de dados: String para double
                double num1 = Double.parseDouble(numero1);
                double num2 = Double.parseDouble(numero2);

                //chamando o método somar
                double total = calc.somar(num1, num2);
                JOptionPane.showMessageDialog(null, "Resultado " + total);
            }
        }while (true);
    }
}

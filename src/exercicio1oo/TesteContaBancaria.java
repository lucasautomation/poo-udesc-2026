package exercicio1oo;

public class TesteContaBancaria {
    public static void main(String[] args){
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.numeroconta = "4786-1";
        contaBancaria.titular = "Genésio";
        contaBancaria.saldo = 3478.00;

        System.out.println("Número da conta " + contaBancaria.numeroconta);
        System.out.println("Nome do Titular " + contaBancaria.titular);
        System.out.println("Saldo da conta bancária " + contaBancaria.saldo);
    }
}

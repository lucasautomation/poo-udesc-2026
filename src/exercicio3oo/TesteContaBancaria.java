package exercicio3oo;

public class TesteContaBancaria {
    public static void main(String[] args){
        ContaBancaria contabancaria = new ContaBancaria(12345, "Berenice", 250000);

        System.out.printf("O número da conta é: %s%n", contabancaria.getNumeroconta());
        System.out.printf("O titular da conta é %s%n", contabancaria.getTitular());
        System.out.printf("O saldo disponível é: %b%n", contabancaria.getSaldo());


}

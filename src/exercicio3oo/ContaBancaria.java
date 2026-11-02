package exercicio3oo;
public class ContaBancaria {
    private String numeroconta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroconta, String titular, double saldo){
        System.out.println("...");
        this.numeroconta = numeroconta;
        this.titular = titular;
        this.saldo = saldo;
    }
    //getters públicos
    public double getSaldo() {return this.saldo;}
    public String getNumeroconta() {return this.numeroconta;}
    public String getTitular(){return this.titular}

    //setters públicos
    public void setNumeroconta(String numeroconta) {this.numeroconta = numeroconta;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public void setTitular(String titular) {this.titular = titular;}
}

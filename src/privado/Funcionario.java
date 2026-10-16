package privado;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    //Construtor default/no-args/padrão
    public Funcionario(){
        System.out.println("Objeto sendo criado");
        this.nome = "";
        this.idade = 25;
        this.salario = 1800;
    }

    //Construtor parametrizado
    public Funcionario(String nome, int idade, int salario){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
    }

    public String getNome(){
        if (this.nome == null){
            return "Nome ainda não definido";
        }
        return this.nome;
    }
    public int getIdade(){return this.idade;}
    public double getSalario(){return this.salario;}

    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setSalario(double salario) {this.salario = salario;}
}

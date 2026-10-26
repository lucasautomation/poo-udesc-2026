package exercicio2oo.classes;

public class Pessoa {
    private String nome;
    private int DataNascimento;
    private int idade;

    public Pessoa (String nome, int DataNascimento){
        System.out.println("...");
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.idade = 2026 - this.DataNascimento;

    }
    //Getters públicos
    public String getNome(){return this.nome;}
    public int getDataNascimento(){return this.DataNascimento;}
    public int getIdade(){return this.idade;}

    //Setters públicos
    public void setNome(String nome) {this.nome = nome;}
    public void setDataNascimento(int dataNascimento) {this.DataNascimento = dataNascimento;}
    public void setIdade(int idade) {this.idade = idade;}
}

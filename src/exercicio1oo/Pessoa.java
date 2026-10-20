package exercicio1oo;

class Pessoa {
    private String nome;
    private int DataNascimento;

    public Pessoa (String nome, int DataNascimento){
        System.out.println("...");
        this.nome = "";
        this.DataNascimento = 1985;
    }
    //Getters públicos
    public String getNome(){return this.nome;}
    public int getDataNascimento(){return this.DataNascimento;}

    //Setters públicos
    public void setNome(String nome) {this.nome = nome;}
    public void setDataNascimento(int dataNascimento) {DataNascimento = dataNascimento;}
}

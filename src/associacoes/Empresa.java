package associacoes;

public class Empresa {
    private String nome;
    private String endereço;
    private boolean matriz;

    private Funcionario diretor;

    public Empresa(String nome, String endereço, boolean matriz) {
        this.nome = nome;
        this.endereço = endereço;
        this.matriz = matriz;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEndereço() {return endereço;}
    public void setEndereço(String endereço) {this.endereço = endereço;}
    public boolean isMatriz() {return matriz;}
    public void setMatriz(boolean matriz) {this.matriz = matriz;}
    public Funcionario getDiretor() {return diretor;}
    public void setDiretor(Funcionario diretor) {this.diretor = diretor;}
}

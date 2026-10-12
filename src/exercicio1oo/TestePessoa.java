package exercicio1oo;

class TestePessoa {
    static void main(String[] args) {
        Pessoa fulano = new Pessoa();

        fulano.DataNascimento = 1985;
        fulano.nome = "Pereira";

        System.out.println("O nome é " + fulano.nome);
        System.out.println(fulano.nome + " nasceu em " + fulano.DataNascimento);
    }
}

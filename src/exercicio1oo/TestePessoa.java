package exercicio1oo;

public class TestePessoa {
    static void main(String[] args) {
        Pessoa mobile = new Pessoa("",1985);

        mobile.setNome("Lucas Urbano");
        mobile.setDataNascimento(1985);

        System.out.println("O nome é " + mobile.getNome());
        System.out.println("Nasceu em " + mobile.getDataNascimento());
    }
}

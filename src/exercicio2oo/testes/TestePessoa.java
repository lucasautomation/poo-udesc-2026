package exercicio2oo.testes;

import exercicio2oo.classes.Pessoa;

public class TestePessoa {
    static void main(String[] args) {
        Pessoa mobile = new Pessoa("Lucas Urbano",1985);

        System.out.println("O nome é " + mobile.getNome());
        System.out.println("Nasceu em " + mobile.getDataNascimento());
        System.out.println("A idade é " + mobile.getIdade() + " anos!");

    }
}

package privado;

public class TestaFuncionario {
    static void main(String[] args) {
        Funcionario fulano = new Funcionario("Lucas Urbano",
                25,
                1800);

        /*fulano.setNome("Lucas Urbano");
        fulano.setIdade(42);
        fulano.setSalario(1800);*/

        System.out.println("Nome...: " + fulano.getNome());
        System.out.println("Idade..: " + fulano.getIdade());
        System.out.println("Salário...: " + fulano.getSalario());
    }
}

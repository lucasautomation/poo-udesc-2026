package exercicio1oo;

public class TesteAluno {
    public static void main(String[] args) {
        //Instancia o objeto classe
        Aluno aluno = new Aluno();

        //Define os atributos/ valores
        aluno.matricula = "80195";
        aluno.idade = 41;
        aluno.nome = "Lucas Urbano";
        aluno.nota1 = 8;
        aluno.nota2 = 9;
        aluno.nota3 = 7;
        aluno.nota4 = 9;

        //Imprime as informações
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("nota1: " + aluno.nota1);
        System.out.println("nota2: " + aluno.nota2);
        System.out.println("nota3: " + aluno.nota3);
        System.out.println("nota4: " + aluno.nota4);
    }
}

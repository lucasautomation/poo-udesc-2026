package exercicio3oo;

import exercicio3oo.Aluno;

public class TesteAluno {
    public static void main(String[] args) {

    Aluno aluno = new Aluno("80195", "Lucas Urbano", 41, 8, 9, 7, 9);

    //Imprime as informações
        System.out.printf("Matrícula: %s%n ",aluno.getMatricula());
        System.out.printf("Nome: %s%n ", aluno.getNome());
        System.out.printf("Idade: %d%n ", aluno.getIdade());
        System.out.printf("nota1: %d%n ", aluno.getNota1());
        System.out.printf("nota2: %d%n ", aluno.getNota2());
        System.out.printf("nota3: %d%n ", aluno.getNota3());
        System.out.printf("nota4: %d%n ", aluno.getNota4());
    }
}

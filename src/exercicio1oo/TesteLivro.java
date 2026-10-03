package exercicio1oo;

public class TesteLivro {
    public static void main(String[] args){
        Livro livro = new Livro()gg;

        livro.Autor = "Barbosa Ferraz";
        livro.Genero = "Policial";
        livro.Titulo = "Tiro pra todo lado";
        livro.Emprestado = true;

        System.out.println("O título é: " + livro.Titulo);
        System.out.println("O gênero é: " + livro.Genero);
        System.out.println("O Autor é: " + livro.Autor);
        System.out.println("Empréstimo: " + livro.Emprestado);
    }
}

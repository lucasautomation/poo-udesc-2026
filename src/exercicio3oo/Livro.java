package exercicio3oo;

public class Livro {
    private String Titulo;
    private String Autor;
    private String Genero;
    private Boolean Emprestado;

public Livro (String Titulo, String Autor, String Genero, Boolean Emprestado){
    System.out.println("...");
    this.Titulo = Titulo;
    this.Autor = Autor;
    this.Genero = Genero;
    this.Emprestado = Emprestado;
    }
    public String getTitulo() {return this.Titulo;}
    public String getAutor(){return this.Autor;}
    public String getGenero(){return this.Genero;}
    public Boolean getEmprestado(){return this.Emprestado;}

    public void setTitulo(String Titulo){this.Titulo=Titulo;}
    public void setAutor(String Autor) {this.Autor = Autor;}
    public void setGenero(String Genero){this.Genero = Genero;}
    public void setEmprestado(Boolean Emprestado){this.Emprestado = Emprestado;}
}
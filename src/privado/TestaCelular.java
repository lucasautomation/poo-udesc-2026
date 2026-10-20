package privado;

public class TestaCelular {
    static void main(String[] args) {
        Celular mobile = new Celular("Iphone", "17Promax", 2025
                );

        mobile.setMarca ("Iphone");
        mobile.setModelo("17ProMax");
        mobile.setAno(2025);

        System.out.println("Marca: " + mobile.getMarca());
        System.out.println("Modelo: " + mobile.getModelo());
        System.out.println("Ano de fabricação: " + mobile.getAno());
    }
}

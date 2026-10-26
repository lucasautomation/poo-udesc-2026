package associacoes;

import java.sql.SQLOutput;

public class TestaAssociacao {
    public static void main(String[] args) {
        Funcionario p1 = new Funcionario();
        System.out.println();

        Empresa cesmo = new Empresa ("CESMO", "DER", false);

        cesmo.setDiretor();
        System.out.println("Diretor do Cesmo " + cesmo.getDiretor().nomeCompleto());

        cesmo.setDiretor(null);
        if (cesmo.getDiretor() == null){
            System.out.println("Cesmo atualmente sem diretor");
        }
        else
            System.out.println("Diretor do Cesmo " + cesmo.getDiretor().nomeCompleto());
    }
}

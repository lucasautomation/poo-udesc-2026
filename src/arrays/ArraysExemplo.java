package arrays;
import java.util.Scanner;

class ArraysExemplo {
    static void main(String[] args) {
        int [][] matriz = new int[5][6]; //Exemplo: 5 linhas, 6 cadeiras
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- RESERVA DE CADEIRAS ---");

        // Pede a fileira para o usuário
        System.out.print("Digite a fileira desejada (0 a 4): ");
        int fila = teclado.nextInt();

        // Pede a cadeira para o usuário
        System.out.print("Digite a cadeira desejada (0 a 5): ");
        int coluna = teclado.nextInt();

        // 3. Muda a posição de 0 para 1 (Ocupado!)
        matriz[fila][coluna] = 1;
        System.out.println("\nCadeira reservada com sucesso!\n");

        //O for de fora caminha pelas fileiras
        for(int i=0; i< matriz.length; i++){
            //O for de dentro caminha pelas colunas
            for(int j=0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j]+ "");
            }
            System.out.println(); //Pula uma linha no terminal ao terminar a fileira
        }

    }
}

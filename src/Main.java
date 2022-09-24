import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int bingo[][] = new int[5][5];
        int cont = 0;
        do {
            int gerado = 0;
            int max = 15;
            int min = 1;
            boolean resultado;
            int contaLoop;
            for(int j = 0; j < 5; j++) {
                resultado = false;
                contaLoop = 0;
                while(!resultado && contaLoop < 5){
                    Random aleatorio = new Random();
                    gerado = (aleatorio.nextInt(max + 1 - min) + min );
                        for (int k = 0; k < 5; k++) {
                            if (gerado == bingo[j][k]) {
                                resultado = true;
                            }
                        }
                    if(!resultado){
                        bingo[j][contaLoop] = gerado;
                        contaLoop++;
                        resultado = false;
                    }
                }
                max += 15;
                min += 15;
            }
            cont++;
        }while(cont < 25);
        bingo[2][2] = 99;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.printf("[%d] ", bingo[j][i]);
            }
            System.out.println("");
        }
    }
}
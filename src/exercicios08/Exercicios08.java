package exercicios08;
import java.util.Scanner;

public class Exercicios08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n = entrada.nextInt();
        int m = entrada.nextInt();
        
        int[][] mat = new int[n][m];
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                mat[i][j] = entrada.nextInt();
            }
        }
        
        int num = entrada.nextInt();
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == num) {
                    System.out.printf("Position %d,%d:%n", i, j );
                    if(j>0) {
                        System.out.printf("Left: %d%n", mat[i][j -1]);
                    }
                    
                    if(i > 0) {
                        System.out.printf("Up: %d%n",mat[i-1][j]);
                    }
                    
                    if (j < mat[i].length - 1) {
                        System.out.printf("Right: %d%n", mat[i][j +1]);
                    }
                    
                    if(i < mat.length-1) {
                        System.out.printf("Down: %d%n", mat[i+1][j]);
                    }
                    
                }
            }
        }
    }
    
}

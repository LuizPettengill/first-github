package course;

import java.util.Locale;
import java.util.Scanner;

public class Matrix_diagonal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a ordem da matriz desejada?");
		int ordem = sc.nextInt();
		
		int[][] matrix = new int[ordem][ordem];
		
		System.out.printf("Agora digite os %s números para preencher a matriz: ", ordem*ordem);
		System.out.println();
		int contador = 0;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.printf("Coluna %s, linha %s: ", j+1, i+1);
				matrix[i][j] = sc.nextInt();
				if(matrix[i][j] < 0) {
					contador++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Diagonal principal:");
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				if( i == j ) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		System.out.printf("Negative numbers:%n%s", contador);
		
		sc.close();
	}

}

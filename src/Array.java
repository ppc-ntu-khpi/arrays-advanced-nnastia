import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt(); //Кількість рядків першої матриці
	   int m = sc.nextInt(); //Кількість стовпців другої матриці
	   int q = sc.nextInt(); //Кількість стовпців першої матриці та кількість рядків другої
	   int Matrix [][] = new int [n][m];
	   int Matrix1 [][] = new int [m][q];
	   int Matrix2 [][] = new int [n][q];
     
    /*
     Виведення першої матриці
    **/
	    for (int i = 0; i<n; i++){ 
	        for (int j = 0; j<m; j++){
	            Matrix [i][j]=sc.nextInt();
	        }
	    }
     /*
     Виведення другої матриці
    **/
    
		for (int i = 0; i<m; i++){
	        for (int j = 0; j<q; j++){
	            Matrix1 [i][j]=sc.nextInt();
		}
	}
    /*
     Добуток двох матриць
    **/
	for (int i = 0; i<n; i++){
	        for (int u = 0; u<q; u++){
	            for (int j = 0; j<m; j++){
	            Matrix2[i][u]+=Matrix [i][j]* Matrix1 [j][u];
} 
	}
	}

    /*
     Виведення третьої матриці (результат підрахунку)
    **/
	for (int i = 0; i<m; i++){
	        for (int j = 0; j<q; j++){
	             System.out.print(Matrix2[i][u]+" ");
	        }
	        System.out.println();
	}
	}
}
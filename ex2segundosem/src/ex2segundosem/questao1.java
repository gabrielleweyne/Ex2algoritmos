package ex2segundosem;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x;
		System.out.println("Informe o número de linhas da matriz:");
		x = in.nextInt();
		int y;
		System.out.println("Informe o número de colunas da matriz:");
		y = in.nextInt();
		
		
		int[][] n = new int [x][y];
		
		gerarmatriz(n, x, y);
		escanearmatriz(n, x, y);
		}
	
	
		public static int[][] gerarmatriz(int[][] n, int x, int y) {
			Scanner in = new Scanner(System.in);
			for (int i = 0; i < x; i++) {
				for(int j = 0; j < y; j++) {
					System.out.println("Informe o número que irá em cada posição ("+i+"/"+j+"):");
					n[i][j] = in.nextInt();}}
			for (int i = 0; i < x; i++) {
				for(int j = 0; j < y; j++) {
					System.out.print(n[i][j]+"\t");	}
				System.out.println();}
			return n;}
		
		
		public static void escanearmatriz(int[][] n, int x, int y) {
			Scanner in = new Scanner(System.in);
			int a;
			System.out.println("Informe o número a ser escaneado na matriz:");
			a = in.nextInt();
			
			boolean b;
			b = false;
			
			for (int i = 0; i < x; i++) {
				for(int j = 0; j < y; j++) {
					if(a == n[i][j]) {
						b = true;
						System.out.println("O número se encontra na(s) posição(ões):"+i+"/"+j);}}}
					if (b == false) {
				System.out.println("X não se encontra na matriz");}
					}	}


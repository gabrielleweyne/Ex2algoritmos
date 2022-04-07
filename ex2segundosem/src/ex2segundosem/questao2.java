package ex2segundosem;
import java.util.*;
public class questao2 {


	public static void main(String[] args) {

			int[][] x = new int[4][4];
			int[] help = new int[6];
			preencher(x, help);
			copiar(x);
			printar(x, help);
			
			
		}
		public static int[][] preencher(int x[][], int help[]){
			
			Random gen = new Random();
			int aux = 0, aux2;
			
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					x[i][j] = gen.nextInt(10);
					System.out.print(x[i][j]+"\t");
					if(i > j) {
						help[aux] = x[i][j];
						aux++;
					}
				}
				System.out.println();
			}
			aux2 = help[2];
			help[2] = help[3];
			help[3] = aux2;
			aux = 0;
			System.out.println();
			return x;
		}
		public static int[][] copiar(int[][] x){
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(i < j) {
						x[j][i] = x[i][j];
					}
					System.out.print(x[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println();
			return x;
		}
		public static void printar(int x[][], int help[]) {
			int aux = 0;
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(j > i ) {
						x[i][j] = help[aux];
						aux++;
					}
					System.out.print(x[i][j]+"\t");
				}
				System.out.println();
			}
		}
		
	}



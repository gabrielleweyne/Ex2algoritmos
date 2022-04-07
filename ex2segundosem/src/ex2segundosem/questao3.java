package ex2segundosem;

import java.util.*;

public class questao3 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int alunos;
		System.out.println("Informe o número de estudantes:");
		alunos = in.nextInt();
		int aux;
		aux = 0;
		int nota;
		nota = 0;
		
		String [] gabarito = new String [10];
		String [] respostas = new String [10];
		
		Random rng = new Random();
		
		Gerargabarito(gabarito);
		Correcao(respostas, alunos, aux, nota, gabarito);
	}
	
	public static String[] Gerargabarito(String[] gabarito){
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe o gabarito da questão "+(i+1));
			gabarito[i] = in.next();
		}
		return gabarito;
	}
	
	public static void Correcao(String[] respostas, int alunos, int aux, int nota, String[] gabarito){
		Random rng = new Random();
		for(int w = 0; w < alunos; w++) {
			for(int i = 0; i < 10; i++) {
				aux = rng.nextInt(5);
				switch(aux) {
					case 0:
						respostas[i] = "a";
						break;
					case 1:
						respostas[i] = "b";
						break;
					case 2:
						respostas[i] = "c";
						break;
					case 3:
						respostas[i] = "d";
						break;
					case 4:
						respostas[i] = "e";
						break;
						}
				System.out.print(respostas[i]+"\t");
						}
				for(int h = 0; h < 10; h++) {
					if(respostas[h].equals(gabarito[h])) {
						nota+=1;
						}
				}
				if(nota > 7) {
					System.out.print("Nota = "+nota+" Aprovado");}
				else {
					System.out.print("Nota = "+nota+" Reprovado");
						}
				System.out.println();
				nota = 0;

			}
	} }	
	
	
	
	

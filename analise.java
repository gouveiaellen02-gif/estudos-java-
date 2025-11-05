package br.edu.fatecpg.estudos.view;
import java.util.Scanner;

public class analise {

	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Digite um numero inteiro e positivo:");
		
	  int numero = entrada.nextInt(); // Lê o número digitado pelo usuário
		
		 if (numero % 2 == 0) {
	            System.out.println("O número " + numero + " é PAR.");
	        } else {
	            System.out.println("O número " + numero + " é ÍMPAR.");
	        }

	        entrada.close();
	    }
	
	
	
   }


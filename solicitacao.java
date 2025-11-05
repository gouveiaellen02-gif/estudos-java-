package br.edu.fatecpg.estudos.view;
import java.util.Scanner;


public class solicitacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner solicitacao = new Scanner(System.in); // por ser uma solicitacao de numeros para o usuário, é imprescindível o uso do Scanner para ler os valores
		 
		  System.out.print("Digite o primeiro número: ");
	        int num1 = solicitacao.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int num2 = solicitacao.nextInt();

	        System.out.print("Digite o terceiro número: ");
	        int num3 = solicitacao.nextInt();

	        // Verifica se todos são iguais
	        if (num1 == num2 && num2 == num3) {
	            System.out.println("Todos os números são IGUAIS! Valor: " + num1);
	        } 
	        // Caso contrário, encontra o maior
	        else {
	            int maior = num1;

	            if (num2 > maior) {
	                maior = num2;
	            }
	            if (num3 > maior) {
	                maior = num3;
	            }

	            System.out.println("O maior número é: " + maior);

	            // Agora verifica se há números iguais (mas não todos)
	            if (num1 == num2 || num1 == num3 || num2 == num3) {
	                System.out.println("Existem números IGUAIS entre os digitados!");
	            } else {
	                System.out.println("Todos os números são DIFERENTES!");
	            }
	        }

	        solicitacao.close();
	    }
	}



	     
package br.senai.sp.jandira;

import java.util.Scanner;



public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double largura, comprimento, areaDoComodo, areaTotal, numeroDeComodos;
		String nome, resposta;
		

		areaTotal = 0;

		System.out.println("Olá! Deseja adicionar um comôdo? (S/N)");
		resposta = teclado.nextLine();
		
			for (;resposta.equals("S");) {
				System.out.println("Qual o nome do cômodo?");
				nome = teclado.nextLine();

				System.out.println("Qual a largura do comôdo " + nome + "?");
				largura = teclado.nextDouble();

				System.out.println("E enquanto ao comprimento do local?");
				comprimento = teclado.nextDouble();

				areaDoComodo = comprimento * largura;

				System.out.println("A área do comôdo " + nome + " é de: " + areaDoComodo + "m²");
				teclado.nextLine();

				areaTotal += areaDoComodo;

				System.out.println("Deseja adionar outro cômodo? (S/N)");
				resposta = teclado.nextLine();
				
				if (resposta.equalsIgnoreCase("N")) {
					break; 
			}

		}
			System.out.println("A área total da residência é: " + areaTotal); 

		
		}

	}



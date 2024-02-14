package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quanatas pessoas você vai digitar? ");
		n = sc.nextInt();
		
		Pessoa[] pessoas= new Pessoa[n];
		int[] idades = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			
			System.out.println("Dados da pessoa " + (i+1) + ":");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			pessoas[i] = new Pessoa(nome,idade);
			idades[i] = idade;		
		}
		
		int maisVelho = 0;
		for(int i=0 ; i<n; i++) {
			if(idades[i] > idades[maisVelho]) {
				maisVelho = i;
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + pessoas[maisVelho].getNome());
		
		sc.close();
	}

}

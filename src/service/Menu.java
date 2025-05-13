package service;

import java.util.Scanner;

public class Menu {
		Scanner sc = new Scanner(System.in);
		
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao sistema de cadastro, no que posso ajudá-lo?");
		System.out.print("\n" +
		"1. Cadastrar um novo pet\n" + 
		"2. Alterar dados do pet cadastrado\n" + 
		"3. Deletar um pet cadastrado\n" + 
		"4. Listar todos os pets cadastrados\n" + 
		"5. Listar pets por algum critério (idade, nome, raça)\n" + 
		"6. Sair\n" + 
		"\n");
		
		System.out.println("O que deseja? (Digite o número da opção)");
		int n = sc.nextInt();
		sc.nextLine();
		
		return n;
	}

}

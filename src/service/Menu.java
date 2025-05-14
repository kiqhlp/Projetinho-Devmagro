package service;

import java.util.Scanner;

import entities.enums.Tipo;

public class Menu {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {

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

	public static Tipo menuTipo() {

		System.out.println("Por qual tipo de Pet deseja buscar?(Cachorro/Gato)");
		Tipo tp = Tipo.valueOf(sc.nextLine());

		return tp;

	}

	public static int menuBuscar() {

		System.out.println("Deseja listar os animais por qual critério?");
		System.out.print("\n" + 
				"1. Nome ou sobrenome\n" + 
				"2. Sexo\n" + 
				"3. Idade\n" + 
				"4. Peso\n" + 
				"5. Raça\n" + 
				"6. Endereço\n" + 
				"7. Retornar ao Menu Principal\n" + 
				"\n");

		System.out.println("Por qual critério deseja? (Digite o número da opção)");
		int n = sc.nextInt();
		sc.nextLine();

		return n;
	}

}

package service;

import java.util.Scanner;

import entities.enums.Tipo;

public class Busca {

	public static void busca() {
		Scanner sc = new Scanner(System.in);
		Tipo t = Menu.menuTipo();

		int i = Menu.menuBuscar();

		switch (i) {
		case 1:
			System.out.println("Deseja adicionar o critério IDADE a sua busca?(s/n)");
			String r = sc.nextLine();
			if (r.equals("s")) {
			}
			System.out.println("Digite o nome e/ou o sobrenome do Pet:");
			String petName = sc.nextLine();

			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			Opcoes.opcoes();
			break;
		default:
			System.out.println("VALOR INVÁLIDO!");
			Busca.busca();
			break;
		}
	}

}

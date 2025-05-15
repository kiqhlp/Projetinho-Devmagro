package service;

import java.util.Scanner;

import entities.enums.Sexo;
import entities.enums.Tipo;

public class Busca {

	public static void busca() {
		Scanner sc = new Scanner(System.in);
		Tipo t = Menu.menuTipo();

		int i = Menu.menuBuscar();

		switch (i) {
		case 1:
			System.out.println("Deseja adicionar o critério IDADE a sua busca?(s/n)");
			String r1 = sc.nextLine();
			if (r1.equals("s")) {
			}
			System.out.println("Digite o nome e/ou o sobrenome da busca desejada:");
			String petName = sc.nextLine();
			break;
		case 2:
			System.out.println("Digite o sexo da busca desejada: (Macho/Fêmea)");
			Sexo petSexo = Sexo.valueOf(sc.nextLine());
			break;
		case 3:
			System.out.println("Deseja adicionar o critério PESO a sua busca:(s/n)");
			String r2 = sc.nextLine();
			if (r2.equals("s")) {
			}
			System.out.println("Digite a idade aproximada do Pet da busca desejada:");
			Double petAge = sc.nextDouble();
			break;
		case 4:
			System.out.println("Digite o peso do Pet da busca desejada:");
			Double petPeso = sc.nextDouble();
			break;
		case 5:
			System.out.println("Digite a raça do Pet da busca desejada:");
			String petRaca = sc.nextLine();
			break;
		case 6:
			String ncasa, cidade, rua, end, confirmacao;
			System.out.println("Digite o Endereço do Pet da busca desejada");
			System.out.println("Número da Casa:");
			ncasa = sc.nextLine();
			System.out.println("Cidade:");
			cidade = sc.nextLine();
			System.out.println("Rua:");
			rua = sc.nextLine();
			end = cidade + ", Rua " + rua + ", Número " + ncasa;
			System.out.println("Confira seu endereço: " + end);
			System.out.println("Seu endereço está correto? (s/n)");
			confirmacao = sc.nextLine();
			if (!confirmacao.equals("s")) {
				System.out.println("Tente Novamente");
				Busca.busca();
			}
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

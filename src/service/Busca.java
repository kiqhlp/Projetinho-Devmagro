package service;

import java.util.List;
import java.util.Scanner;

import entities.Pet;
import entities.enums.Sexo;
import entities.enums.Tipo;

public class Busca {

	public static void busca(List<Pet> pets) {
		
		Scanner sc = new Scanner(System.in);
		Tipo t = Menu.menuTipo(); // TIPO

		int i = Menu.menuBuscar();

		switch (i) {
		case 1: //NOME COM IDADE
			System.out.println("Deseja adicionar o critério IDADE a sua busca?(s/n)");
			String r1 = sc.nextLine();
			if (r1.equals("s")) {
			}
			System.out.println("Digite o nome e/ou o sobrenome da busca desejada:");
			String petName = sc.nextLine();
			break;
		case 2: //SEXO
			System.out.println("Digite o sexo da busca desejada: (Macho/Fêmea)");
			Sexo petSexo = Sexo.valueOf(sc.nextLine());
			break;
		case 3: //IDADE COM PESO
			System.out.println("Deseja adicionar o critério PESO a sua busca:(s/n)");
			String r2 = sc.nextLine();
			if (r2.equals("s")) {
			}
			System.out.println("Digite a idade aproximada do Pet da busca desejada:");
			Double petAge = sc.nextDouble();
			break;
		case 4: //PESO
			System.out.println("Digite o peso do Pet da busca desejada:");
			Double petPeso = sc.nextDouble();
			break;
		case 5: //RAÇA
			System.out.println("Digite a raça do Pet da busca desejada:");
			String petRaca = sc.nextLine();
			Busca.buscaRaca(pets, petRaca);

			break;
		case 6: //ENDEREÇO
			String ncasa, cidade, rua, petEnde, confirmacao;
			System.out.println("Digite o Endereço do Pet da busca desejada");
			System.out.println("Número da Casa:");
			ncasa = sc.nextLine();
			System.out.println("Cidade:");
			cidade = sc.nextLine();
			System.out.println("Rua:");
			rua = sc.nextLine();
			petEnde = cidade + ", Rua " + rua + ", Número " + ncasa;
			System.out.println("Confira seu endereço: " + petEnde);
			System.out.println("Seu endereço está correto? (s/n)");
			confirmacao = sc.nextLine();
			if (!confirmacao.equals("s")) {
				System.out.println("Tente Novamente");
				Busca.busca(pets);
			}
			break;
		case 7: // RETORNO AO MENU INICIAL
			Opcoes.opcoes(pets);
			break;
		default:
			System.out.println("VALOR INVÁLIDO!");
			Busca.busca(pets);
			break;
		}
	}
	
	/* public static void buscaTipo(List<Pet> pets, Tipo t) {
		boolean encontrado = false;
		for (Pet pet : pets) {
			if (pet.getTipo().equals(t)) {
				System.out.println(pet);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Nenhum pet encontrado com a tipo " + t);
			
		}
	} */

	public static void buscaNome(List<Pet> pets, String petNome) {
		boolean encontrado = false;
		for (Pet pet : pets) {
			if (pet.getName().equalsIgnoreCase(petNome)) {
				System.out.println(pet);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Nenhum pet encontrado com o nome " + petNome);

		}
	}
	
	public static void buscaIdade(List<Pet> pets, Double petAge) {
		boolean encontrado = false;
		for (Pet pet : pets) {
			if (pet.getIdade().equals(petAge)) {
				System.out.println(pet);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Nenhum pet encontrado com a idade " + petAge);

		}
	}
	
	public static void buscaSexo(List<Pet> pets, Sexo petSexo) {
		boolean encontrado = false;
		for (Pet pet : pets) {
			if (pet.getSexo().equals(petSexo)) {
				System.out.println(pet);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Nenhum pet encontrado com o sexo " + pets);

		}
	}
	
	public static void buscaPeso(List<Pet> pets, Double petPeso) {
		boolean encontrado = false;
		for (Pet pet : pets) {
			if (pet.getPeso().equals(petPeso)) {
				System.out.println(pet);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Nenhum pet encontrado com o peso " + petPeso);

		}
	}

	public static void buscaRaca(List<Pet> pets, String petRaca) {
		boolean encontrado = false;
		for (Pet pet : pets) {
			if (pet.getRaca().equalsIgnoreCase(petRaca)) {
				System.out.println(pet);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Nenhum pet encontrado com a raça " + petRaca);

		}
	}
	
	public static void buscaEndereco(List<Pet> pets, String petEnde) {
		boolean encontrado = false;
		for (Pet pet : pets) {
			if (pet.getEndereco().equalsIgnoreCase(petEnde)) {
				System.out.println(pet);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("Nenhum pet encontrado com o endereço " + petEnde);

		}
	}
	
}

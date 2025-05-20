package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pet;
import service.Opcoes;

public class main_projetinho {

	public static void main(String[] args) {
		List<Pet> pets = null;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Opcoes.opcoes(pets);

		sc.close();
		


	}

}

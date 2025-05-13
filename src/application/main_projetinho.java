package application;

import java.util.Locale;
import java.util.Scanner;

import service.Opcoes;

public class main_projetinho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Opcoes.opcoes();

		sc.close();
		


	}

}

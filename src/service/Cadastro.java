package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import entities.Pet;
import entities.enums.Sexo;
import entities.enums.Tipo;

public class Cadastro {

	public static void cadastro() {
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\kiqhl\\Documents\\Estudos de Programação\\Udemy\\Java Nélio Alves\\ws_eclipse\\projetinho_cadastro\\Projetinho\\formulario.txt";
		String name, ni, end, ncasa, cidade, rua, confirmacao, raca, pesostr, agestr;
		Double peso = null, age = null;
		Sexo sexo = null;
		Tipo tipo = null;
		ni = "NÃO INFORMADO";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			if (line != null) {
				System.out.println(line);
				do {
					name = sc.nextLine();
					if (name == null || name.equals("")) {
						name = ni;
					} else {
						Pet.validacao(name);
						if (Pet.validacao(name) == false) {
							System.out.print("\nNOME INVÁLIDO, Tente Novamente\n"
									+ "O nome deve ser composto pelo primeiro nome e sobrenome do animal\n"
									+ "Não pode conter números e nem caracteres especiais (como @, !, % e etc.) \n"
									+ "Digite o nome novamente: ");
						}
					}
				} while (Pet.validacao(name) == false);

				;

				line = br.readLine();
				System.out.println(line);
				try {
					tipo = Tipo.valueOf(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Error:" + e.getMessage());
					System.exit(1);
				}

				line = br.readLine();
				System.out.println(line);
				try {
					sexo = Sexo.valueOf(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Error:" + e.getMessage());
					System.exit(1);
				}

				line = br.readLine();
				System.out.println(line);
				do {
					System.out.println("Número da Casa:");
					ncasa = sc.nextLine();
					if (ncasa == null || ncasa.equals("")) {
						ncasa = ni;
					}
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
					}
				} while (!confirmacao.equals("s"));

				line = br.readLine();
				System.out.println(line);
				try {
					agestr = sc.nextLine();
					if (agestr == null || agestr.equals("")) {
						agestr = ni;
					}
					if (agestr != ni) {
						String[] computStr = agestr.split("\\D+");
						if (computStr.length == 1) {
							double anos = Double.parseDouble(computStr[0]);
							age = anos;
						}
						if (computStr.length == 2) {
							double anos = Double.parseDouble(computStr[0]);
							double meses = Double.parseDouble(computStr[1]) / 12;
							String arredondamento = String.format("%.2f", meses);
							double mesesFinal = Double.parseDouble(arredondamento.replace(",", "."));
							age = anos + mesesFinal;
						}
						if (age > 20) {
							throw new IllegalAccessException("Valor não pode ser maior que 20.");
						}
					}

				} catch (Exception e) {
					System.out.println("Error:" + e.getMessage());
					System.exit(1);
				}

				line = br.readLine();
				System.out.println(line);
				try {
					pesostr = sc.nextLine();
					if (pesostr == null || pesostr.equals("")) {
						pesostr = ni;
					}
					if (pesostr != ni) {
						String[] computStr = pesostr.split("[^0-9,]+");
						double pesof = Double.parseDouble(computStr[0].replace(",", "."));
						peso = pesof;
						if (peso > 60 || peso < 0.5) {
							throw new IllegalAccessException("Valor deve estar entre 0,5kg e 60kg.");
						}
					}

				} catch (Exception e) {
					System.out.println("Error:" + e.getMessage());
					System.exit(1);
				}

				line = br.readLine();
				System.out.println(line);
				do {
					raca = sc.nextLine();
					if (raca == null || raca.equals("")) {
						raca = ni;
					}
					Pet.validacao2(raca);
					if (Pet.validacao2(raca) == false) {
						System.out.print("\nRAÇA INVÁLIDA, Tente Novamente\n"
								+ "A raça não pode conter números e nem caracteres especiais (como @, !, % e etc.) \n"
								+ "Digite o nome novamente: ");
					}
				} while (Pet.validacao2(raca) == false);

				System.out.println("CONFIRA OS DADOS DO PET CADASTRADO:");
				System.out.print("\n Nome: " + name + "\n Tipo: " + tipo + "\n Sexo: " + sexo + "\n Endereço: " + end
						+ "\n Idade: " + age + " Anos \n Peso: " + peso + " Kg \n Raça:  " + raca + "\n");
				System.out.println("Deseja confirmar o cadastro? (s/n)");
				String confirmacaoFinal = sc.nextLine();
				if (!confirmacaoFinal.equals("s")) {
					System.out.println("CADASTRO CANCELADO");
					Opcoes.opcoes();
				} else {
					Pet pet = new Pet(name, tipo, sexo, end, age, peso, raca);
					pet.addPet(pet);
					System.out.println("Novo Pet Cadastrado!");
				}

				PetSave.fileName(name);
				PetSave.petSave(name, tipo, sexo, end, age, peso, raca);

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}

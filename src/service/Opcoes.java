package service;

public class Opcoes {
	
	public static void opcoes (){
		int i = Menu.menu();
		
		switch (i) {
		case 1:
			Cadastro.cadastro();
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
		default:
			System.out.println("VALOR INVÁLIDO!");
			Opcoes.opcoes();
			break;
		}
		
	}

}

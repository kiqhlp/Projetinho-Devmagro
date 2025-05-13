package service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.Sexo;
import entities.enums.Tipo;


public class PetSave {

	public static String fileName(String petName) {
		SimpleDateFormat sdfData = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdfHora = new SimpleDateFormat("HHmm");
		Date agora = new Date();

		String horaAgora = sdfData.format(agora) + "T" + sdfHora.format(agora);
		String upperName = petName.replaceAll("\\s+", "").toUpperCase();

		String fileFinalName = horaAgora + "-" + upperName;

		boolean create = new File("C:\\Users\\kiqhl\\Documents\\Estudos de Programação\\Udemy\\Java Nélio Alves\\ws_eclipse\\projetinho_cadastro\\Projetinho" + "\\petsCadastrados").mkdir();
		String pathSaida = "C:\\Users\\kiqhl\\Documents\\Estudos de Programação\\Udemy\\Java Nélio Alves\\ws_eclipse\\projetinho_cadastro\\Projetinho\\petsCadastrados\\" + fileFinalName + ".txt";
		return pathSaida;

	}
	
	
	public static void petSave(String petName ,Tipo tipo, Sexo sexo, String petEnd, Double petAge, Double petPeso, String petRaca) {
		String petAgestr = Double.toString(petAge) + " Anos";
		String petPesostr = Double.toString(petPeso) + "Kg";
		
		String[] linhas =  new String[] {petName, tipo.toString(), sexo.toString(), petEnd, petAgestr, petPesostr, petRaca};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(PetSave.fileName(petName)))) {
			int i = 0;
			for (String linha : linhas) {
				i++;
				bw.write(i + ". ");
				bw.write(linha);
				bw.newLine();
			}
			
			
		} catch (IOException e ) {
			e.printStackTrace();
		}
		
	}

}

package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Sexo;
import entities.enums.Tipo;

public class Pet {
	private String name;
	private Tipo tipo;
	private Sexo sexo;
	private String endereco;
	private Double idade;
	private Double peso;
	private String raca;
	
	private List<Pet> pets = new ArrayList<>();
	
	public Pet() {
		}

	public Pet(String name, Tipo tipo, Sexo sexo, String endereco, Double idade, Double peso, String raca) {
		
		this.name = name;
		this.tipo = tipo;
		this.sexo = sexo;
		this.endereco = endereco;
		this.idade = idade;
		this.peso = peso;
		this.raca = raca;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Double getIdade() {
		return idade;
	}
	public void setIdade(Double idade) {
		this.idade = idade;
	}

	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getRaca() {
		return raca;
	} 
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void addPet(Pet pet) {
		pets.add(pet);
	}
	public void remove(Pet pet) {
		pets.remove(pet);
	}
	
	//Métodos	
	public static boolean validacao(String nomeCompleto) {
		try {			
			String[] partes = nomeCompleto.trim().split("\\s+");
			if (partes.length != 2 && partes.length !=3) {
				return false;}
			String regex = "^[A-Za-zÀ-ÿ]+$";
			if (partes.length == 2) {
				return partes[0].matches(regex) && partes[1].matches(regex);
			}
			if (partes.length == 3) {
				return partes[0].matches(regex) && partes[1].matches(regex) && partes[2].matches(regex);
			}
        } catch (Exception e) {System.out.println("Erro: " + e.getMessage());}
		return false;
	}
	
	public static boolean validacao2(String texto) {
	    return texto.matches("[A-Za-zÀ-ÿ ]+");
	}
	

}

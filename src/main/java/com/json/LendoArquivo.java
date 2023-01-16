package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LendoArquivo {
	public static void main(String[] args) {
		/*Vamos usar o:
		 * JSONParser -> passa para criar o atributo
		 * 
		 * */
		
		JSONObject pikachu;
		
		JSONParser evoluir = new JSONParser();
		
		String nome;
		String sobrenome;
		String estado;
		String pais;
		
		try {
			pikachu = (JSONObject) evoluir.parse(new FileReader("dado.json"));
			
			//Salva nas variaveis os dados retirados do arquivo
			nome = (String) pikachu.get("nome");
			sobrenome = (String) pikachu.get("sobrenome");
			estado = (String) pikachu.get("estado");
			pais = (String) pikachu.get("pais");
			
			System.out.printf(
					"Nome: %s\nSobrenome: %s\nEstado: %s\nPais: %s\n",
					nome, sobrenome, estado, pais);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}

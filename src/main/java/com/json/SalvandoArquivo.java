package com.json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class SalvandoArquivo {
	public static void main(String[] args) {
		/*Esta é uma tentativa de criar um arquivo JSON
		 * 
		 * Lib: org.json
		 * */
		
		//Cria Obj JSON
		JSONObject pikachu = new JSONObject();
		
		//Escrever
		FileWriter choqueDoTrovao = null;
		
		//Armazena dados no JSON
		pikachu.put("nome", "Barros");
		pikachu.put("sobrenome", "Moraes");
		pikachu.put("pais", "Brasil");
		pikachu.put("Estado", "SP");
		
		try {
			choqueDoTrovao = new FileWriter("dado.json");
			
			choqueDoTrovao.write(pikachu.toString());
			choqueDoTrovao.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(pikachu);
	}
}

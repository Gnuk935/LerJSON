package com.json;

import org.json.JSONObject;

public class CriandoDoZero {
	public static void main(String[] args) {
		/*
		 * JSONObject = Armazena um objeto JSON
		 * 
		 * get() | opt() -> acessa os valores por nome
		 * 
		 * put() modifica valores
		 * 
		 * Lib: org.json
		 */

		// Chama o obj que cria o JSON
		JSONObject pikachu = new JSONObject();

		// Cria os campos e os prenche
		pikachu.put("Nome", "Victor Barros");
		pikachu.put("Idade", "17");

//		String pika_texto = pikachu.toString();
//		System.out.println("objeto original -> " + pika_texto);

		// para alterar campos basta rodar o put novamente com o novo nome!

		String nome = pikachu.getString("Nome");
		Integer idade = pikachu.getInt("Idade");

		System.out.println(nome);
		System.out.println(idade);

	}
}

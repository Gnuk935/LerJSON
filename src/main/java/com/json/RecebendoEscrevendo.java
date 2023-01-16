package com.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class RecebendoEscrevendo {
	public static void main(String[] args) {

		JSONObject pikachu = new JSONObject();
		FileWriter escreve = null;
		String nome;

		try (Scanner s = new Scanner(System.in)) {

			System.out.println("Informe seu nome:");
			nome = s.next();

			pikachu.put("Nome", nome);

			try {
				escreve = new FileWriter("dado.json");

				escreve.write(pikachu.toString());
				escreve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println(pikachu);
			s.close();
		}

	}
}

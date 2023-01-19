package com.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class RecebendoEscrevendo {
	public static void main(String[] args) {

		JSONObject pikachu = new JSONObject();
		FileWriter escreve = null;
		String[] nome = new String[5];

		try (Scanner s = new Scanner(System.in)) {

			for (int i = 0; i < nome.length; i++) {

				System.out.println("Informe seu nome:");
				nome[i] = s.next();

				pikachu.put("Nome", nome[i]);
			}

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

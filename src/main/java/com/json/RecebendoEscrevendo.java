package com.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;

public class RecebendoEscrevendo {
	public static void main(String[] args) {
		
		JSONObject pikachu = new JSONObject();
		FileWriter escreve = null;
		String placa;
		Integer renavam;
		
		
		try (Scanner s = new Scanner(System.in)) {

			System.out.println("Informe a placa:");
			placa = s.next();
			
			System.out.println("Informe o renavam");
			renavam = s.nextInt();
			
			pikachu.put("placa", placa);
			pikachu.put("renavam", renavam);
			
			try {
				escreve = new FileWriter("dado.json");
				
				escreve.write(pikachu.toString());
				escreve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println(pikachu);
		}
		
		
	}
}

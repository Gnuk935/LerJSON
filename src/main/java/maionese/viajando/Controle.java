package maionese.viajando;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Controle {
public void teste() {
	JSONArray jArray = new JSONArray();

	FileWriter escreve = null;

	JSONObject objOne = new JSONObject();
	JSONObject objTwo = new JSONObject();

	Dados dOne = new Dados();
	Dados dTwo = new Dados();

	View v = new View();

	try (Scanner s = new Scanner(System.in)) {
		try {

			v.nome();
			dOne.setNome(s.next());

			v.tel();
			dOne.setTelefone(s.nextInt());

			v.nasc();
			dOne.setNascimento(s.nextInt());

			v.cpf();
			dOne.setCpf(s.next());

			objOne.put("Nome", dOne.getNome());
			objOne.put("Telefone", dOne.getTelefone());
			objOne.put("Nascimento", dOne.getNascimento());
			objOne.put("CPF", dOne.getCpf());

			v.nome();
			dTwo.setNome(s.next());

			v.tel();
			dTwo.setTelefone(s.nextInt());

			v.nasc();
			dTwo.setNascimento(s.nextInt());

			v.cpf();
			dTwo.setCpf(s.next());

			objTwo.put("Nome", dTwo.getNome());
			objTwo.put("Telefone", dTwo.getTelefone());
			objTwo.put("Nascimento", dTwo.getNascimento());
			objTwo.put("CPF", dTwo.getCpf());

			jArray.put(objOne);
			jArray.put(objTwo);

			System.out.println(jArray);

			try {
				escreve = new FileWriter("dado.json");

				escreve.write(objOne.toString());
				escreve.write(objTwo.toString());

				escreve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

}
}

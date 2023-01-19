package novo.json;

import org.json.JSONException;
import org.json.simple.JSONObject;

public class CriarJSON {
	/*
	 * ESTE SEGUE O TUTORIAL DE: Oficina de NET
	 * 
	 * Este é um exemplo de JSONObject
	 * 
	 * 
	 */

	public static void main(String[] args) {
		try {
			Pessoa p = new Pessoa();
			p.setNome("Fernanda");
			p.setTelefone("12345678");

			JSONObject obj = new JSONObject();
			obj.put("nome", p.getNome());
			obj.put("Telefone", p.getTelefone());
			
			System.out.println(obj);
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}
}

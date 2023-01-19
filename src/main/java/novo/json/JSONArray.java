package novo.json;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONArray {
	public static void main(String[] args) {
		try {
			org.json.JSONArray ja = new org.json.JSONArray();
			JSONObject objOne = new JSONObject();
			Pessoa pOne = new Pessoa();

			pOne.setNome("Victor");
			pOne.setTelefone("84477341");

			objOne.put("nome", pOne.getNome());
			objOne.put("Telefone", pOne.getTelefone());

			JSONObject objTwo = new JSONObject();
			Pessoa pTwo = new Pessoa();

			pTwo.setNome("Barros");
			pTwo.setTelefone("84040944");

			objTwo.put("Nome", pTwo.getNome());
			objTwo.put("Telefone", pTwo.getTelefone());

			ja.put(objOne);
			ja.put(objTwo);

			System.out.println(ja);
		} catch (JSONException e) {
			e.printStackTrace();

		}
	}
}

package br.com.projeto.caca.palavras.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class AprendendoHashMap {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("user", "maria");
		map.put("phone", "11912345678");
		map.put("notebook", "Acer Aspire 3");
		System.out.println(map);

		for (String key : map.keySet()) {
			System.out.println("Chave: " + key + " valor: " + map.get(key));

		}

	}

}

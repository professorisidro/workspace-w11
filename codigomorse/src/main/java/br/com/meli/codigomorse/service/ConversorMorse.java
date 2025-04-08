package br.com.meli.codigomorse.service;

import java.util.HashMap;

import br.com.meli.codigomorse.dto.RequestDTO;
import br.com.meli.codigomorse.dto.ResponseDTO;

public class ConversorMorse {

	public static HashMap<String, String> mapa = new HashMap<String, String>() {
		{
			put(".-", "A");
			put("-...", "B");
			put("-.-.", "C");
			put("-..", "D");
			put(".", "E");
			put("..-.", "F");
			put("--.", "G");
			put("....", "H");
			put("..", "I");
			put(".---", "J");
			put("-.-", "K");
			put(".-..", "L");
			put("--", "M");
			put("-.", "N");
			put("---", "O");
			put(".--.", "P");
			put("--.-", "Q");
			put(".-.", "R");
	        put("...", "S");
	        put("-", "T");
	        put("..-", "U");
	        put("...-", "V");
	        put(".--", "W");
	        put("-..-", "X");
	        put("-.--", "Y");
	        put("--..", "Z");
	        put(".----", "1");
	        put("..---", "2");
	        put("...--", "3");
	        put("....-", "4");
	        put(".....", "5");
	        put("-....", "6");
	        put("--...", "7");
	        put("---..", "8");
	        put("----.", "9");
	        put("-----", "0");
	        put("..--..", "?");
	        put("-.-.--", "!");
	        put(".-.-.-", ".");
	        put("--..--", ",");;
		}
	};

	public static ResponseDTO converter(RequestDTO request) {
		StringBuilder str = new StringBuilder();
		String palavras[] = request.morseCode().split("   ");
		for (String palavra: palavras) {
			str.append(decodeWord(palavra)+ " ");
		}
		return new ResponseDTO(str.toString().trim());
	}
	
	private static String decodeWord(String morseWord) {
		String letrasMorse[] = morseWord.split(" ");
		StringBuilder str = new StringBuilder();
		for (String s: letrasMorse) {
			str.append(mapa.get(s));
		}
		return str.toString();
	}
}

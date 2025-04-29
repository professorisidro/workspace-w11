package br.com.meli.numerosromanos.service;

import org.springframework.stereotype.Service;

import br.com.meli.numerosromanos.exceptions.OutOfRangeException;

@Service
public class ConversorService {
	
	private String[] romanUnity  = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	private String[] romanDecene = {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}; 
	public String converterParaRomanos(int numero) {
		if (numero <= 0 || numero >= 100) {
			throw new OutOfRangeException("Numero "+numero+" nao pode ser convertido");
		}
		return romanDecene[numero / 10] + romanUnity[numero % 10];
	}

}

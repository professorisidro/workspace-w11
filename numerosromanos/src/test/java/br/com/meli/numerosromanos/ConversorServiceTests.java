package br.com.meli.numerosromanos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.numerosromanos.exceptions.OutOfRangeException;
import br.com.meli.numerosromanos.service.ConversorService;

@SpringBootTest
public class ConversorServiceTests {
	
	@Autowired
	private ConversorService service;
	
	
	@ParameterizedTest
	@CsvSource({"1,I",
		        "2,II",
		        "3,III",
		        "4,IV",
				"5,V",
				"6,VI",
				"7,VII",
				"8,VIII",
				"9,IX"})
	@DisplayName("Teste para converter unidades")
	public void shouldConvertOneDigitArabicNumberToRoman(int arabic, String roman) {
		assertEquals(service.converterParaRomanos(arabic), roman);
	}
	
	@ParameterizedTest
	@CsvSource({"10, X",
		        "32,XXXII",
		        "49,XLIX",
		        "88, LXXXVIII"})
	@DisplayName("Agora testes com dezenas")
	public void shuldConvertTwoDigitArabicNumbersToRoman(int arabic, String roman) {
		assertEquals(service.converterParaRomanos(arabic), roman);
	}
	
	@ParameterizedTest
	@CsvSource({"0,abcd",
	           	"-1,xyzw", 
	            "100,mnop"})
	@DisplayName("Numeros fora do espectro de conversao")
	public void shouldThrowOutOfRangeException(int arabic, String roman) {
		assertThrows(OutOfRangeException.class, () ->{
			assertEquals(service.converterParaRomanos(arabic), roman);
		});
	}

}

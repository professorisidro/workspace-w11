package br.com.meli.numerosromanos.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record RequestDTO(@NotNull
						 @Min(value=1, message = "Valor minimo exigido")
						 @Max(value=99,  message = "Valor maximo exigido")
						 @Positive
		                 Integer number) {

}

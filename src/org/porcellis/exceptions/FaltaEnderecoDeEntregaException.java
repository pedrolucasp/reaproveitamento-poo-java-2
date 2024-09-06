package org.porcellis.exceptions;

public class FaltaEnderecoDeEntregaException extends RuntimeException {
	public FaltaEnderecoDeEntregaException() {
		super("Falta cadastrar o endereço de entrega do cliente");
	}
}

package org.porcellis.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatador {
	public static String formatarMoeda(double valor) {
		return NumberFormat
			.getCurrencyInstance(new Locale("pt", "BR")).format(valor);
	}
}

package org.porcellis.utils;

import java.text.NumberFormat;
import java.util.Locale;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Formatador {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter
		.ofPattern("dd/MM/yyyy HH:mm");

	public static String formatarMoeda(double valor) {
		return NumberFormat
			.getCurrencyInstance(new Locale("pt", "BR")).format(valor);
	}

    public static String formatarDataParaFuso(Instant instant, String zona) {
        ZonedDateTime dataNoFuso = instant.atZone(ZoneId.of(zona));

        return dataNoFuso.format(FORMATTER);
    }
}

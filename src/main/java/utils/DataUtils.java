package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {

	public static Date obterDataComDiferencaDias(int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		return calendar.getTime();
	}
	
	public static int obtemNumeroMes(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int month = cal.get(Calendar.MONTH);
		return month+1;
	}
	
	public static int obtemNumeroDia(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		return dia;
	}
	
	public static int obtemNumeroDiaSemana(Date data) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		int dia = cal.get(Calendar.DAY_OF_WEEK);
		return dia;
	}
	
	public static String obtemDataSegunda() {
		return obterDataFormatada(obterDataComDiferencaDias(2-obtemNumeroDiaSemana(new Date())));
	}
	
	private static DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	public static String obterDataFormatada(Date data) {
		String dateString = format.format(data);
		return dateString;
	}
	
	public static Date obtemData(String data) {
		try {
			return format.parse(data);
		} catch (Exception e) {
			return null;
		}
	}
	
	
}

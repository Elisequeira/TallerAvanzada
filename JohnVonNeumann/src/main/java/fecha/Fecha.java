package fecha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

	private Date fecha;

	public Fecha(Date fecha) {
		this.fecha = fecha;
	}

	
	public static Date sumarFecha(Date fecha, int cantidad, String dato) {
		
		Calendar calendar = new GregorianCalendar();
		
		if (cantidad == 0)
			return fecha;
		
		else if (dato.contains("d�as") || dato.contains("d�a") ||dato.contains("dias") ||dato.contains("dia")) {
		
		calendar.setTime(fecha);
		calendar.add(Calendar.DAY_OF_YEAR, cantidad);
		}
		else if(dato.contains("meses")||dato.contains("mes") || dato.contains("Meses") || dato.contains("Mes")) {
			calendar.setTime(fecha);
			calendar.add(Calendar.MONTH, cantidad);
		}
		
		else if(dato.contains("a�os") || dato.contains("a�o") || dato.contains("A�os") ||dato.contains("A�o")) {
			
			calendar.setTime(fecha);
			calendar.add(Calendar.YEAR, cantidad);
		}
		
		return calendar.getTime();
	}

	public static int diasTranscurridos(Date fechaInicial, Date fechaFinal) {

		int dias = (int) ((fechaFinal.getTime() - fechaInicial.getTime()) / 86400000);
		return dias;
	}
	
	
	public static void main(String[] args) {

		Date FECHA1 = new GregorianCalendar(2018, 3,30,15,15,0).getTime();
		Date FECHA2 = new GregorianCalendar(2018, 5, 23, 15, 15, 0).getTime();
		Date FECHA_MAS = new GregorianCalendar().getTime();
		int resu = 0;
		int dias = -3;
		String dato="qu� d�a fue hace 3 d�as?";
		FECHA_MAS = sumarFecha(FECHA_MAS, dias,dato);
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE-dd-MMMM-yyyy");
		
		System.out.println(sdf.format(FECHA_MAS));
	
		resu = diasTranscurridos(FECHA1, FECHA2);
		System.out.println(resu);
		
	}

}

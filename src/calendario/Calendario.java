package calendario;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Calendario {
	
	Calendar calendarioPrograma;
	private String [] meses 				= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
			"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	private String [] diasDeLaSemana 		= {"Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom" };
	private int[] numeroDiasDelMes			= {31,28,31,30,31,30,31,31,30,31,30,31};
	private String [][] diasDelMes 			= new String[6][7];
	private final int diaActual 			= Calendar.getInstance().get(Calendar.DATE);
	private int anno;
	private int numeroDeMes;
	private String mes;
	private int empezarDiasMes;
	private int diaAEscribir 				= 1;





	public Calendario(int mes, int anno) {
		this.calendarioPrograma = Calendar.getInstance();
		calendarioPrograma.set(2, mes);
		numeroDeMes 	= mes;
		this.anno 		= anno;
		this.mes 		= meses[numeroDeMes-1];
		/*
		 * Conseguimos el primer dia de la semana del mes que imprimimos
		 * el formato E nos devuelve el String del dia de la semana
		 */
		SimpleDateFormat DateFor = new SimpleDateFormat("E");
		GregorianCalendar calendarioGregoriano = new GregorianCalendar(anno, mes-1, 1);
		java.util.Date primerDiaDelMes = new java.util.Date(calendarioGregoriano.getTime().getTime());

		/*
		 * Hacemos una asignacion numerica con todos los posibles valores del dia de la semana
		 */
		if (DateFor.format(primerDiaDelMes).equalsIgnoreCase("lun.")) {
			empezarDiasMes = 1;
		}
		else if (DateFor.format(primerDiaDelMes).equalsIgnoreCase("mar.")) {
			empezarDiasMes = 2;
		}
		else if (DateFor.format(primerDiaDelMes).equalsIgnoreCase("mié.")) {
			empezarDiasMes = 3;
		}
		else if (DateFor.format(primerDiaDelMes).equalsIgnoreCase("jue.")) {
			empezarDiasMes = 4;
		}
		else if (DateFor.format(primerDiaDelMes).equalsIgnoreCase("vie.")) {
			empezarDiasMes = 5;
		}
		else if (DateFor.format(primerDiaDelMes).equalsIgnoreCase("sáb.")) {
			empezarDiasMes = 6;
		}
		else {
			empezarDiasMes = 7;    	
		}
	}
	private void generarSemanas(int i, int j) {
		if (diaAEscribir < empezarDiasMes) {
			diasDelMes[i][j] = "    ";
			empezarDiasMes--;
		}
		else if (diaAEscribir <= 9) {
			diasDelMes[i][j] = "  " + diaAEscribir++ + " ";
		}		
		else if (diaAEscribir >= 10 && diaAEscribir <= numeroDiasDelMes[numeroDeMes-1]) {
			diasDelMes[i][j] =" " + diaAEscribir++ + " ";
		}
		else if (diaAEscribir > numeroDiasDelMes[numeroDeMes-1]) {
			diasDelMes[i][j] = "    ";
		}
	}
	
	public static void imprimirCalendario(Calendario calendario) {
		System.out.println("\t" + calendario.mes + " de " + calendario.anno);
		System.out.print(calendario.diasDeLaSemana[0] + " " + calendario.diasDeLaSemana[1] + " " + calendario.diasDeLaSemana[2] + " " + calendario.diasDeLaSemana[3] + " " + calendario.diasDeLaSemana[4] + " " + calendario.diasDeLaSemana[5] + " " + calendario.diasDeLaSemana[6] + "\n");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {

				if (calendario.diaAEscribir == calendario.diaActual && i < 10 && Calendar.getInstance().get(Calendar.MONTH)+1 == calendario.numeroDeMes) {
					calendario.diasDelMes[i][j] = " " + calendario.diaAEscribir++ + "*";
				}
				else if (calendario.diaAEscribir == calendario.diaActual && i >= 10 && Calendar.getInstance().get(Calendar.MONTH)+1 == calendario.numeroDeMes) {
					calendario.diasDelMes[i][j] = calendario.diaAEscribir++ + "*";
				}
				else {
					calendario.generarSemanas(i, j);
				}


				System.out.print(calendario.diasDelMes[i][j]);
			}
			System.out.println();
		}
	}
	
	
	@Override
	public String toString() {
		return anno + " numero del mes: " + numeroDeMes + " primer dia del mes: " + diaAEscribir + " dia actual: " + diaActual + " " + empezarDiasMes;
	}

}

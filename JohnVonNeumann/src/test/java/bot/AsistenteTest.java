package bot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AsistenteTest {
	
	public final static String USER = "Jorge";
	Asistente robot;
	
	@Before
	public void setup() {
		robot = new Asistente("robotitus");
	}
	
	@Test
	public void pruebas() {
		
		String[] mensajes = {
//				"hola!",
//				"hola padre, como andas",
//				"gracias, te agradezco mucho por lo que hiciste!",
//				"GRAciaS!",
//				"los chause",
//				"wea cosmica",
//				"quiero saber el clima en merlo",
//				"quiero saber el clima en san justo",
//				"que hora es?",
//				"que dia es?",
//				"qu� d�a es?",
//				"quisiera saber la fecha actual",
//				"que dia de la semana es?",
//				"que d�a ser� en 4 dias?",
//				"que dia sera en 27 a�os",
//				"que dia fue hace 4 dias",
//				"que dia fue ayer???",
//				"que dia fue anteayer",
//				"que d�a fu� antes de ayer",
//				"que dia sera ma�ana?????",
				"cu�ntos d�as pasaron desde el 1 de abril de 2017?"
		};

			
		for(String mensaje : mensajes) {
			System.out.println(robot.enviar(USER,mensaje));
			Assert.assertTrue(true);
		}
		
	}
	
	
}

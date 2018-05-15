package listener;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AvernoComeAlmasListener extends TimerTask implements ServletContextListener {

	private Timer timerCreacion;

	@Override
	public void run() {
		Demonio satanael = new Demonio();
		satanael.recoleccionAlmas();
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		if (timerCreacion != null) {
			timerCreacion.cancel();
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("INICIANDO LISTENER FPDUAL.DEMONIO. GORA SATAN!!");
		
		timerCreacion = new Timer();
		timerCreacion.schedule(this, 15000, 9000);
	}
}
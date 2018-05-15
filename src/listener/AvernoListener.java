package listener;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AvernoListener extends TimerTask implements ServletContextListener {

	private Timer timerCreacion;

	@Override
	public void run() {
		Demonio lucifer = new Demonio();
		lucifer.invocacion();
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
		timerCreacion.schedule(this, 10000, 10000);
	}
}

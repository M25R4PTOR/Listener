package Listener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AvernoListener extends TimerTask implements ServletContextListener {
	private Timer timerBorrado;

	@Override
	public void run() {

		Demonio lucifer = new Demonio();
		lucifer.invocacion();
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		if (timerBorrado != null) {
			timerBorrado.cancel();
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("INICIANDO LISTENER FPDUAL.DEMONIO. GORA SATAN!!");

		timerBorrado = new Timer();
		timerBorrado.schedule(this, 10000, 10000);
		
	}
}
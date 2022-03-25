package generadorip;

public class GeneradorIp {

	
	public int generarNumero(int min, int max) {
		return (int) (Math.random()*(max-min)+min);
	}
	
	public String generarIp() {
		String ip = generarNumero(1, 254)+"."+generarNumero(0,254)+"."+generarNumero(0, 254)+"."+generarNumero(1, 254);
		return ip;
	}
	
}

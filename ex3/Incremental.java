package ex3;

public class Incremental {

	private static int cont = 0;
	private int numero;
	private static Incremental instancia; 
	
	private Incremental() {
		numero = cont++;
	}
	
	public static Incremental getInstancia() {
		if(instancia == null) {
			instancia = new Incremental(); 
		}
		return instancia;
	}
	
	public String toString() {
		return "Incremental" + numero;
	}
	
	
}

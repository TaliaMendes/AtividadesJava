package ex8;

public class Principal {
	
	public static void main(String[] args) {
	      SomadorEsperado somador = new SomadorAdaptador(new SomadorExistente());
	      Cliente cliente = new Cliente(somador);
	      cliente.executar();
	  }
}

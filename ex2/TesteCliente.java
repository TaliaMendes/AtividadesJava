package ex2;

public class TesteCliente {
	
	static void main(String[] args) {
		
		Cliente cliente = Cliente.ConstroiCliente();	
		cliente.setNome("talia");
		cliente.setId("9");
		
		System.out.println(cliente);
	}
}

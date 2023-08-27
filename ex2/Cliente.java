package ex2;

public class Cliente {
	
	private String nome;
	private String id;
	
	private static Cliente instancia; 
	
	private Cliente() {
		
	}
	
	public static Cliente ConstroiCliente(){
		if(instancia == null) {
			instancia = new Cliente(); 
			}
		return instancia; 
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Nome do cliente: " + this.nome + "|" + "ID: " + this.id;
	}
	
	
}

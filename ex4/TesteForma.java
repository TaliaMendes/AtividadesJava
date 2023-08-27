package ex4;

public class TesteForma {

	public static void main(String[] args) {
		
		FormaGeometricaFactory Forma = new FormaGeometricaFactory();
		
		FormaGeometrica f1 =  Forma.getForma("circulo");
		f1.desenhar();
		
	}
}

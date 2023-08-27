package ex4;

public class FormaGeometricaFactory {

	public FormaGeometrica getForma(String forma) {
		if(forma == "circulo") {
			return new Circulo();
		}
		else if(forma == "triangulo") {
			return new Triangulo();
		}
		else if(forma == "Quadrado"){
			return new Quadrado();
		}
		else {
			return null;
		}
	}
}

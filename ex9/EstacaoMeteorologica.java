package ex9;

public class EstacaoMeteorologica {

	  public static void main(String[] args) {
	      MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
	      MedidorCelsiusIF medidorCelsius = new AdaptadorCelsius(medidorFarenheit);

	      System.out.println("Temperatura em Celsius: " + medidorCelsius.medirTemperatura());
	  }
}

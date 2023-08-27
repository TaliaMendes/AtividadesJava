package ex9;

public class AdaptadorCelsius implements MedidorCelsiusIF {

	private MedidorFarenheit medidorFarenheit;

	  public AdaptadorCelsius(MedidorFarenheit medidorFarenheit) {
	      this.medidorFarenheit = medidorFarenheit;
	  }

	  @Override
	  public double medirTemperatura() {
	      double fahrenheit = medidorFarenheit.getTemperaturaFahrenheit();
	      return (fahrenheit - 32) / 1.8;
	  }
}

package exerciciosScanner;
/*23. Diga se o código abaixo esta condizente com o que será impresso no console, se não, o 
 * por que e diga o resultado correto.
 * 
a. String texto = “Vinícius”;
	String outroTexto = texto + “Ferneda”;
texto = outroTexto + “Ferneda”;
	System.out.println(outroTexto);
	
	Console:
	ViniciusFernedaFerneda*/


public class item23 {/*O texto não está condizente, pois a variavel que é impresa e outrotexto,
 então o texto impreso ficará ViníciusFerneda, se no caso fosse texto a variavel impresa ai sim ficaria 
 ViníciusFernedaFerneda*/

	public static void main(String[] args) {
		String texto = "Vinícius";
		String outroTexto = texto + "Ferneda";
	texto = outroTexto + "Ferneda";
		System.out.println(outroTexto);
	}
}

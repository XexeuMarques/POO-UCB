package Exercicios;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Atividade2 {
	public static void main(String[] args) {
	    DecimalFormat casaDecimais_4 = new DecimalFormat("#.####");
	    
		String entrada = JOptionPane.showInputDialog("Digite o valor do círculo:");
		double valor = Double.parseDouble(entrada);
		
		double area = Math.PI * Math.pow(valor, 2);

	    String areaFormatada = casaDecimais_4.format(area);
	    
	    JOptionPane.showMessageDialog(null, "A área do círculo é: " + areaFormatada);
	}
}

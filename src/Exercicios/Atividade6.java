package Exercicios;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Atividade6 {

	public static void main(String[] args) {
		double salarioAtual;
		double aumento;
		double salarioReajustado;
		String salarioAtualFormatado;
		String salarioReajustadoFormatado;
		String mensagem;
		String salarioAtualEmString;
		
		DecimalFormat casaDecimais_2 = new DecimalFormat("#.##");
		
        salarioAtualEmString = JOptionPane.showInputDialog("Digite o salário atual do funcionário:");
        salarioAtual = Double.parseDouble(salarioAtualEmString);
        
        aumento = salarioAtual * 0.15;
        
        salarioReajustado = salarioAtual + aumento;
		
	    salarioAtualFormatado = casaDecimais_2.format(salarioAtual);
        salarioReajustadoFormatado = casaDecimais_2.format(salarioReajustado);

        mensagem = String.format(
                "Salário atual: R$ %s\nSalário reajustado é: R$ %s",
                salarioAtualFormatado, salarioReajustadoFormatado
            );
        
        JOptionPane.showMessageDialog(null, mensagem);
	}

}

package Exercicios;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Atividade3 {
	public static void main(String[] args) {
        DecimalFormat casaDecimais_2 = new DecimalFormat("#.##");
		
        String horasTrabalhadasEmSting = JOptionPane.showInputDialog("Digite o quantidade de horas trabalhadas:");
        double horasTrabalhadas = Double.parseDouble(horasTrabalhadasEmSting);
        
        String valorPorHoraEmString = JOptionPane.showInputDialog("Qual o valor que o funcionário recebe por hora:");
        double valorPorHora = Double.parseDouble(valorPorHoraEmString);
        
        double salario = horasTrabalhadas * valorPorHora;
        
        String salarioFormatado = casaDecimais_2.format(salario);
        
        JOptionPane.showMessageDialog(null, "O salário do funcionário é: R$ " + salarioFormatado);
	}
}

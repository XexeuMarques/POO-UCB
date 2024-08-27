package Exercicios;
import javax.swing.JOptionPane;
//bibliotacas novas que descobri ;)
//import java.time.Year;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;



public class Atividade4 {

	public static void main(String[] args) {
		DateTimeFormatter formatoDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String nome = JOptionPane.showInputDialog("Qual e o seu nome?:");
		
//		String anoEmString = JOptionPane.showInputDialog("Em que ano voce naceu?");
		String dataNascimentoEmString = JOptionPane.showInputDialog("Digite a sua data de nascimento no formato: (dd/MM/yyyy):");
		
//		int ano = Integer.parseInt(anoEmString);
	    LocalDate dataNascimento = LocalDate.parse(dataNascimentoEmString, formatoDaData);
		
//		int anoAtual = Year.now().getValue();
	    LocalDate dataAtual = LocalDate.now();
//		int idade = anoAtual - ano;
	    Period idade = Period.between(dataNascimento, dataAtual);
		
		String mensagemNaTela = "Você se chama " + nome + " e possui " + idade.getYears() + " anos de idade!";
		JOptionPane.showMessageDialog(null, mensagemNaTela);
		
/*EXTRA*/
		 int meses = idade.getYears() * 12 + idade.getMonths();
	     int dias = idade.getDays() + (idade.getYears() * 365) + (idade.getMonths() * 30);
		 String mensagemNaTela2 = "Extras: \nVoce tem " + meses + " meses de vida \nE mais ou menos " + dias + " dias vividos";
	     JOptionPane.showMessageDialog(null, mensagemNaTela2);
	}

}

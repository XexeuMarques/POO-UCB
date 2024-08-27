package Exercicios;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double[] valor = new double[5];
		
        for (int i = 0; i < valor.length; i++) {
            System.out.println("Digite o numero do " + (i + 1) + "º valor:");
            valor[i] = scan.nextDouble();
        }

        for (int i = 0; i < valor.length; i++) {
           soma += valor[i];
        }		
        
        double media = soma / valor.length;
        
        System.out.println("\nOs valores digitados foram:");
        for (int i = 0; i < valor.length; i++) {
            System.out.println((i + 1) + "º valor = " + valor[i]);
        }
        
        System.out.println("\nE a média é: " + media);
        
        scan.close();
	}

}

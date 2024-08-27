package Exercicios;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Atividade5 {
	
	public static void main(String[] args) {
		DecimalFormat casaDecimais_3 = new DecimalFormat("#.###");
		
		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
		
        String valorDoProdutoEmString = JOptionPane.showInputDialog("Digite o valor do produto:");
        double valorDoProduto = Double.parseDouble(valorDoProdutoEmString);
        
        String porcentagemDoDescontoEmString = JOptionPane.showInputDialog("Digite a porcentagem de desconto:");
        double porcentagemDoDesconto = Double.parseDouble(porcentagemDoDescontoEmString);
        
        double desconto = valorDoProduto * (porcentagemDoDesconto / 100);
        
        double valorComDesconto = valorDoProduto - desconto;
        
        String valorProdutoFormatado = casaDecimais_3.format(valorDoProduto);
        String valorComDescontoFormatado = casaDecimais_3.format(valorComDesconto);
        
        String mensagem = String.format(
                "Produto: %s\nValor original: R$ %s\nValor com desconto: R$ %s",
                nomeProduto, valorProdutoFormatado, valorComDescontoFormatado
            );
        
        JOptionPane.showMessageDialog(null, mensagem);

	}
}

package principal;

import javax.swing.JOptionPane;

import entities.Fornecedor;
import repositories.FornecedorRepository;

public class Program {
	
	public static void main(String[] args) {
		try {
			Fornecedor fornecedor = new Fornecedor();
			fornecedor.setNome(JOptionPane.showInputDialog("Digite nome do fornecedor: "));
			fornecedor.setCnpj(JOptionPane.showInputDialog("Digite o numero do cnpj: "));
			fornecedor.setTelefone(JOptionPane.showInputDialog("Digite o numero seu telefone"));
			
			
			FornecedorRepository fornecedorRepository = new FornecedorRepository();
			fornecedorRepository.insert(fornecedor);
			
			JOptionPane.showMessageDialog(null, "Os dados foram gravando com sucesso " + "\n"
					+ fornecedor.getNome() + "\n" + fornecedor.getCnpj() + "\n" + fornecedor.getTelefone());
			
			System.out.println("Os dados foram gravando com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}
	}

}

import javax.swing.*;
import java.awt.*;

public class CadastroPessoa {

    public CadastroPessoa(JFrame principal) {
        JDialog cadastroPessoas = new JDialog(principal, "Cadastro de Pessoa", true);
        cadastroPessoas.setSize(600, 300);
        cadastroPessoas.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Pessoa", SwingConstants.CENTER);
        cadastroPessoas.add(titulo, BorderLayout.NORTH);

        CamposCadastroPessoa camposCadastro = new CamposCadastroPessoa();
        cadastroPessoas.add(camposCadastro.getPanelCampos(), BorderLayout.CENTER);

        JPanel painelBotoes = criarPainelBotoes(cadastroPessoas);

        cadastroPessoas.add(painelBotoes, BorderLayout.SOUTH);
        cadastroPessoas.setLocationRelativeTo(principal);
        cadastroPessoas.setVisible(true);
    }

    private JPanel criarPainelBotoes(JDialog dialog) {
        JPanel painelBotoes = new JPanel(new FlowLayout());
        String[] labels = {"Incluir", "Alterar", "Excluir", "Consultar", "Cancelar", "Sair"};
        for (String label : labels) {
            JButton button = new JButton(label);
            if (label.equals("Sair")) {
                button.addActionListener(e -> dialog.setVisible(false));
            } else {
                button.addActionListener(e -> JOptionPane.showMessageDialog(dialog, "Botão " + label + " clicado!"));
            }
            painelBotoes.add(button);
        }
        return painelBotoes;
    }
}

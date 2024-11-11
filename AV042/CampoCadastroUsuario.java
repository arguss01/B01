import javax.swing.*;
import java.awt.*;

public class CamposCadastroUsuario {

    private JPanel painelCampos;

    public CamposCadastroUsuario() {
        painelCampos = new JPanel(new GridLayout(4, 2, 5, 5));

        painelCampos.add(new JLabel("Usuário:"));
        painelCampos.add(new JTextField(25));

        painelCampos.add(new JLabel("Senha:"));
        painelCampos.add(new JPasswordField(15));

        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));

        painelCampos.add(new JLabel("Ativo:"));
        JRadioButton radioAtivo = new JRadioButton();
        painelCampos.add(radioAtivo);
    }

    public JPanel getPanelCampos() {
        return painelCampos;
    }
}

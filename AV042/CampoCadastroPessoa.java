import javax.swing.*;
import java.awt.*;

public class CamposCadastroPessoa {

    private JPanel painelCampos;

    public CamposCadastroPessoa() {
        painelCampos = new JPanel(new GridLayout(7, 2, 5, 5));

        painelCampos.add(new JLabel("Nome:"));
        painelCampos.add(new JTextField(40));

        painelCampos.add(new JLabel("Endereço:"));
        painelCampos.add(new JTextField(60));

        painelCampos.add(new JLabel("Cidade:"));
        painelCampos.add(new JTextField(40));

        painelCampos.add(new JLabel("UF:"));
        painelCampos.add(new JTextField(2));

        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));

        painelCampos.add(new JLabel("Telefone:"));
        painelCampos.add(new JTextField(20));

        painelCampos.add(new JLabel("Sexo:"));
        JComboBox<String> comboSexo = new JComboBox<>(new String[]{"Masculino", "Feminino"});
        painelCampos.add(comboSexo);
    }

    public JPanel getPanelCampos() {
        return painelCampos;
    }
}

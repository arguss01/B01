import java.awt.*;
import javax.swing.*;

public class MenuPrincipal {

    public MenuPrincipal() {
        JFrame principal = new JFrame("Sistema Pessoa");
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(800, 800);

        JMenuBar menuPrincipal = new JMenuBar();

        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");

        JMenu menuSair = new JMenu("Sair");
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0); 
            }
            @Override public void menuDeselected(javax.swing.event.MenuEvent e) {}
            @Override public void menuCanceled(javax.swing.event.MenuEvent e) {}
        });

        menuPrincipal.add(menuCadastro);
        menuPrincipal.add(menuVisualizacao);
        menuPrincipal.add(menuSair);

        JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
        JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(itemMenuCadastroUsuarios);
        menuCadastro.add(itemMenuCadastroPessoas);

        JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
        JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
        menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
        menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);

        JTextArea areaTrabalho = new JTextArea();

        JPanel painelRodape = new JPanel();
        JLabel labelRodape = new JLabel("Versão: " + ConfiguracoesSistema.VERSAO_SISTEMA +
                " | Usuário: " + ConfiguracoesSistema.NOME_USUARIO +
                " | Data de acesso: " + ConfiguracoesSistema.DATA_ACESSO);
        painelRodape.add(labelRodape);

        principal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        principal.getContentPane().add(BorderLayout.SOUTH, painelRodape);

        itemMenuCadastroUsuarios.addActionListener(e -> abrirCadastroUsuarios(principal));
        itemMenuCadastroPessoas.addActionListener(e -> abrirCadastroPessoas(principal));
        itemMenuVisualizacaoListaUsuarios.addActionListener(e -> abrirListaUsuarios(principal));
        itemMenuVisualizacaoListaPessoas.addActionListener(e -> abrirListaPessoas(principal));

        principal.setLocationRelativeTo(null); 
        principal.setVisible(true); 
    }

    private static void abrirCadastroUsuarios(JFrame principal) {
        JDialog cadastroUsuarios = new JDialog(principal, "Cadastro de Usuários", true);
        cadastroUsuarios.setSize(600, 300);
        cadastroUsuarios.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Usuários", SwingConstants.CENTER);
        cadastroUsuarios.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(4, 2, 5, 5));
        painelCampos.add(new JLabel("Usuário:"));
        painelCampos.add(new JTextField(25));
        painelCampos.add(new JLabel("Senha:"));
        painelCampos.add(new JPasswordField(15));
        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));
        painelCampos.add(new JLabel("Ativo:"));
        JRadioButton radioAtivo = new JRadioButton();
        painelCampos.add(radioAtivo);

        JPanel painelBotoes = criarPainelBotoes(cadastroUsuarios);

        cadastroUsuarios.add(painelCampos, BorderLayout.CENTER);
        cadastroUsuarios.add(painelBotoes, BorderLayout.SOUTH);
        cadastroUsuarios.setLocationRelativeTo(principal);
        cadastroUsuarios.setVisible(true);
    }

    private static void abrirCadastroPessoas(JFrame principal) {
        JDialog cadastroPessoas = new JDialog(principal, "Cadastro de Pessoa", true);
        cadastroPessoas.setSize(600, 300);
        cadastroPessoas.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Pessoa", SwingConstants.CENTER);
        cadastroPessoas.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(7, 2, 5, 5));
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

        JPanel painelBotoes = criarPainelBotoes(cadastroPessoas);

        cadastroPessoas.add(painelCampos, BorderLayout.CENTER);
        cadastroPessoas.add(painelBotoes, BorderLayout.SOUTH);
        cadastroPessoas.setLocationRelativeTo(principal);
        cadastroPessoas.setVisible(true);
    }

    private static void abrirListaUsuarios(JFrame principal) {
        JDialog listaUsuarios = new JDialog(principal, "Lista de Usuários", true);
        listaUsuarios.setSize(750, 650);
        listaUsuarios.setLayout(new BorderLayout());

        listaUsuarios.add(new JLabel("Lista de Usuários", SwingConstants.CENTER), BorderLayout.NORTH);
        listaUsuarios.add(new JTextArea("Exemplo de lista de usuários..."), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> listaUsuarios.setVisible(false));
        listaUsuarios.add(btnFechar, BorderLayout.SOUTH);

        listaUsuarios.setLocationRelativeTo(principal);
        listaUsuarios.setVisible(true);
    }

    private static void abrirListaPessoas(JFrame principal) {
        JDialog listaPessoas = new JDialog(principal, "Lista de Pessoas", true);
        listaPessoas.setSize(750, 650);
        listaPessoas.setLayout(new BorderLayout());

        listaPessoas.add(new JLabel("Lista de Pessoas", SwingConstants.CENTER), BorderLayout.NORTH);
        listaPessoas.add(new JTextArea("Exemplo de lista de pessoas..."), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> listaPessoas.setVisible(false));
        listaPessoas.add(btnFechar, BorderLayout.SOUTH);

        listaPessoas.setLocationRelativeTo(principal);
        listaPessoas.setVisible(true);
    }

    private static JPanel criarPainelBotoes(JDialog dialog) {
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

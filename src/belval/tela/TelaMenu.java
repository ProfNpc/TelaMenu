package belval.tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaMenu extends JFrame implements ActionListener {
	private JMenuItem mntmPesq;

	public static void main(String[] args) {
		new TelaMenu();
	}

	public TelaMenu() {
		montarTela();
		setVisible(true);
	}

	private void montarTela() {
		setTitle("TelaMenu"); // Define o título da janela
		// Define a posição e o tamanho da tela
		setBounds(0, 0, 450, 300);
		// Define o que deve acontecer quando se clicar no 'X' que fecha a janela. A
		// opção
		// EXIT_ON_CLOSE faz com que a aplicação toda seja encerrada e não apenas a
		// janela,
		// quaisquer outras janelas que estejam abertas dessa aplicação também serão
		// encerradas
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Cria uma barra de menu
		JMenuBar menuBar = new JMenuBar();
		// Adiciona a barra de menu à janela
		setJMenuBar(menuBar);
		// Cria um menu com o texto "Usuario"
		JMenu mnUsuario = new JMenu("Usuario");
		// Adiciona o menu "Usuario" à barra de menu
		menuBar.add(mnUsuario);
		// Cria um item de menu "Pesquisar"
		mntmPesq = new JMenuItem("Pesquisar");
		// A própria instancia(this) de Tela menu tratará o clique no item de menu
		// "Pesquisar"
		mntmPesq.addActionListener(this);
		// Adiciona o item do menu "Pesquisa" ao menu "Usuario"
		mnUsuario.add(mntmPesq);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Verifica se a fonte("Source") do evento foi o item de menu "Pesquisa"
		if (e.getSource() == this.mntmPesq) {
			abrirTelaPesquisa();
		}
	}

	private void abrirTelaPesquisa() {
		JOptionPane.showMessageDialog(this, "O item de menu foi clicado");
		// Cenas dos proximos capítulos...
		// new TelaPesquisa();
	}
}

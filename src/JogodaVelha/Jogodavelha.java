package JogodaVelha;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Jogodavelha extends JFrame {
	boolean xo = false;
	boolean [] clicks = new boolean [9];
	JButton [] botoes = new JButton [9];
	JLabel placar = new JLabel ("placar");
	JLabel px = new JLabel ("Pontuação de X:"); 
	JLabel po = new JLabel ("Pontuação de O:"); 
	JButton novo = new JButton ("Novo jogo");
	JButton zerar = new JButton ("Zerar Placar");
	int PX = 0;
	int PO = 0;
	
	public Jogodavelha () {
		setVisible(true);
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(3);
		setLayout(null);
		setBounds(250,100,700,500);
		add(placar);
		add(px);
		add(po);
		add(novo);
		add(zerar);
		placar.setBounds(425, 50, 100, 30);
		px.setBounds(325, 75, 100, 30);
		po.setBounds(450, 75, 100, 30);
		novo.setBounds(425, 100, 100, 30);
		zerar.setBounds(535, 100, 100, 30);

		novo.addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				limpar();
				
			}
			
		});
		zerar.addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				PO = 0;
				PX = 0;
				placar();
				
			}
			
		});
		int contador = 0;
		
		for (int i = 0; i<3;i++) {
			for (int j = 0; j<3;j++) {
				botoes[contador] = new JButton ();
				add(botoes[contador]);
				botoes[contador].setBounds((100 * i),( 100 *j)+50,95,95);
				botoes[contador].setFont(new Font("Arial",Font.BOLD,40));
				contador++;
			}
		}
		for (int i = 0; i<9;i++) {
			clicks [i] = false;
		}
		
		botoes[0].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[0] == false) {
					clicks[0] = true;
					mudar(botoes[0]);
				}
				
				
			}
			
		});
		botoes[1].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[1] == false) {
					clicks[1] = true;
					mudar(botoes[1]);
				}
				
				
			}
			
		});
		botoes[2].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[2] == false) {
					clicks[2] = true;
					mudar(botoes[2]);
				}
				
				
			}
			
		});
		botoes[3].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[3] == false) {
					clicks[3] = true;
					mudar(botoes[3]);
				}
				
				
			}
			
		});
		botoes[4].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[4] == false) {
					clicks[4] = true;
					mudar(botoes[4]);
				}
				
				
			}
			
		});
		botoes[5].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[5] == false) {
					clicks[5] = true;
					mudar(botoes[5]);
				}
				
				
			}
			
		});
		botoes[6].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[6] == false) {
					clicks[6] = true;
					mudar(botoes[6]);
				}
				
				
			}
			
		});
		botoes[7].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[7] == false) {
					clicks[7] = true;
					mudar(botoes[7]);
				}
				
				
			}
			
		});
		botoes[8].addActionListener(new java.awt.event.ActionListener(){
			@Override
			
			public void actionPerformed (ActionEvent ae) {
				if (clicks[8] == false) {
					clicks[8] = true;
					mudar(botoes[8]);
				}
				
				
			}
			
		});
	}
	public void mudar(JButton btn) {
		if (xo) {
			btn.setText("O");
			xo = false;
		}else {
			btn.setText("X");
			xo = true;
		
		}
		ganhou();
	}
	public void placar() {
		px.setText("X"+ PX);
		po.setText("O" + PO);
	}
	
	public void ganhou() {
		int cont = 0;
		for (int i = 0; i<9;i++) {
			if(clicks[i]==true) {
				cont++;
			}
		}
		
		if ((botoes[0].getText()=="X" && botoes[1].getText()=="X" && botoes[2].getText()=="X")
				||(botoes[3].getText()=="X" && botoes[4].getText()=="X" && botoes[5].getText()=="X")
				||(botoes[6].getText()=="X" && botoes[7].getText()=="X" && botoes[8].getText()=="X")
				||(botoes[0].getText()=="X" && botoes[3].getText()=="X" && botoes[6].getText()=="X")
				||(botoes[1].getText()=="X" && botoes[4].getText()=="X" && botoes[7].getText()=="X")
				||(botoes[2].getText()=="X" && botoes[5].getText()=="X" && botoes[8].getText()=="X")
				||(botoes[0].getText()=="X" && botoes[4].getText()=="X" && botoes[8].getText()=="X")
				||(botoes[6].getText()=="X" && botoes[4].getText()=="X" && botoes[2].getText()=="X")) {
			JOptionPane.showMessageDialog(null, "X Ganhou !");
			PX++;
			placar();
			limpar();
			
		} else if ((botoes[0].getText()=="O" && botoes[1].getText()=="O" && botoes[2].getText()=="O")
				||(botoes[3].getText()=="O" && botoes[4].getText()=="O" && botoes[5].getText()=="O")
				||(botoes[6].getText()=="O" && botoes[7].getText()=="O" && botoes[8].getText()=="O")
				||(botoes[0].getText()=="O" && botoes[3].getText()=="O" && botoes[6].getText()=="O")
				||(botoes[1].getText()=="O" && botoes[4].getText()=="O" && botoes[7].getText()=="O")
				||(botoes[2].getText()=="O" && botoes[5].getText()=="O" && botoes[8].getText()=="O")
				||(botoes[0].getText()=="O" && botoes[4].getText()=="O" && botoes[8].getText()=="O")
				||(botoes[6].getText()=="O" && botoes[4].getText()=="O" && botoes[2].getText()=="O")) {
			JOptionPane.showMessageDialog(null, "O Ganhou !");
			PO++;
			placar();
			limpar();
		} else if (cont == 9) {
			JOptionPane.showMessageDialog(null, "Deu velha !");
			limpar();
		}
				
	}
	public void limpar() {
		for (int i = 0; i<9;i++) {
			botoes[i].setText("");
			clicks [i] = false;
		}
	}
	
	
	public static void main(String[] args) {
		new Jogodavelha();
		
		
	}

}

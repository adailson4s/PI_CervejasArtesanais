package components;

import java.awt.*;

import javax.swing.*;

public class Background extends JLabel {

	private JLabel bg;

	public Background (String txt, int x, int y, int largura, int altura) {
		bg = new JLabel("");
		bg.setIcon(new ImageIcon("D:\\Adailson\\Documentos\\GitHub\\PI_CervejasArtesanais\\PI_CERVEJASARTESANAIS\\src\\img\\background.png"));
		bg.setBounds(0, 0, 1008, 537);
		
//		JLabel background = new JLabel("");
//		background.setIcon(new ImageIcon("D:\\Adailson\\Documentos\\GitHub\\PI_Cervejas_Artesanais\\PI_CERVEJAS_ARTESANAIS\\src\\img\\background.png"));
//		background.setBounds(0, 0, 1008, 537);
//		contentPane.add(background);
	}

	public JLabel getBg() {
		return bg;
	}

	public void setBg(JLabel bg) {
		this.bg = bg;
	}

	

}

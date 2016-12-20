package hr.fer.oop.swing.example3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class EnterNameFrame extends JFrame {

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      EnterNameFrame frame = new EnterNameFrame();
      frame.pack(); // slaganje komponenti na najmanje prostora
      frame.setVisible(true);
    });
  }

  /**
   * Create the frame.
   */
  public EnterNameFrame() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(10, 10, 500, 200); // postavljanje lokacije i veličine

    JPanel panel = (JPanel) getContentPane(); // ovo je potrebno zbog okvira
    panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

    JLabel lblTitle = new JLabel("Naslov");
    lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
    panel.add(lblTitle, BorderLayout.NORTH);

    JLabel lblName = new JLabel("Unesite ime i prezime:");
    panel.add(lblName, BorderLayout.WEST);

    JTextField tfInput = new JTextField();
    panel.add(tfInput, BorderLayout.CENTER);
    tfInput.setColumns(10);

    JPanel southPanel = new JPanel();
    panel.add(southPanel, BorderLayout.SOUTH);

    JButton btnOK = new JButton("OK");
    southPanel.add(btnOK);
    
    btnOK.addActionListener(new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(EnterNameFrame.this, "Hello " + tfInput.getText());			
		}
	});
    //btnOK.addActionListener(e -> JOptionPane.showMessageDialog(EnterNameFrame.this, "Hello " + tfInput.getText()));					
  }
}

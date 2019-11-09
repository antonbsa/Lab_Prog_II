package LDE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setTitle("Programinha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Primeiro");
		chckbxNewCheckBox.setBounds(9, 65, 85, 29);
		chckbxNewCheckBox.setSelected(true);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Segundo");
		chckbxNewCheckBox_1.setBounds(9, 94, 85, 29);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Terceiro");
		chckbxNewCheckBox_2.setBounds(9, 123, 85, 29);
		contentPane.setLayout(null);
		contentPane.add(chckbxNewCheckBox);
		contentPane.add(chckbxNewCheckBox_1);
		contentPane.add(chckbxNewCheckBox_2);
	}
}

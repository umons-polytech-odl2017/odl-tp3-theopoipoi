package exercice1;

import javax.swing.*;

public class ExerciseForm {



	private JRadioButton ellipsisRadioButton;
	private JRadioButton circleRadioButton;
	private JRadioButton squareRadioButton;
	private JRadioButton rectangleRadioButton;
	private JPanel rootPanel;
	private JPanel drawingPanel;
	private JTextArea zoneDeTexteTextArea;



	public static void main(String[] args) {
		JFrame frame = new JFrame("ExerciseForm");
		frame.setContentPane(new ExerciseForm().rootPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	private void createUIComponents() {
		drawingPanel = new SubPanel();// TODO: place custom component creation code here
	}
}

import javax.swing.*;

public class Binks{
	public static void main(String[] args){
        Timer timer = new Timer();
        JFrame frame = new JFrame("Jar Jar");
        ImageIcon icon = new ImageIcon("resources/jarjar.jpg");
        JLabel label = new JLabel(icon);
		timer.start();

        frame.setSize(200,285);
        frame.setVisible(true);
        frame.add(label);


	}
}


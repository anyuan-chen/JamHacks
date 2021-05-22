import javax.swing.*; 
import java.awt.event.*;    

public class Menu{

	public static void main(String[] args){
	
		JFrame frame = new JFrame("window");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    JButton button = new JButton("Play");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Clicked Play");
			}		
		});	

    // JButton b = new JButton

		frame.getContentPane().add(button);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}	

}
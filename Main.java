import javax.swing.*; 
import java.awt.event.*;    

public class Main{

	public static void main(String[] args){
	
		JFrame frame = new JFrame(" ");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    JButton button = new JButton("Click me!");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Test button");
			}		
		});	

		frame.getContentPane().add(button);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}	

}
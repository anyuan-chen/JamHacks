import javax.swing.*; 
import java.awt.event.*;    

public class Menu{

	public static void main(String[] args){
	
		JFrame frame = new JFrame(" ");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    JButton button = new JButton("Play");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Clicked Play");
			}		
		});	

    JFrame f = new JFrame("Example button");
    J

		frame.getContentPane().add(button);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}	

}
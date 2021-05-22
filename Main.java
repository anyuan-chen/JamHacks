import javax.swing.*; 
import java.awt.event.*;    
import java.awt.FlowLayout;

public class Main{
  
	static JFrame frame = new JFrame("Environment Game");
	public static void main(String[] args){
    // Setup
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //layout managers set how elements arrange
    frame.setLayout(new FlowLayout());
    
    JLabel title = new JLabel("Environment Game",JLabel.CENTER);
		
    //Icons
    ImageIcon iconPlay = new ImageIcon("Icons/playButtonIMG.png");
    ImageIcon iconRules = new ImageIcon("Icons/rulesButtonIMG.png");

    // Play Button
    JButton playButton = new JButton(iconPlay);
    
		playButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Game game = new Game(frame);
			}		
		});	
    playButton.setBorder(null);
    playButton.setContentAreaFilled(false);

    // Instructions Button
    JButton instructionsButton = new JButton(iconRules);
    instructionsButton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        //TO-DO implement rules either through
        //1. seperate rules page
        //2. url to some doc
        System.out.println("Instructions button");
      }
    });
    instructionsButton.setBorder(null);
    instructionsButton.setContentAreaFilled(false);
    
    JPanel panel = new JPanel();
    
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);    
    frame.add(panel);
    frame.getContentPane().add(playButton);
    panel.add(playButton);
    panel.add(title);
    panel.add(instructionsButton);
		
    
	}	
  
}
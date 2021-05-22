
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;




public class GameFinished {
    JFrame jf;
    JPanel finalScore = new JPanel();

    public GameFinished(JFrame frame, int score){
        this.jf = frame;
        jf.getContentPane().removeAll(); //removes all elements from the main menu        jf.revalidate();
        JLabel scoreLabel = new JLabel("Score" + Integer.toString(score));
        finalScore.add(scoreLabel);
        JButton exit = new JButton("Exit");

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });

        jf.add(finalScore);
        jf.add(exit);

        jf.repaint();
        jf.revalidate();
        jf.setSize(400,300);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

}
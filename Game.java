import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;




public class Game {
    JFrame jf;
    int currentItem = 0;
    ArrayList<Item> al = new ArrayList<>();
    int score = 0;
    JPanel imagePanel = new JPanel();
    JPanel scorePanel = new JPanel();

    public Game(JFrame frame){
        this.jf = frame;
        jf.getContentPane().removeAll();
        jf.repaint();
        jf.revalidate();
        createItemList();
        //ui for buttons
        JPanel buttonPanel = new JPanel();

        JButton recycling = new JButton("Recycling");
        recycling.setBackground(Color.BLUE);
        recycling.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                imagePanel.removeAll();
                imagePanel.revalidate();
                imagePanel.repaint();
                callNextItem("recycling");
            }
        });

        JButton compost = new JButton("Compost");
        compost.setBackground(Color.GREEN);
        compost.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                imagePanel.removeAll();
                imagePanel.revalidate();
                imagePanel.repaint();
                callNextItem("compost");
            }
        });

        JButton garbage = new JButton("Garbage");
        garbage.setBackground(Color.GRAY);
        garbage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                imagePanel.removeAll();
                imagePanel.revalidate();
                imagePanel.repaint();
                callNextItem("garbage");
            }
        });


        //adding buttons
        buttonPanel.add(recycling);
        buttonPanel.add(compost);
        buttonPanel.add(garbage);

        //overall layout
        GridLayout overallLayout = new GridLayout(2,0);
        jf.setLayout(overallLayout);
        jf.add(buttonPanel);
        Item cur = al.get(currentItem);
        JLabel imageLabel = new JLabel(cur.getImage());
        imagePanel.add(imageLabel);
        //score panel
        JLabel scoreLabel = new JLabel(Integer.toString(score));
        scorePanel.add(scoreLabel);
        jf.add(scorePanel);
        jf.add(imagePanel);
        jf.repaint();
        jf.revalidate();
        jf.setSize(400,300);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    private void createItemList(){
        //create icon, then add the icon to the list of items
        //ADD NEW WASTE ITEMS HERE!!!
        ImageIcon styrofoam = new ImageIcon("styrofoam.jpg");
        al.add(new Item(styrofoam, "garbage"));

        ImageIcon food = new ImageIcon("food.jpg");
        al.add(new Item(food, "compost"));
    }
    public void callNextItem(String whoCalledMe){
        //process score!
        if (currentItem != -1 && currentItem < al.size() && al.get(currentItem).checkAnswer(whoCalledMe)){
            score++;
            updateScorePanel();
        }

        // end the game if we reached item
        if (currentItem == al.size()-1){
            GameFinished gf = new GameFinished(jf, score);
        }
        else{ //add the next item to the pane
            currentItem++;
            Item cur = al.get(currentItem);
            JLabel imageLabel = new JLabel(cur.getImage());
            imagePanel.add(imageLabel);
            jf.add(imagePanel);
            jf.revalidate();
            jf.repaint();
        }

    }
    public void updateScorePanel(){
      scorePanel.removeAll(); 
      JLabel scoreLabel = new JLabel(Integer.toString(score));
      scorePanel.add(scoreLabel);
      scorePanel.revalidate();
      scorePanel.repaint();
      jf.add(scorePanel);
      jf.revalidate();
      jf.repaint();
    }
    
}
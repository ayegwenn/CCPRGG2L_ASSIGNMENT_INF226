import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame {

    JList colorList;
    private String[] colorNameArray = {"GRAY", "LIGHT GRAY", "WHITE", "BLACK"};
    private Color[] colorClassArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};

    ColorMenu() {

        JLabel label = new JLabel();
        label.setText("Choose background color");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        colorList = new JList(colorNameArray);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // restricts to one selection
        colorList.setFont(new Font("Arial", Font.BOLD, 25));
        bgColorEventHandler bgHandler = new bgColorEventHandler();
        colorList.addListSelectionListener(bgHandler);
        this.add(colorList);

        
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(350, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.MAGENTA);
        this.setResizable(false);
    }

    private class bgColorEventHandler implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event) {
            GamePanel gp = new GamePanel();
            gp.gameBGcolor = colorClassArray[colorList.getSelectedIndex()];

            new GameFrame();
            dispose();
        }
    }
}
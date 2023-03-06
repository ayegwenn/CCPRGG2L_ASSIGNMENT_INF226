import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryAgain extends JFrame {
    
    TryAgain() {

        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);
        
        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        tryAgainHandler tryAgainHandler = new tryAgainHandler();
        tryAgainButton.addActionListener(tryAgainHandler);

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        exitHandler exitHandler = new exitHandler();
        exitButton.addActionListener(exitHandler);

        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250, 500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.MAGENTA);
        this.setResizable(false);
    }

    private class tryAgainHandler implements ActionListener {
        public void actionPerformed(ActionEvent tryAgainEvent) {
            new GameFrame();
            dispose();
        }
    }

    private class exitHandler implements ActionListener {
        public void actionPerformed(ActionEvent exitEvent) {
            dispose();
        }
    }
}

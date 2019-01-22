package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDaniel extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private JPanel buttonPanel;

    public ButtonDaniel() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        //Creation of the buttons
        JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        buttonPanel = new JPanel();

        //Add buttons to panel
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);

        //Add panel to frame
        add(buttonPanel);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Creation of button actions
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        //Link actions with buttons
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }

    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        ColorAction(Color c) {
            backgroundColor = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(backgroundColor);
        }
    }
    public static void main(String[] args) {
        ButtonDaniel b = new ButtonDaniel();
    }
}


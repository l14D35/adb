package gui;

import javax.swing.*;
import java.awt.*;

public class ButtonListener extends JFrame {
    private JPanel buttonPanel;

    private ButtonListener() {
        this.setSize(500,300);

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton blueButton = new JButton("Blue");

        buttonPanel = new JPanel();

        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);

        add(buttonPanel);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        redButton.addActionListener(e -> buttonPanel.setBackground(Color.RED));
        blueButton.addActionListener(e -> buttonPanel.setBackground(Color.BLUE));
        greenButton.addActionListener(e -> buttonPanel.setBackground(Color.GREEN));
    }

    public static void main(String[] args) {
        new ButtonListener();
    }

}

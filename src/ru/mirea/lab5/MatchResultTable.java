package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResultTable extends JFrame {
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;
    private int milanScore;
    private int madridScore;

    public MatchResultTable() {
        super("Match Result Table");

        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");
        milanScore = 0;
        madridScore = 0;

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                resultLabel.setText("Result: " + milanScore + " X " + madridScore);
                lastScorerLabel.setText("Last Scorer: AC Milan");

                if (milanScore > madridScore) {
                    winnerLabel.setText("Winner: AC Milan");
                } else if (milanScore < madridScore) {
                    winnerLabel.setText("Winner: Real Madrid");
                } else {
                    winnerLabel.setText("Winner: DRAW");
                }
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                resultLabel.setText("Result: " + milanScore + " X " + madridScore);
                lastScorerLabel.setText("Last Scorer: Real Madrid");

                if (milanScore > madridScore) {
                    winnerLabel.setText("Winner: AC Milan");
                } else if (milanScore < madridScore) {
                    winnerLabel.setText("Winner: Real Madrid");
                } else {
                    winnerLabel.setText("Winner: DRAW");
                }
            }
        });

        setLayout(new GridLayout(5, 1));
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MatchResultTable();
            }
        });
    }
}
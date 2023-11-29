import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ReverseGUI {
    public static void main(String[] args) {
        new Frame("Reverse Number");
    }
}

class Frame implements ActionListener {
    JFrame GUI;
    JLabel inputMessage, outputMessage;
    JTextField inputNumber;
    JButton btn;

    Frame(String message) {
        GUI = new JFrame(message);

        inputMessage = new JLabel("Enter a number to reverse");
        inputNumber = new JTextField(20);
        btn = new JButton("Submit");
        btn.addActionListener(this);
        outputMessage = new JLabel();

        GUI.add(inputMessage);
        GUI.add(inputNumber);
        GUI.add(btn);
        GUI.add(outputMessage);

        GUI.setLayout(new FlowLayout());
        GUI.setSize(500, 500);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String field, result = "";
        field = inputNumber.getText();
        try {
            int n = Integer.parseInt(field);
            if (n < 0) {
                for (int i = field.length() - 1; i > 0; i--) {
                    result += field.charAt(i);
                }
                result = "-" + result;
            } else {
                for (int i = field.length() - 1; i >= 0; i--) {
                    result += field.charAt(i);
                }
            }
            outputMessage.setText(result);
        } catch (Exception e) {
            outputMessage.setText("Enter a valid number");
        }
    }
}
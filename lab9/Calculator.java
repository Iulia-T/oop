package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JLabel input1 = new JLabel("Dividend");
    JTextField value1 = new JTextField();

    JLabel input2 = new JLabel("Divisor");
    JTextField value2 = new JTextField();

    JLabel output3 = new JLabel(" ");

    JButton button = new JButton("Caculate");

    JLabel error = new JLabel(" ");


    Calculator(){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
          frame.setTitle("Division Calculator");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(300,270);
          frame.setVisible(true);
          frame.add(panel);

        panel.setLayout(null);


          input1.setBounds(20, 40, 160, 25);
          panel.add(input1);

          value1.setBounds(100, 40, 165, 25);
          panel.add(value1);

          input2.setBounds(20, 80, 160, 25);
          panel.add(input2);

          value2.setBounds(100, 80, 165, 25);
          panel.add(value2);

          output3.setBounds(20, 160, 160, 25);
          panel.add(output3);

          error.setBounds(20, 200, 160, 25);
          error.setForeground(Color.RED);
          panel.add(error);

          button.setBounds(135, 120, 100, 25);
          panel.add(button);

          button.addActionListener(this);

    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e){

        Exception except = new Exception(input1.getText(), input2.getText());
        UnluckyException unExcept = new UnluckyException(input1.getText(), input2.getText());

        String s = except.wrongInput();
        String s1 = unExcept.exception();

        if (!s.equals("")) {
            error.setText(s);
        } else
            if(!s1.equals("")) {
                error.setText(s1);
            }
             else {
                 double result;
                 result = Double.parseDouble(input1.getText()) / Double.parseDouble(input2.getText());
                 output3.setText(String.valueOf(result));
             }

    }

}

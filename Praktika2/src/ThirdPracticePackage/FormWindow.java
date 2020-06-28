package ThirdPracticePackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

private class FormWindow extends JFrame {
    JLabel label1, label2, label3, label4;
    JTextField text1, text2, text3;
    JButton btn1, btn2;
    double d ,c, resultS;
    String b;
    SomeActions action = new SomeActions();

    private FormWindow(String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        label1 = new JLabel("Введите значения d: ");
        label2 = new JLabel("Введите количество попыток : ");
        label3 = new JLabel("");
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        btn1 = new JButton("Стереть данные");
        btn2 = new JButton("Подсчитать площадь");
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(btn1);
        add(btn2);
        add(label3);
        btn1.addActionListener(action);
        btn2.addActionListener(action);
    }

    private class SomeActions implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if ((e.getSource()) == btn2) {
                    d = Double.parseDouble(text1.getText());
                    resultS = 0.25 * 3.14 * d * d;
                    label3.setText("Площадь круга: " + resultS);
                }

                if ((e.getSource()) == btn1) {
                    text1.setText("");
                    //text2.setText("");
                    label3.setText("");
                    d = 0;
                }
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null,"Введите корректные значения!");
            }
        }
    }

}

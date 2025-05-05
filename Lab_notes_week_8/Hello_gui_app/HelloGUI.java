package Lab_notes_week_8.Hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame {
    private JPanel MainPanel;
    private JButton clickMeButton;
    private JLabel Myfirstlabel;

    HelloGUI() {
        setContentPane(MainPanel);
        setPreferredSize(new Dimension(500,500));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // code here - this will run when the button is clicked
                Myfirstlabel.setText("Hello GUI Programmers");
            }
        });
    }
}

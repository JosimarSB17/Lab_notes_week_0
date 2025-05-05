package Lab_notes_week_8.Tshirt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TShirtGUI  extends JFrame {
    private JPanel mainPanel;
    private JComboBox Size;
    private JLabel SizeSelected;
    private JComboBox<String> Color;
    private JLabel SelectedColor;

    TShirtGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400,300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Size.setSelectedIndex(-1);
        Color.setSelectedIndex(-1);

        Size.addItem("Small");
        Size.addItem("Medium");
        Size.addItem("Large");

        Size.setSelectedIndex(-1);

        Size.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String SelectedSize = (String) Size.getSelectedItem();
                SizeSelected.setText("Thanks, you chose " + SelectedSize);
            }
        });

        String[] colors = {"Red", "Blue", "Green"};
        DefaultComboBoxModel<String> ColorModel = new DefaultComboBoxModel<>(colors);
        Color.setModel(ColorModel);
        ColorModel.addElement("Pink");
        ColorModel.insertElementAt("Orange", 0);
        ColorModel.removeElementAt(2);

        List<String> moreColors = List.of("Gray", "White", "Black");
        ColorModel.addAll(moreColors);
        System.out.println(ColorModel.getIndexOf("Gray"));
        if (ColorModel.getIndexOf("Magenta") == -1) {
            ColorModel.insertElementAt("Magenta", 0);
        }


        Color.setSelectedIndex(-1);

        Color.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ColorSelected = (String) Color.getSelectedItem();
                SelectedColor.setText("Thanks, you chose " + ColorSelected);
            }
        });
    }
}

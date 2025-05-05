package Lab_notes_week_8.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame {
    private JTextField DollarsTextFIeld;
    private JButton ConvertButton;
    private JLabel EuroResultsLabel;
    private JPanel MainPanel;
    private JComboBox<String> comboBox1;

    private final String Euros = "Euros";
    private final String Pounds = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(Euros, 0.84, Pounds, 0.75);

    CurrencyConverter() {
        setContentPane(MainPanel);
        setPreferredSize(new Dimension(500,300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(ConvertButton);

        comboBox1.addItem(Euros);
        comboBox1.addItem(Pounds);

        ConvertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // what was typed in the JTextField
                String dollarString = DollarsTextFIeld.getText();
                // convert to a number
                try {
                    double dollars = Double.parseDouble(dollarString);
                    String currency = (String) comboBox1.getSelectedItem();

                    double exchangeRate = exchangeRates.get(currency);
                    // convert to Euros
                    double value = exchangeRate * dollars;
                    // display the results in EuroResultsLabel JLabel
                    String eurosString = String.format("%.2f dollars is equivalent to %.2f %s  ", dollars, value, currency);
                    EuroResultsLabel.setText(eurosString);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a valid number with no special characters");
                }

            }
        });
    }
}

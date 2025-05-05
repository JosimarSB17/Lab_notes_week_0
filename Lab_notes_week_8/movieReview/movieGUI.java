package Lab_notes_week_8.movieReview;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class movieGUI extends JFrame {
    private JTextField MovieTitleTextField;
    private JSlider RatingSlider;
    private JCheckBox WouldSeeAgain;
    private JPanel MainPanel;
    private JLabel SliderValue;
    private JLabel MovieOpinion;
    private JButton QuitButton;

    movieGUI() {
        setContentPane(MainPanel);
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        configureEventHandlers();
    }
    private void configureEventHandlers() {
        RatingSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }
        });

        WouldSeeAgain.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                String value = RatingSlider.getValue() + " stars";
                SliderValue.setText(value);
                updateOpinion();
            }
        });

        MovieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // ignore this one
            }
        });

        QuitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(movieGUI.this,
                        "Are you sure you want to quit?", "Quit",
                        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                    dispose();
                }
            }
        });
    }

    private void updateOpinion() {
        String movieName = MovieTitleTextField.getText().strip();
        if (movieName.isEmpty()) {
            MovieOpinion.setText("Movie opinion");
            return;
        }

        int rating = RatingSlider.getValue();
        boolean SeeAgain = WouldSeeAgain.isSelected();

        String template = "You rated %s %d stars. You %s see again ";

      //  String seeAgainString = "would";
       // if (!SeeAgain) {
       //     seeAgainString = "would not";
       // }

        // Alternative - ternary operator, setting values based on a condition
        String seeAgainString = (SeeAgain ? "would " : "would not");

        String opinion = String.format(template, movieName, rating, seeAgainString);

        MovieOpinion.setText(opinion);
    }
}

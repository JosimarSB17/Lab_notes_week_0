package Lab_notes_week_8.car;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VehicleGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField name;
    private JTextField make;
    private JTextField model;
    private JCheckBox electric;
    private JButton add;
    private JList<car> carList;
    private JButton delete;

    private DefaultListModel<car> carListModel;

    VehicleGUI() {
        setTitle("Vehicle List");
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400, 400));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        carListModel = new DefaultListModel<>();
        carList.setModel(carListModel);
        carList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String Name = name.getText();
                String Make = make.getText();
                String Model = model.getText();
                if (Name.isEmpty() || Make.isEmpty() || Model.isEmpty()) {
                    JOptionPane.showMessageDialog(VehicleGUI.this, "Please fill all the fields");
                }
                boolean Electric = electric.isSelected();
                car vehicle = new car(Name, Make , Model, Electric);
                carListModel.addElement(vehicle);

                name.setText("");
                make.setText("");
                model.setText("");
                electric.setSelected(false);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                car selectVehicle = carList.getSelectedValue();
                if (selectVehicle != null) {
                    if (JOptionPane.showConfirmDialog(VehicleGUI.this, "Delete" + selectVehicle.getName() + "?",
                            "Confirm", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                        carListModel.removeElement(selectVehicle);
                    }
                }


            }
        });
    }
}

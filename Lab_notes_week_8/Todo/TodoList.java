package Lab_notes_week_8.Todo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class TodoList extends JFrame{
    private JPanel mainPanel;
    private JTextField newTodo;
    private JButton addButton;
    private JList<String> TodoList;
    private DefaultListModel<String> listModel;

    TodoList(){
        setTitle("To do List");
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(addButton);

        listModel = new DefaultListModel<>();
        TodoList.setModel(listModel);
        TodoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        addListeners();
    }

    private void addListeners(){
        addButton.addActionListener(e -> {
           String newtodo =  newTodo.getText();
           newtodo = newtodo.trim();
           if (newtodo.isEmpty()){
               JOptionPane.showMessageDialog(TodoList.this, "Enter a todo item");
           }else {
               listModel.addElement(newtodo);
               newTodo.setText("");
           }
        });

        TodoList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedIndex = TodoList.getSelectedIndex();
                String selectedItem = listModel.get(selectedIndex);
                if (selectedIndex != -1){
                    if (JOptionPane.showConfirmDialog(TodoList.this, "Delete" + selectedIndex + "?",
                            "Delete" ,JOptionPane.OK_CANCEL_OPTION)
                    == JOptionPane.YES_OPTION){
                        listModel.remove(selectedIndex);
                    }
                }
            }
        });
    }
}

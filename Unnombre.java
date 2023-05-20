/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unnombre;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
/**
 *
 * @author cmarj
 */
public class Unnombre {

     public static void main(String[] args) {
        // Crear un JFrame como ventana principal
        JFrame frame = new JFrame("Ejemplo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel("Nombre:");
        frame.add(label);

        // JTextField
        JTextField textField = new JTextField(40);
        frame.add(textField);

        // JButton
        JButton button = new JButton("Verificar");
        frame.add(button);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("QUE SABOR QUIERE");
        frame.add(checkBox);

        // JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Chocolate 1");
        JRadioButton radioButton2 = new JRadioButton("Vainilla2");
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton1);
        radioButtonGroup.add(radioButton2);
        frame.add(radioButton1);
        frame.add(radioButton2);

        // JComboBox
        String[] options = {"Maní", "Chispas", "Crema Batida"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // JList
        String[] items = {"Extra Helado", "Extra Topping", "Extra Helado y Topping"};
        JList<String> list = new JList<>(items);
        frame.add(list);
        
       // Agregar un ActionListener al botón
        button.addActionListener((ActionEvent e) -> {
            String inputText = textField.getText();
            StringBuilder mensaje = new StringBuilder();
            mensaje.append("Su nombre es: ").append(inputText).append("\n");
            mensaje.append("Seleccionar sabor: ").append(checkBox.isSelected() ? "SI" : "NO").append("\n");
            mensaje.append("Su sabor es: ").append(radioButton1.isSelected() ? "Chocolate 1" : "Vainilla 2").append("\n");
            mensaje.append("Su topping: ").append(comboBox.getSelectedItem()).append("\n");
            mensaje.append("Opciones Extra: ").append(Arrays.toString(list.getSelectedValuesList().toArray()));
            
            JOptionPane.showMessageDialog(frame, mensaje.toString());
        });

        // Mostrar la ventana
        frame.pack();
        frame.setVisible(true);
    }
    
}

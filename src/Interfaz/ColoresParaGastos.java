//Nicolas Hobbins y Matias Medina
package Interfaz;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ColoresParaGastos extends DefaultListCellRenderer{
    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        label.setOpaque(true);

        // logica para asignar colores
        String texto = value.toString();
        int endIndex = texto.indexOf('(');
        String resultado = texto.substring(0, endIndex).trim();
        if (texto.contains("(Presupuestado y Reintegrado)")) {
            label.setBackground(new Color(0, 255, 0)); // Verde
            label.setText(resultado);
        } else if (texto.contains("(Presupuestado y No Reintegrado)")) {
            label.setBackground(new Color(153, 255, 153)); // Verde claro
            label.setText(resultado);
        } else if (texto.contains("(No Presupuestado y Reintegrado)")) {
            label.setBackground(new Color(255, 153, 0)); // Naranja
            label.setText(resultado);
        } else if (texto.contains("(No Presupuestado y No Reintegrado)")) {
            label.setBackground(new Color(255, 0, 0)); // Rojo
            label.setText(resultado);
        }

        if (isSelected) {
            label.setBackground(list.getSelectionBackground());
            label.setForeground(list.getSelectionForeground());
        } else {
            label.setForeground(list.getForeground());
        }

        label.setBorder(new EmptyBorder(1, 1, 1, 1));
        return label;
    }
}

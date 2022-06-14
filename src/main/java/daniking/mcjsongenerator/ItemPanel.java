package daniking.mcjsongenerator;

import javax.swing.*;
import java.awt.*;

public class ItemPanel extends JPanel  {

    public ItemPanel() {
        Box box = Box.createVerticalBox();
        JLabel label = new JLabel("Namespace");
        box.add(label);
        JTextField namespaceField = new JTextField();
        namespaceField.setPreferredSize(new Dimension(120, 40));
        box.add(namespaceField);
        label = new JLabel("Item");
        box.add(label);
        JTextField itemNameField = new JTextField();
        itemNameField.setPreferredSize(new Dimension(120, 40));
        box.add(itemNameField);
    }
}

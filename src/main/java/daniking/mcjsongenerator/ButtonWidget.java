package daniking.mcjsongenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

public class ButtonWidget extends JButton implements ActionListener {

    final Consumer<ButtonWidget> onClick;

    public ButtonWidget(String text,  Consumer<ButtonWidget> onClick) {
        super(text);
        this.onClick = onClick;
        setFont(new Font("SansSerif", Font.BOLD, 20));

        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        onClick.accept(this);
    }
}

package daniking.mcjsongenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen  {

    private final JFrame frame;

    public Screen(String title) {
        JFrame container = new JFrame(title);
        drawContent(container);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setSize(new Dimension(800, 800));
        container.setVisible(true);
        this.frame = container;
    }

    static void drawContent(JFrame frame) {
        frame.setLayout(new FlowLayout());

        final JPanel buttonsBox = new JPanel();
        buttonsBox.setBackground(Color.red);
        buttonsBox.setLayout(new BoxLayout(buttonsBox, BoxLayout.Y_AXIS));

        ButtonWidget itemButton = new ButtonWidget("Item", buttonWidget -> {});
        itemButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonsBox.add(itemButton);

        buttonsBox.add(Box.createVerticalStrut(20));

        ButtonWidget blockButton = new ButtonWidget("Block", buttonWidget -> {});
        blockButton.setAlignmentY(Component.CENTER_ALIGNMENT);
        buttonsBox.add(blockButton);
        frame.add(buttonsBox);
    }

    public JFrame getFrame() {
        return frame;
    }

}

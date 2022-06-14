package daniking.mcjsongenerator;

import javax.swing.*;
import java.awt.*;

public class Screen  {

    private final JPanel itemPanel;
    private final JPanel blockPanel;

    public Screen(String title) {
        JFrame container = new JFrame(title);
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setSize(new Dimension(800, 800));
        drawContent(container);
        this.itemPanel = new ItemPanel();
        container.add(itemPanel);
        this.itemPanel.setVisible(false);
        this.blockPanel = new JPanel();
        buildBlockPanel();
        this.blockPanel.setVisible(false);
        container.setVisible(true);

    }

    private void buildBlockPanel() {

    }

    void drawContent(JFrame frame) {
        frame.setLayout(new GridBagLayout());

        final JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        final JLabel text = new JLabel("Select an option");
        panel.add(text);
        panel.add(Box.createVerticalStrut(20));

        ButtonWidget itemButton = new ButtonWidget("Item", buttonWidget -> {
            panel.setVisible(false);
            this.itemPanel.setVisible(true);
        });
        panel.add(itemButton);
        panel.add(Box.createVerticalStrut(20));
        ButtonWidget blockButton = new ButtonWidget("Block", buttonWidget -> {
            panel.setVisible(false);
            this.blockPanel.setVisible(true);
        });
        panel.add(blockButton);

        frame.add(panel);
    }

    public JPanel getItemPanel() {
        return itemPanel;
    }

    public JPanel getBlockPanel() {
        return blockPanel;
    }
}

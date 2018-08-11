package com.paulucha;

import javax.swing.*;
import java.awt.*;

public class Board {

    public JFrame jFrame;
    public Toolkit toolkit;

    public static Board board;

    public Board() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        toolkit = Toolkit.getDefaultToolkit();
        jFrame = new JFrame("Wąż");
        jFrame.setVisible(true);
        jFrame.setLocation(dim.width / 2 - jFrame.getWidth() / 2, dim.height / 2 - jFrame.getHeight() / 2);
        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

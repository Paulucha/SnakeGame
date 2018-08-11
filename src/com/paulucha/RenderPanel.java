package com.paulucha;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")

public class RenderPanel extends JPanel
{

    public static final Color GREEN = new Color(13256865);

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Board snake = Board.snake;

        g.setColor(GREEN);

        g.fillRect(0, 0, 800, 700);

        g.setColor(Color.BLUE);

        for (Point point : snake.snakeParts)
        {
            g.fillRect(point.x * Board.SCALE, point.y * Board.SCALE, Board.SCALE, Board.SCALE);
        }

        g.fillRect(snake.head.x * Board.SCALE, snake.head.y * Board.SCALE, Board.SCALE, Board.SCALE);

        g.setColor(Color.RED);

        g.fillRect(snake.cherry.x * Board.SCALE, snake.cherry.y * Board.SCALE, Board.SCALE, Board.SCALE);

        String string = "Wynik: " + snake.score + ", Długość: " + snake.tailLength + ", Czas gry: " + snake.time / 20;

        g.setColor(Color.white);

        g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5f), 10);

        string = "Przegrałeś HA HA HA HA";

        if (snake.over)
        {
            g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5f), (int) snake.dim.getHeight() / 4);
        }

        string = "PAUZA";

        if (snake.paused && !snake.over)
        {
            g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5f), (int) snake.dim.getHeight() / 4);
        }
    }
}

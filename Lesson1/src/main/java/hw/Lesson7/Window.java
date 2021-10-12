package hw.Lesson7;


import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {


    private int winWidth = 800;
    private int winHeight = 600;
    private int winPositionX = 400;
    private int winPositionY = 200;

    private Map map;
    private Gui mainPanel;

    Window() {

        setupWindow();
        mainPanel = new Gui();
        map = new Map();

        add(map);
        add(mainPanel);

        setVisible(true);

    }
    private void setupWindow() {
        setLocation(winPositionX, winPositionY);
        setSize(winWidth, winHeight);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Window");
        setResizable(false);
    }

}


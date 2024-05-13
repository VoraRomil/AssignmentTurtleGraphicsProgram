import java.awt.Container;

import javax.swing.JFrame;

public class MainClass {

    public static void main(String[] args) {
       
       JFrame frame = new JFrame ("FS 2024 Turtle Graphics Class Demo");
       
        TurtleGraphics turtlegraphics = new TurtleGraphics ();
       
       Container toplevelContainer = frame.getContentPane();
       
       toplevelContainer.add(turtlegraphics);
       
       frame.pack();
       frame.setVisible(true);
       
       turtlegraphics.about();
       
       
    }

}
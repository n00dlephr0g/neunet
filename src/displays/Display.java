package displays;

import javax.swing.JFrame;
import java.awt.Canvas;

public class Display extends Canvas {
    JFrame jFrame;

    public Display(int width, int height) {
        setSize(width,height);
    }
    public void draw(){
        jFrame =new JFrame();
        jFrame.add(this);
        jFrame.setSize(this.getSize());
        jFrame.setVisible(true);
    }
}
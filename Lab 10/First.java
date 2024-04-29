
// import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class First extends JApplet {

    public void paint(Graphics g) {

        //For Smile Face
        g.drawString("Smile", 200, 200);
        g.drawOval(200, 200, 150, 150);
        g.drawArc(230, 240, 30, 30, 0, 360);
        g.drawArc(290, 240, 30, 30, 0, 360);
        g.drawArc(240, 280, 70, 40, 180, 180);

        // first triangle
        g.drawLine(50, 50, 80, 70);
        g.drawLine(50, 50, 20, 70);
        g.drawLine(20, 70, 80, 70);
        g.setColor(Color.red);
        g.fillOval(45, 55, 10, 10);

        // two rectangle
        g.setColor(Color.black);
        g.drawRect(20, 70, 60, 100);
        g.drawRect(80, 70, 150, 100);

        // roof
        g.drawLine(50, 50, 200, 50);
        g.drawLine(200, 50, 230, 70);

    }
}
// import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class Second extends JApplet {
    String m1 = "sequence of method called:: ";
    String m2;
    String name;

    public void init() {
        setBackground(Color.pink);
        setForeground(Color.black);
        m2 = m1 + "From init() method::";
        // name=getParameter("user:
    }

    public void start() {
        m2 = m2 + "from start() method::: ";

    }

    public void stop() {
        System.out.println("Applet stopped here :: from stop() method :: ");
    }

    public void destroy() {
        System.out.println("Applet destroyed::: ");

    }

    public void paint(Graphics g) {
        m2 = m2 + "from paint method:: ";
        Font obj = new Font("Arial", 1, 15);
        g.setFont(obj);
        g.drawString(m2, 30, 50);
    }

}
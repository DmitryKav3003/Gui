import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest {
    public static void main(String[] args) {
        BoxLayoutTest boxLayoutTest = new BoxLayoutTest();
        boxLayoutTest.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        panel.add(button);
        JButton button1 = new JButton("Buttontwo");
        panel.add(button1);
        JButton button2 = new JButton("Buttonthree");
        panel.add(button2);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }
}
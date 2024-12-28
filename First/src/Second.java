import javax.swing.*;
import java.awt.*;

public class Second {
    JFrame frame = new JFrame("Hospital Management System");
    JLabel Background;

    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int) size.getWidth();
    int height = (int) size.getHeight();
    Second() {
        ImageIcon image = new ImageIcon(getClass().getResource("/22.jpg"));
        Image img = image.getImage();

        Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);

        Background = new JLabel(image);
        Background.setSize(width, height);

        frame.setLayout(null);

        frame.add(Background);

        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Second();
    }
}

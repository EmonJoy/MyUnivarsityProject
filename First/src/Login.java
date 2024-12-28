import javax.swing.*;
import java.awt.*;

public class Login extends Second {
    JLabel main_label;
    JLabel title_label;
    JPasswordField password_field;
    JTextField phone_field;
    JLabel pass_label = new JLabel();
    JLabel phone_label = new JLabel();
    JButton btn1 = new JButton("Confirm");
    JButton btn2 = new JButton("Clear");

    Login() {
        super();

        title_label = new JLabel();
        main_label = new JLabel();
        password_field = new JPasswordField();
        phone_field = new JTextField();


        title_label.setText("Hospital Management System");
        title_label.setForeground(Color.RED);
        title_label.setSize(400, 200);
        title_label.setBounds(width / 2 - 400, 10, width, 200);
        title_label.setFont(new Font("Times New Roman", Font.BOLD, 60));

        main_label.setText("Login");
        main_label.setForeground(Color.RED);
        main_label.setSize(400, 200);
        main_label.setBounds(width / 2 - 150, 100, 400, 200);
        main_label.setFont(new Font("Arial", Font.BOLD, 60));

        phone_field.setBounds(width /2 - 150, 300, 150, 30);
        phone_label.setText("Phone: ");
        phone_label.setBounds(width / 2-270, 300,150,30 );
        phone_label.setFont(new Font("Times New Roman", Font.BOLD,40));

        password_field.setBounds(width /2 - 150, 350, 150, 30);
        pass_label.setText("Password: " );
        pass_label.setBounds(width / 2-335, 350,200,30 );
        pass_label.setFont(new Font("Times New Roman", Font.BOLD,40));


        Background.add(title_label);
        Background.add(phone_label);
        Background.add(main_label);
        Background.add(phone_field);
        Background.add(password_field);
        Background.add(pass_label);

        frame.add(Background);

        frame.setSize(width, height);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}

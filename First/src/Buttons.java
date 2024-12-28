import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Buttons extends  Login{
    Buttons(){
        super();
        btn1.setBounds(width /2 - 200, 400, 90, 30);
        btn1.setFocusable(false);
        btn2.setBounds(width /2 - 100, 400, 90, 30);
        btn2.setFocusable(false);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String number = phone_field.getText();
                String pass = new String(password_field.getPassword());
                if (number.equals("123") && pass.equals("222") && !number.isEmpty() && !pass.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"LoggedIn");
                }else if (number.isEmpty()){
                    JOptionPane.showMessageDialog(frame,"Please write your number");
                } else if (pass.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,"Please fill your pass");
                } else if (!number.equals("123")) {
                    JOptionPane.showMessageDialog(frame,"Incorrect Number", "Error",JOptionPane.ERROR_MESSAGE);

                } else if (!pass.equals("222")) {
                    JOptionPane.showMessageDialog(frame, "Incorrect Password", "Error", JOptionPane.ERROR_MESSAGE);

                } else{
                    JOptionPane.showMessageDialog(frame,"Login failed","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                phone_field.setText("");
                password_field.setText("");
            }
        });

        Background.setLayout(null);
        Background.add(btn1);
        Background.add(btn2);
    }



}


import java.awt.*;
import javax.swing.*;

public class SimpleLogin {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel helloLabel = new JLabel("Hello", SwingConstants.CENTER);
        helloLabel.setFont(new Font("Arial", Font.BOLD, 20));
        helloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(10)); // Space
        mainPanel.add(helloLabel);

        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(10);
        nameField.setToolTipText("Enter your name");

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(10);
        passField.setToolTipText("Enter your password");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(passLabel);
        inputPanel.add(passField);
        mainPanel.add(Box.createVerticalStrut(10)); // Space
        mainPanel.add(inputPanel);

        JButton loginButton = new JButton("LOG IN");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(10)); // Space
        mainPanel.add(loginButton);

        loginButton.addActionListener(e -> 
        {
            String name = nameField.getText().trim();
            String password = new String(passField.getPassword()).trim();

            if (name.isEmpty() || password.isEmpty()) 
            {
                JOptionPane.showMessageDialog(frame, "Enter your name and password", "Input Error", JOptionPane.WARNING_MESSAGE);
            } else 
            {
                JOptionPane.showMessageDialog(frame, "Successfully logged in");
            }
        });

        // Add main panel to frame
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }

}

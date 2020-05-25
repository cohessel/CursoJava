package programaswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundo {
    private JButton cliqueEmMimButton;
    private JLabel lbMensagem;
    private JPanel panel1;

    public OlaMundo() {
        cliqueEmMimButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OlaMundo");
        frame.setContentPane(new OlaMundo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.isVisible();
    }


}

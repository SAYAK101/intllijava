import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingsDemo {

    JLabel jbl1;

    SwingsDemo()
    {
        JFrame jfrm =new JFrame("Demo App");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(500,250);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb1=new JButton("Ok");
        JButton jb2=new JButton("Cancel");

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbl1.setText("Ok was Pressed.");
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbl1.setText("Cancel was Pressed.");
            }
        });
        JLabel jbl=new JLabel("Using the JLABEL: label field ",SwingConstants.CENTER);

        jfrm.add(jb1);
        jfrm.add(jb2);
        jfrm.add(jbl);

        jbl1=new JLabel("Press a Button");
        jfrm.add(jbl1);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingsDemo();
            }
        });
    }
}

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApletSwings extends Applet{

    JLabel jbl1;
    JButton jb1=new JButton("Ok");
    JButton jb2=new JButton("Cancel");

    private void SwingsDemo()
    {
        //JFrame jfrm =new JFrame("Demo App");

        setLayout(new FlowLayout());

        setSize(500,250);

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
        //JLabel jbl=new JLabel("Using the JLABEL: label field ",SwingConstants.CENTER);

        add(jb1);
        add(jb2);


        jbl1=new JLabel("Press a Button");
        add(jbl1);

     }

    public void init() {
        try{
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SwingsDemo();
            }
        });
        }catch (Exception e){
            System.out.println("Can't create because of "+e);
        }
    }
}

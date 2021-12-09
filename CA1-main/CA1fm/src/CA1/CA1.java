package CA1;


/**
 *
 * @author Fabiolla/Farley
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

// Fabiola, I set the Frames to "frame.setSize (500, 400)" width and size
// To make it easier, you can use the structured pages I created, I will try to clean
// the code to make it easy understanding
//**Created folder libs that i included JPlanner (calender) source**.
public class CA1 extends JPanel {

//the commands for the next pages
    static JButton button1;
    static JButton button2;

    static JTextField ta;
    static EventHandler eventHandler;

    public static void WelcomeWindow() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        panel.setLayout(new GridLayout(10, 10));

        button1 = new JButton("Order Drink");
        button2 = new JButton("Register\n"
                + "Store");

        eventHandler = new EventHandler();

        button1.addActionListener(eventHandler);
        button2.addActionListener(eventHandler);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(700, 550);

        panel.add(new JLabel("         "));
        panel.add(new JLabel("Hi!! Welcome to Gargle Delivery!\n"
                + "Choose a option:"));
        panel.add(new JLabel("         "));
        panel.add(button1);
        panel.add(button2);

        panel.setBorder(BorderFactory.createTitledBorder("SOS BEAUTY"));
        
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                LOGINPAGE ps = new LOGINPAGE();
               
                ps.setVisible(true);
                
                  //dispose();

            } 
            else if (e.getSource() == button2) {
                LOGINPAGESP nc = new LOGINPAGESP();
                nc.setVisible(true);
                
            }

        }

        private void dispose() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    public static void main(String[] args) {

        // this is to open the new windows
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WelcomeWindow();
            }

        });

    }
}

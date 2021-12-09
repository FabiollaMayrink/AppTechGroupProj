package CA1;



/**
 *ASDF
 * @author Fabiolla/Farley
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
   
public class SCHEDULE {

   
    
    JButton menu = new JButton("MENU");
    JFrame f;

    SCHEDULE() {
        
       
        
        f=new JFrame();    
        //for
    String data[][]={ {"Arnold Dough","DONE","11/12/2020","Attended","10/10"},    
                            {"Billy White","FAILED","11/12/2020","Not Arrived","#"},    
                            {"Mark Greffman","DONE","11/12/2020","Attended","10/10"},
                            {"Arnold Dough","DONE","11/12/2020","Attended","10/10"},
                            {"Justin Bieber","DONE","11/12/2020","Attended","10/10"},    
                            {"Garry Hunt","DONE","12/12/2020","Not Arrived","#"},    
                            {"Louis Souve","DONE","12/12/2020","Attended","10/10"},
                            {"Daniel McNell","DONE","12/12/2020","Attended","10/10"},
                            {"Fred Frow","DONE","12/12/2020","Attended","10/10"},    
                            {"Bob Whef","DONE","12/12/2020","Not Arrived","#"},    
                            {"Marley Gryman","DONE","12/10/2020","Attended","10/10"},
                            {"Alfie McDuh","DONE","12/10/2020","Attended","10/10"},
                            {"Abbey Dygh","DONE","13/10/2020","Attended","10/10"},    
                            {"Sean McFy","PENDING","1310/2020","Comming","#"},    
                            {"Fineas Phoa","PENDING","13/10/2020","Comming","10/10"},
                            {"Pherb Phoa","PENDING","13/10/2020","Comming","10/10"},
                            {"Michael Wolfh","PENDING","13/12/2020","Comming","#"} };    
    String column[]={"NAME","PAYMENT","DATE","STATUS","FEEDBACK"};         
    JTable jt=new JTable(data,column);    
    
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(700,550);    
    f.setVisible(true);  
    
        

    }

    
    
    public static void main(String[] args) {    
    new SCHEDULE();    
}    

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
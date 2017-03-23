/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author evawero
 */
public class questions {
    public static void one(){
    final SimpleFrame frame = new SimpleFrame();

    JPanel p1 = new JPanel();
    p1.setSize(400,100);
    frame.add(p1);

    JLabel qu1 = new JLabel();
    qu1.setText("In computers, what is the smallest and basic unit of");
    JLabel qu2 = new JLabel();
    qu2.setText("information storage?");
    p1.add(qu1);
    p1.add(qu2);

    JPanel p2 = new JPanel();
    p2.setSize(400,175);
    p2.setLocation(0,100);
    p2.setLayout(new GridLayout(2,4));
    frame.add(p2);

    JButton a = new JButton("a. Bit");
    p2.add(a);

    JButton b = new JButton("b. Byte");
    p2.add(b);

    JButton c = new JButton("c. Data");
    p2.add(c);        

    JButton d = new JButton("d. Newton");
    p2.add(d);

    frame.setVisible(true);

    final PopQuizDemo demo = new PopQuizDemo();

    a.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    b.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    c.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    d.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
}//end of method

public static void two(){
    final SimpleFrame frame = new SimpleFrame();

    JPanel p1 = new JPanel();
    p1.setSize(400,100);
    jframe.add(p1);

    JLabel qu1 = new JLabel();
    qu1.setText("Machine language is also known as __________.");
    p1.add(qu1);

    JPanel p2 = new JPanel();
    p2.setSize(400,175);
    p2.setLocation(0,100);
    p2.setLayout(new GridLayout(2,4));
    frame.add(p2);

    JButton a = new JButton("a. Low level language");
    p2.add(a);

    JButton b = new JButton("b. Assembly language");
    p2.add(b);

    JButton c = new JButton("c. High level language");
    p2.add(c);        

    JButton d = new JButton("d. Source code");
    p2.add(d);

    frame.setVisible(true);

    final PopQuizDemo demo = new PopQuizDemo();

    a.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    b.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    c.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    d.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
}//end of method

public static void three(){
    final SimpleFrame frame = new SimpleFrame();

    JPanel p1 = new JPanel();
    p1.setSize(400,100);
    frame.add(p1);

    JLabel qu1 = new JLabel();
    qu1.setText("What is the shortcut key of printing a document for");
    JLabel qu2 = new JLabel();
    qu2.setText("computers using Windows?");
    p1.add(qu1);
    p1.add(qu2);

    JPanel p2 = new JPanel();
    p2.setSize(400,175);
    p2.setLocation(0,100);
    p2.setLayout(new GridLayout(2,4));
    frame.add(p2);

    JButton a = new JButton("a. Ctrl + P");
    p2.add(a);

    JButton b = new JButton("b. Shift + P");
    p2.add(b);

    JButton c = new JButton("c. Shift + PP");
    p2.add(c);        

    JButton d = new JButton("d. Alt + P");
    p2.add(d);

    frame.setVisible(true);

    final PopQuizDemo demo = new PopQuizDemo();

    a.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    b.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    c.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
    d.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             demo.randomize();
         }
    });
}//end of method
    
}

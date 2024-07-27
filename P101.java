
/*Write a program to demonstrate the use of AWT components like label, textfield,textarea,button,checkbox,radiobutton etc.*/
import java.awt.*;
import java.awt.event.*;

class P101 extends Frame 
{
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;
    TextArea ta1;
    Button b1;
    Checkbox ch1;
    
    P101() 
{
        // Set layout to null for absolute positioning
        setLayout(null);
        
        // Set background and foreground colors
        setBackground(Color.RED);
        setForeground(Color.BLACK);
        
        // Initialize labels
        l1 = new Label("India");
        l2 = new Label("America");
        l3 = new Label("Australia");
        
        // Set bounds for labels
        l1.setBounds(100, 100, 110, 60);
        l2.setBounds(100, 180, 110, 60);
        l3.setBounds(100, 260, 110, 60);
        
        // Add labels to frame
        add(l1);
        add(l2);
        add(l3);
        
        // Initialize text fields
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        tf3 = new TextField(10);
        
        // Set bounds for text fields
        tf1.setBounds(100, 340, 110, 60);
        tf2.setBounds(100, 420, 110, 60);
        tf3.setBounds(100, 500, 110, 60);
        
        // Add text fields to frame
        add(tf1);
        add(tf2);
        add(tf3);
        
        // Initialize text area
        ta1 = new TextArea(10, 20);
        
        // Set bounds for text area
        ta1.setBounds(250, 340, 200, 220);
        
        // Add text area to frame
        add(ta1);
        
        // Initialize button
        b1 = new Button("Submit");
        
        // Set bounds for button
        b1.setBounds(200, 600, 80, 30);
        
        // Add button to frame
        add(b1);
        
        // Initialize checkbox
        ch1 = new Checkbox("Agree");
        
        // Set bounds for checkbox
        ch1.setBounds(300, 600, 80, 30);
        
        // Add checkbox to frame
        add(ch1);
        
        // Add window listener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        P101 p = new P101();
        
        p.setVisible(true);
        p.setTitle("PRACTICAL ONE QUESTION ONE");
        p.setSize(500, 700);
    }
}

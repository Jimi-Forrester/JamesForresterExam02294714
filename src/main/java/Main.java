import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args){
        EnvironmentalSystem test = new EnvironmentalSystem();

        JFrame frame= new JFrame();	// Create a new JFrame
        frame.setSize(600,600);
        frame.setLayout(new GridLayout(1,3));

        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {    // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        OutputUI uiPanel = new OutputUI();

        frame.add(uiPanel.getOutputUI());



        frame.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                frame.repaint();
            }
        });
        timer.start();



    }
}

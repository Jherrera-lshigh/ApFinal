
import java.awt.*;
import javax.swing.*;


public class scroller extends JPanel 
{
    private static final long serialVersionUID = 7148504528835036003L;


    public void paintComponent(Graphics g)
    {
        g.fillRect(900, 800, 100, 150);
    }



    public static void main(String[] args)
    {

        
    var panel = new scroller();

    var frame = new JFrame("MS Paint Got Nothing On Me");
    frame.setSize(1500, 1500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //panel.setBackground(Color.Green.darker());
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setVisible(true);
    }
}
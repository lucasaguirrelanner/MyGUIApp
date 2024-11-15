import javax.swing.*;

public class FormThree extends JFrame
{
    private JPanel MainPanel3;
    private JPanel MainPanel;

    //this is our constructor!
    public FormThree ()
    {
        setContentPane(MainPanel);
        setTitle(" Hello ");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 600);
        setLocation (300, 100);
        setVisible(true);

    }
}

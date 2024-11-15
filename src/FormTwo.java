import javax.swing.*;

public class FormTwo extends JFrame
{
    private JPanel MainPanel2;
    private JPanel MainPanel;

    //this is our constructor!
    public FormTwo ()
    {
        setContentPane(MainPanel);
        setTitle(" Hello ");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 600);
        setLocation (300, 100);
        setVisible(true);

    }
}

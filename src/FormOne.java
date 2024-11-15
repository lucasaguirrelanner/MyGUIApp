import javax.swing.*;

public class FormOne extends JFrame
{
    private JPanel MainPanel;

    //this is our constructor!
    public FormOne ()
    {
        setContentPane(MainPanel);
        setTitle(" Hello ");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 600);
        setLocation (300, 100);
        setVisible(true);

    }
}

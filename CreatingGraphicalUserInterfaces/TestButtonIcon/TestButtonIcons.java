import javax.swing.*;

public class TestButtonIcons extends JFrame{
    public static void main(String[] args){
        //Create a frame and set its properties
        JFrame frame = new TestButtonIcons();
        frame.setTitle("ButtonIcons");
        frame.setSize(200,100);
        frame.setLocationRelativeTo(null); //Center frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public TestButtonIcons() {
        ImageIcon usIcon = new ImageIcon("images/usIcon.gif");
        ImageIcon caIcon = new ImageIcon("images/caIcon.gif");
        ImageIcon ukIcon = new ImageIcon("images/ukIcon.gif");

        JButton jbt = new JButton("Click it", usIcon);
        jbt.setPressedIcon(caIcon);
        jbt.setRolloverIcon(ukIcon);

        add(jbt);
    }
}
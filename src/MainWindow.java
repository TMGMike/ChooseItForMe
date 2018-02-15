import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.net.URL;

/**
 * Created by u1764905 on 13/02/2018.
 */
public class MainWindow {
    private JPanel panel1;
    private JPanel centrePnl;
    private JLabel centreLbl;
    private JPanel iconPnl;
    private JButton moviesButton;
    private JButton gamesButton;
    private JButton placesButton;
    private JButton recipesButton;

    public MainWindow() {
        // ImageIcon image = new ImageIcon(new ImageIcon("tmg_logo_round256.png").getImage().getScaledInstance(64,64, Image.SCALE_DEFAULT));

        centreLbl.setIcon(new ImageIcon(getClass().getResource("tmg_logo_round144.png")));
       // centreLbl.setMaximumSize(iconPnl.getSize());
       // centreLbl.setSize(iconPnl.getSize());


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainWindow");
        frame.setContentPane(new MainWindow().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(547,534));

    }
}

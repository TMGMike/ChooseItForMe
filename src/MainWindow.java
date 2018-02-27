import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
    private JButton confirmSelectionBtn;
    private JPanel categoryPnl;
    private JPanel menuPnl;
    private JComboBox comboBox1;
    private JLabel categoryDisplayLbl;
    private JButton backBtn;

    public MainWindow() {
        // ImageIcon image = new ImageIcon(new ImageIcon("tmg_logo_round256.png").getImage().getScaledInstance(64,64, Image.SCALE_DEFAULT));
       // categoryPnl.setVisible(false);
        //menuPnl.setVisible(true);

        centreLbl.setIcon(new ImageIcon(getClass().getResource("tmg_logo_round144.png")));
       // centreLbl.setMaximumSize(iconPnl.getSize());
       // centreLbl.setSize(iconPnl.getSize());


        moviesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPnl.setVisible(false);
                categoryPnl.setVisible(true);
                categoryDisplayLbl.setText("Movies/TV Shows");
                backBtn.requestFocus();
                setComboBoxItems(0);
            }
        });
        gamesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPnl.setVisible(false);
                categoryPnl.setVisible(true);
                categoryDisplayLbl.setText("        Games    ");
                backBtn.requestFocus();
                setComboBoxItems(1);
            }
        });
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPnl.setVisible(true);
                categoryPnl.setVisible(false);
            }
        });
        placesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPnl.setVisible(false);
                categoryPnl.setVisible(true);
                categoryDisplayLbl.setText("        Places    ");
                backBtn.requestFocus();
                setComboBoxItems(2);
            }
        });
        recipesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuPnl.setVisible(false);
                categoryPnl.setVisible(true);
                categoryDisplayLbl.setText("        Recipes    ");
                setComboBoxItems(3);
                backBtn.requestFocus();
            }
        });
        panel1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode() == 27){
                    menuPnl.setVisible(true);
                    categoryPnl.setVisible(false);

                }
            }
        });
        categoryPnl.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode() == 27){
                    menuPnl.setVisible(true);
                    categoryPnl.setVisible(false);

                }
            }
        });
        moviesButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode() == 27){
                    menuPnl.setVisible(true);
                    categoryPnl.setVisible(false);

                }
            }
        });
        backBtn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if(e.getKeyCode() == 27){
                    menuPnl.setVisible(true);
                    categoryPnl.setVisible(false);

                }
            }
        });
    }
    private void setComboBoxItems(int category){
        // 0 = TV/Movies
        // 1 = Games
        // 2 = Places
        // 3 = Recipes

        if(category == 0) {
            comboBox1.removeAllItems();
            comboBox1.addItem("Action");
            comboBox1.addItem("Comedy");
            comboBox1.addItem("Horror");
            comboBox1.addItem("Romance");
        }
        else if(category == 1) {
            comboBox1.removeAllItems();
            comboBox1.addItem("RPG");
            comboBox1.addItem("Action");
            comboBox1.addItem("Comedy");
            comboBox1.addItem("Open World");
            comboBox1.addItem("Horror");
        }
        else if(category == 2){
            comboBox1.removeAllItems();
            comboBox1.addItem("England");
            comboBox1.addItem("America");
            comboBox1.addItem("China");
            comboBox1.addItem("France");
            comboBox1.addItem("Germany");
            comboBox1.addItem("Japan");
        }
        else if(category == 3){
            comboBox1.removeAllItems();
            comboBox1.addItem("English");
            comboBox1.addItem("Italian");
            comboBox1.addItem("Chinese");
            comboBox1.addItem("German");
            comboBox1.addItem("French");
        }
    }
    public static void main(String[] args) {
        final String VERSION = "0.3.5";
        JFrame frame = new JFrame("Choose It For Me [" + VERSION + "]");
        frame.setContentPane(new MainWindow().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(547,534));
    }
}

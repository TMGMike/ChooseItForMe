import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
    private JComboBox categoryChoices;
    private JLabel categoryDisplayLbl;
    private JButton backBtn;
    private JSeparator leftSeparator;
    private int categoryID = 0;
    public MainWindow() {
        // ImageIcon image = new ImageIcon(new ImageIcon("tmg_logo_round256.png").getImage().getScaledInstance(64,64, Image.SCALE_DEFAULT));
       // categoryPnl.setVisible(false);
        //menuPnl.setVisible(true);
        iconPnl.setBackground(new Color(255,255,255));
        menuPnl.setBackground(new Color(255,255,255));
        categoryPnl.setBackground(new Color(255,255,255));
        centrePnl.setBackground(new Color(255,255,255));
        panel1.setBackground(new Color(255,255,255));

        placesButton.setBackground(new Color(255,255,255));
        gamesButton.setBackground(new Color(255,255,255));
        recipesButton.setBackground(new Color(255,255,255));
        moviesButton.setBackground(new Color(255,255,255));

        placesButton.setForeground(new Color(255,255,255));
        gamesButton.setForeground(new Color(255,255,255));
        recipesButton.setForeground(new Color(255,255,255));
        moviesButton.setForeground(new Color(255,255,255));
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
        playAnimation(moviesButton);
        playAnimation(gamesButton);
        playAnimation(placesButton);
        playAnimation(recipesButton);
    }
    private void setComboBoxItems(int category){
        // 0 = TV/Movies
        // 1 = Games
        // 2 = Places
        // 3 = Recipes
        categoryID = category;
        if(category == 0) {
            categoryChoices.removeAllItems();

            categoryChoices.addItem("Action");
            categoryChoices.addItem("Comedy");
            categoryChoices.addItem("Horror");
            categoryChoices.addItem("Romance");
        }
        else if(category == 1) {
            categoryChoices.removeAllItems();
            categoryChoices.addItem("RPG");
            categoryChoices.addItem("Action");
            categoryChoices.addItem("Comedy");
            categoryChoices.addItem("Open World");
            categoryChoices.addItem("Horror");
        }
        else if(category == 2){
            categoryChoices.removeAllItems();
            categoryChoices.addItem("England");
            categoryChoices.addItem("America");
            categoryChoices.addItem("China");
            categoryChoices.addItem("France");
            categoryChoices.addItem("Germany");
            categoryChoices.addItem("Japan");
        }
        else if(category == 3){
            categoryChoices.removeAllItems();
            categoryChoices.addItem("English");
            categoryChoices.addItem("Italian");
            categoryChoices.addItem("Chinese");
            categoryChoices.addItem("German");
            categoryChoices.addItem("French");
        }
    }

    public void playAnimation (JButton button) {
        Runner runner = new Runner();
        Thread t = new Thread(runner);
        runner.setButton(button);
        t.start();
        System.out.println("The current button colour is: " + button.getBackground());
    }


    public static void main(String[] args) {
        final String VERSION = "0.6.5";
        JFrame frame = new JFrame("Choose It For Me [" + VERSION + "]");
        frame.setContentPane(new MainWindow().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(547,534));
    }
}

class Runner implements Runnable {
    private JButton button;
    @Override
    public void run() {

        int backI = 255;
        int foreI = 1;
        int wait = 0;

        while(backI != 160) {
            while(wait != 500) {
                System.out.println("adding - " + wait);
                wait++;
            }
            backI--;

            System.out.println("Adding 1 to colour. " + button.getBackground().toString());
            button.setForeground(new Color(foreI,foreI,foreI));
            button.setBackground(new Color(backI,backI,backI));
            foreI+=3;
            wait = 0;
        }
    }
    void setButton(JButton button){
        this.button = button;
    }
}

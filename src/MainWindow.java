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

        String[] images = new String[]{"beef wellington.png", "toast.png", "pizza.png"};

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

        confirmSelectionBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(categoryID == 0){
                    FilmList films = new FilmList();
                    if(categoryChoices.getSelectedItem().equals("Action")){
                        films.addFilm("Die Hard", "", "8.2", "1988");
                        films.addFilm("The Bourne Identity", "", "7.9", "2002");
                        films.addFilm("Inception", "", "8.8", "2010");
                        films.addFilm("Casino Royale", "", "8.0", "2006");
                        films.addFilm("Kill Bill Vol.1", "", "8.1", "2003");
                        films.addFilm("The Dark Knight","","9.0","2008");
                        films.addFilm("Skyfall","","7.8","2012");
                        films.addFilm("Taken","","6.6","2008");
                        films.addFilm("John Wick","","7.3","2014");
                        films.addFilm("Black Panther","","7.8","2018");
                    }
                    else if(categoryChoices.getSelectedItem().equals("Comedy")){
                        films.addFilm("Ghostbusters","","7.8","1984");
                        films.addFilm("Matilda","","6.9","1996");
                        films.addFilm("21 Jump Street","","7.2","2012");
                        films.addFilm("Pineapple Express","","7.0","2008");
                        films.addFilm("Wedding Crashers","","7.0","2005");
                        films.addFilm("Dumb and Dumber","","7.3","1994");
                        films.addFilm("The Big Sick","","7.6","2017");
                        films.addFilm("White Chicks","","5.5","2004");
                        films.addFilm("The Hangover","","7.7","2009");
                        films.addFilm("Four Lions","","7.3","2010");
                    }
                    else if (categoryChoices.getSelectedItem().equals("Horror")){
                        films.addFilm("The Purge","","5.7","2013");
                        films.addFilm("The Conjuring","","7.5","2013");
                        films.addFilm("Sinister","","6.8","2012");
                        films.addFilm("Get Out","","7.7","2017");
                        films.addFilm("Paranormal Activity","6.3","","2007");
                        films.addFilm("SAW","","7.6","2004");
                        films.addFilm("Kill List","","6.4","2011");
                        films.addFilm("IT","","7.5","2017");
                        films.addFilm("The Host ","","5.9","2013");
                        films.addFilm("Session 9","","6.5","2001");
                    }
                    Comedy movies = new Comedy(films);
                    movies.setVisible(true);
                }
            }
        });
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
                System.out.println();
                wait++;
            }
            backI--;


            try {
                button.setForeground(new Color(foreI,foreI,foreI));
                button.setBackground(new Color(backI,backI,backI));
                foreI+=3;
                wait = 0;
            }catch (Exception ignored){

            }
            System.out.println("Adding 1 to colour. " + button.getBackground().toString());

        }
    }
    void setButton(JButton button){
        this.button = button;
    }
}

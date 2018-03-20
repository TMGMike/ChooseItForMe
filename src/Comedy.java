import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Comedy {
    private JPanel mainPanel;
    private JList listOfMovies;
    private JButton chooseButton;
    private JTextField displayMovieTextField;
    private JTextField nameTextField;
    private JTextField yearTextField;
    private JTextField iMDbRatingTextField;
    private JLabel iMDbRating;
    private JButton addNewButton;
    private String name;
    private String year;
    private String imdbRating;
    private JFrame frame;
    private FilmList films;

    public Comedy(FilmList films) {

        frame = new JFrame("Movies/TV Shows");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();

        this.films = films;
        listOfMovies.setModel(films);
        listOfMovies.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                nameTextField.setText(films.get(listOfMovies.getSelectedIndex()).getTitle());
                iMDbRatingTextField.setText(films.get(listOfMovies.getSelectedIndex()).getImdbRating());
                yearTextField.setText(films.get(listOfMovies.getSelectedIndex()).getYear());
            }
        });
        chooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*Random r = new Random();

                int index = 10;
                for (int i = 0; i < index; i++){
                    int test = 0;
                    while(test != 30000){
                        test++;
                        System.out.println("test");
                    }
                    int Low = 0;
                    int High = films.size();
                    int filmId = r.nextInt(High-Low) + Low;
                    listOfMovies.setSelectedIndex(filmId);
                }*/
                index = 0;
                Timer t = new Timer();

                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        Random r = new Random();
                        int Low = 0;
                        int High = films.size();
                        int filmId = r.nextInt(High-Low) + Low;
                        listOfMovies.setSelectedIndex(filmId);
                        index++;
                        if(index >= 10){
                            t.cancel();
                        }
                    }
                };

                t.scheduleAtFixedRate(task, 0, 150);
            }
        });
    }

    private int index = 0;

    public void setListOfMovies (JList listOfMovies){
        this.listOfMovies = listOfMovies;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }
    public void setVisible(boolean visibility){
        frame.setVisible(visibility);
    }
    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

    public JTextField getYearTextField() {
        return yearTextField;
    }

    public void setYearTextField(JTextField yearTextField) {
        this.yearTextField = yearTextField;
    }

    public JTextField getiMDbRatingTextField() {
        return iMDbRatingTextField;
    }

    public void setiMDbRatingTextField(JTextField iMDbRatingTextField) {
        this.iMDbRatingTextField = iMDbRatingTextField;
    }

    public JTextField getDisplayMovieTextField() {
        return displayMovieTextField;
    }

    public void setDisplayMovieTextField(JTextField displayMovieTextField) {
        this.displayMovieTextField = displayMovieTextField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

}

class Running implements Runnable {
    private FilmList films;
    private JList listOfMovies;
    @Override
    public void run() {




        int index = 10;
        boolean switcher = false;
        for (int i = 0; i < index; i++){
            int test = 0;
            while(test != 30000){
                switcher=!switcher;
                test++;
            }
        }
    }

    void setVariables(FilmList filmList, JList list)
    {
        this.films = filmList;
        this.listOfMovies = list;
    }
}
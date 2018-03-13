import javax.swing.*;

public class Comedy {
    private JPanel mainPanel;
    private JList listOfMovies;
    private JButton chooseButton;
    private JTextField displayMovieTextField;
    private JTextField nameTextField;
    private JTextField yearTextField;
    private JTextField iMDbRatingTextField;
    private JLabel iMDbRating;
    private String name;
    private String year;
    private String imdbRating;
    private JFrame frame;

    public Comedy() {

        frame = new JFrame("Movies/TV Shows");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
    }
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
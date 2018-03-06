import javax.swing.*;

/**
 * Created by u1764905 on 06/03/2018.
 */
public class Film {
    private String title;
    private String imagePath;
    private String imdbRating;
    private String year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Film(String title, String imagePath, String imdbRating, String year) {
        this.title = title;
        this.imagePath = imagePath;
        this.imdbRating = imdbRating;
        this.year = year;
    }
}

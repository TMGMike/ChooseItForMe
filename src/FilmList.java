import javax.swing.*;

/**
 * Created by u1764905 on 06/03/2018.
 */
public class FilmList extends DefaultListModel<Film> {
    public FilmList() {
        super();
    }

    public void addFilm(String title, String imagePath, String imdbRating, String year){
        super.addElement(new Film(title, imagePath, imdbRating, year));
    }
    public void addFilm(Film film){
        super.addElement(new Film(film.getTitle(), film.getImagePath(), film.getImdbRating(), film.getYear()));
    }
    public Film getFilmByTitle(String title){
        Film film;
        int index = -1;

        for(int i = 0; i < super.size();){
            film = (Film) super.elementAt(i);
            if(film.getTitle().equals(title)){
                index = i;
                break;
            }
            i++;
        }
        if(index == -1){
            return null;
        }
        else {
            return (Film)super.elementAt(index);
        }
    }

    public FilmList getFilmsByYear(String year){
        FilmList films = new FilmList();

        for(int i = 0; i < super.size();){
            Film film = (Film) super.elementAt(i);
            if(film.getYear().equals(year)){
                films.addFilm(film);
            }
            i++;
        }
        return films;
    }

}

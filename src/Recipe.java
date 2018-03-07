/**
 * Created by u1764905 on 07/03/2018.
 */
public class Recipe {
    private String recipeName;
    private int calories;
    private String difficulty;
    private String imagePath;
    private String url;
    private String country;

    public Recipe(String recipeName, int calories, String difficulty, String imagePath, String url, String country) {
        this.recipeName = recipeName;
        this.calories = calories;
        this.difficulty = difficulty;
        this.imagePath = imagePath;
        this.url = url;
        this.country = country;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

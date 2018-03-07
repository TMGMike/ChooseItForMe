import javax.swing.*;

/**
 * Created by u1764905 on 07/03/2018.
 */
public class RecipeList extends DefaultListModel<Recipe> {
    public RecipeList() {
        super();
    }
    public void addRecipe(Recipe recipe) {
        super.addElement(recipe);
    }

    public void addRecipe(String recipeName, int calories, String difficulty, String imagePath, String url, String country){
        super.addElement(new Recipe(recipeName, calories, difficulty, imagePath, url, country));
    }

    public Recipe getRecipe(String name){
        Recipe recipe;
        int index = -1;

        for(int i = 0; i < super.size();){
            recipe = (Recipe) super.elementAt(i);
            if(recipe.getRecipeName().equals(name)){
                index = i;
                break;
            }
            i++;
        }
        if(index == -1){
            return null;
        }
        else {
            return (Recipe)super.elementAt(index);
        }
    }

    public RecipeList getRecipesByCalories(int calories) {
        RecipeList recipes = new RecipeList();

        for(int i = 0; i < super.size();){
            Recipe recipe = (Recipe) super.elementAt(i);
            if(recipe.getCalories() == calories){
                recipes.addRecipe(recipe);
            }
            i++;
        }
        return recipes;
    }
    public RecipeList getRecipesByCalories(int min, int max){
        int index = min;
        RecipeList recipes = new RecipeList();

        while (index <= max){
            for(int i = 0; i < super.size();){
                Recipe recipe = (Recipe) super.elementAt(i);
                if(recipe.getCalories() == index){
                    recipes.addRecipe(recipe);
                }
                i++;
            }
            index++;
        }
        return recipes;
    }
    public Recipe getRecipesByCountry(String country){
        Recipe recipe;
        int index = -1;

        for(int i = 0; i < super.size();){
            recipe = (Recipe) super.elementAt(i);
            if(recipe.getCountry().equals(country)){
                index = i;
                break;
            }
            i++;
        }
        if(index == -1){
            return null;
        }
        else {
            return (Recipe)super.elementAt(index);
        }
    }

    public RecipeList getRecipesByDifficulty(String difficulty) {
        RecipeList recipes = new RecipeList();

        for(int i = 0; i < super.size();){
            Recipe recipe = (Recipe) super.elementAt(i);
            if(recipe.getDifficulty().equals(difficulty)){
                recipes.addRecipe(recipe);
            }
            i++;
        }
        return recipes;
    }
}

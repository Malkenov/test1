import java.util.LinkedHashSet;

public class PotionIngredientsRegistry {

    public LinkedHashSet<MagicIngredient> ingredients = new LinkedHashSet<>();

    public void addIngredient(MagicIngredient ingredient){
       ingredients.add(new MagicIngredient(ingredient.getName(),ingredient.getQuantity()));
    }

    public void	removeIngredient(MagicIngredient name){
        ingredients.remove(name);
    }

    public void listAllIngredients(){
        System.out.println(ingredients);
    }


    @Override
    public String toString() {
        return "PotionIngredientsRegistry{" +
                "ingredients=" + ingredients +
                '}';
    }
}

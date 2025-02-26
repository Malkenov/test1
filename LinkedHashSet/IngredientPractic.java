public class IngredientPractic {
    public static void main(String[] args) {
        PotionIngredientsRegistry potionIngredientsRegistry = new PotionIngredientsRegistry();
        MagicIngredient lilyPetal1 = new MagicIngredient("Лепесток лилии", 5);
        MagicIngredient lilyPetal2 = new MagicIngredient("Корень мандрагоры", 10);
        MagicIngredient lilyPetal3 = new MagicIngredient("Лепесток лилии", 5);
        MagicIngredient lilyPetal4 = new MagicIngredient("Корень солодки", 15);

        potionIngredientsRegistry.addIngredient(lilyPetal1);
        potionIngredientsRegistry.addIngredient(lilyPetal2);
        potionIngredientsRegistry.addIngredient(lilyPetal3);
        potionIngredientsRegistry.addIngredient(lilyPetal4);
        System.out.println(potionIngredientsRegistry);


        potionIngredientsRegistry.removeIngredient(lilyPetal4);
        System.out.println(potionIngredientsRegistry);

        potionIngredientsRegistry.listAllIngredients();

    }
}

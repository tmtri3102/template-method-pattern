public class HamburgerMeal extends Meal {

    @Override
    public void prepareIngredients() {
        System.out.println("Getting ingredients");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burger");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleaning up");
    }
}

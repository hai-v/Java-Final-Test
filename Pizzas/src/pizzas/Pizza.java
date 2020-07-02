package pizzas;

import java.util.Arrays;

public class Pizza {

    private String size;
    private String style;
    private String[] ingredients;

    public Pizza(String size, String style, String[] ingredients) {
        this.size = size;
        this.style = style;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return size + " " + style + " " + Arrays.toString(ingredients);
    }

    public String getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }

    public String[] getIngredients() {
        return ingredients;
    }

} // end class

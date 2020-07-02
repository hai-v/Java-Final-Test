package pizzas;

public class PriceInfo {

    private String size;
    private double basePrice;
    private double ingredientPrice;

    public PriceInfo(String size, double basePrice, double ingredientPrice) {
        this.size = size;
        this.basePrice = basePrice;
        this.ingredientPrice = ingredientPrice;
    }

    public String getSize() {
        return size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getIngredientPrice() {
        return ingredientPrice;
    }
    
    
} // end class 

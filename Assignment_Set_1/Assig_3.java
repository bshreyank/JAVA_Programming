package Assignment_Set_1;

public class Assig_3 {
    
    private String fruitName;
    private int fruitPrice;
    private double quantity;
    
    public Assig_3() {
        // Default constructor
    }
    
    public Assig_3(String fruitName, int fruitPrice, double quantity) {
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
        this.quantity = quantity;
    }
    
    public String getFruitName() {
        return fruitName;
    }
    
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    
    public int getFruitPrice() {
        return fruitPrice;
    }
    
    public void setFruitPrice(int fruitPrice) {
        this.fruitPrice = fruitPrice;
    }
    
    public double getQuantity() {
        return quantity;
    }
    
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}


public class Product {

    Long id;
    String productName;
    Float price;
    Float weight;
    String color;
    Integer productCount;

    public Product(Long id, String productName, Float price, Float weight, String color, Integer productCount){
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }
}


public class Cloth extends Product {
    String size;
    String material;

    public Cloth(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, String material){
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }
}

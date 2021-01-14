
public class Boots extends Product {

    private String size;
    private Boolean isNaturalSkin;

    public Boots(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, Boolean isNaturalSkin){
        super(id, productName,price,weight, color,productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public Integer getSize(){
        return size;
    }

    public Boolean getIsNaturalSkin(){
        return isNaturalSkin;
    }
}

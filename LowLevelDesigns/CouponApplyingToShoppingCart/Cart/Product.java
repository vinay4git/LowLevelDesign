package LowLevelDesigns.CouponApplyingToShoppingCart.Cart;

public abstract class Product {

    String name;
    ProductType productType;
    Integer price;
    public abstract int getPrice();

    public Product(){}
    public Product(String name, ProductType productType, Integer price) {
        this.name = name;
        this.productType = productType;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}


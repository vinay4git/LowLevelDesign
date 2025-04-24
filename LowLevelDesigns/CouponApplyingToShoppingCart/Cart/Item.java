package LowLevelDesigns.CouponApplyingToShoppingCart.Cart;

public class Item extends Product {


    public Item(String name, ProductType productType, Integer price) {
        super(name, productType, price);
    }

    public int getPrice() {
        return price;
    }

}

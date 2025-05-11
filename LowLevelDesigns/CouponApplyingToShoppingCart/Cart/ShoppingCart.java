package LowLevelDesigns.CouponApplyingToShoppingCart.Cart;

import LowLevelDesigns.CouponApplyingToShoppingCart.Coupoun.NPercentOffCoupon;
import LowLevelDesigns.CouponApplyingToShoppingCart.Coupoun.ProductTypePercentage;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addToCart(Product item) {
        items.add(item);
    }

    public int netAmount() {
        int netPrice = 0;
        for(Product p : items) {
            netPrice += new ProductTypePercentage(new NPercentOffCoupon(p, 10), 10, ProductType.ELECTRONIC).getPrice();
        }
        return netPrice;
    }
}

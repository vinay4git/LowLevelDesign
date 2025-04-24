package LowLevelDesigns.CouponApplyingToShoppingCart.Coupoun;

import LowLevelDesigns.CouponApplyingToShoppingCart.Cart.Product;

public abstract class Coupon extends Product {
    Product product;
    public Coupon( Product product) {
        super();
        this.product = product;
    }

}

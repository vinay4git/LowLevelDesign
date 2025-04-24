package LowLevelDesigns.CouponApplyingToShoppingCart.Coupoun;

import LowLevelDesigns.CouponApplyingToShoppingCart.Cart.Product;
import LowLevelDesigns.CouponApplyingToShoppingCart.Cart.ProductType;

public class NPercentOffCoupon extends Coupon {

    private final int discountPercentage;

    public NPercentOffCoupon(Product product, int discountPercentage) {
        super(product);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int getPrice() {
        int price = product.getPrice();
        return price - (price * discountPercentage / 100);
    }
}

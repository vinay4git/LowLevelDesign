package LowLevelDesigns.CouponApplyingToShoppingCart;

import LowLevelDesigns.CouponApplyingToShoppingCart.Cart.Item;
import LowLevelDesigns.CouponApplyingToShoppingCart.Cart.ProductType;
import LowLevelDesigns.CouponApplyingToShoppingCart.Cart.ShoppingCart;

public class CouponMain {
    /**
     *  Requirement:
     * Given Shoppingcart with products and coupons and calculate the net price after applying the coupons on products.
     * Coupouns can be of different types with certain conditions.
     * 1. N% off that is 10% off for all the individual
     * 2. Product% off on next item
     * 3. D% off on Nth item of Type T.
     * Sequentially wants to apply all the coupouns on the cart and get the Total Amount.
     */
    public static void main(String[] args) {
        Item samsung = new Item("samsung", ProductType.ELECTRONIC, 100);
        Item apple = new Item("Apple", ProductType.GROCERY, 10);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(samsung);
        shoppingCart.addToCart(apple);

        System.out.println(shoppingCart.netAmount());
    }
}

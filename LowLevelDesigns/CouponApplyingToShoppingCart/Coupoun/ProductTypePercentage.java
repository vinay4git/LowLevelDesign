package LowLevelDesigns.CouponApplyingToShoppingCart.Coupoun;

import LowLevelDesigns.CouponApplyingToShoppingCart.Cart.Product;
import LowLevelDesigns.CouponApplyingToShoppingCart.Cart.ProductType;

import java.util.ArrayList;
import java.util.List;

public class ProductTypePercentage extends Coupon{

    private int typePercentage;
    private ProductType productType;

    static List<ProductType> discountAllowedType = new ArrayList<>();

    static {
        discountAllowedType.add(ProductType.ELECTRONIC);
        discountAllowedType.add(ProductType.CLOTHING);
    }

    public ProductTypePercentage(Product product, int typePercentage, ProductType productType) {
        super(product);
        this.typePercentage = typePercentage;
        this.productType = productType;
    }

    @Override
    public int getPrice() {
        int price = product.getPrice();

        if (discountAllowedType.contains(productType)) {
            return price - (price * typePercentage / 100);
        }

        return price;
    }
}

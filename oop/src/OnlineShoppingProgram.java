import java.util.Map;

public class OnlineShoppingProgram {
    public static void main(String[] args) {
        // ... (Önceki örnek kod)

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1, 2);
        cart.addItem(product2, 1);

        Review productReview = new Review(2001, product1, user, "Harika ürün!", 5);

        Category category = new Category(601, "Elektronik");

        CustomerService customerService = new CustomerService(701, "Müşteri Hizmetleri");

        // ... (Önceki örnek kod devam eder)
    }

    private static void userAdditionalInfo(User user, Coupon coupon, MainPage mainPage,
                                           DiscountManagement discountManagement, Shipment shipment, Seller seller,
                                           ShoppingCart cart, Review productReview, Category category,
                                           CustomerService customerService) {
        // ... (Önceki örnek kod)

        System.out.println("Alışveriş Sepeti:");
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            System.out.println("  - " + entry.getKey().getProductName() + " | Adet: " + entry.getValue());
        }

        System.out.println("Ürün Değerlendirmesi: " + productReview.getComment() + " | Puan: " + productReview.getRating());
        System.out.println("Ürün Kategorisi: " + category.getCategoryName());
        System.out.println("Müşteri Hizmetleri: " + customerService.getServiceName());
    }
}

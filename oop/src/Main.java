import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Product sınıfı ürünleri temsil eder.
class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Getter ve Setter metotları

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// User sınıfı kullanıcıları temsil eder.
class User {
    private int userId;
    private String username;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    // Getter ve Setter metotları

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}

// Order sınıfı siparişleri temsil eder.
class Order {
    private int orderId;
    private User user;
    private List<Product> products;

    public Order(int orderId, User user) {
        this.orderId = orderId;
        this.user = user;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    // Getter metotları

    public int getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Feedback sınıfı kullanıcı geri bildirimlerini temsil eder.
class Feedback {
    private int feedbackId;
    private User user;
    private String comment;

    public Feedback(int feedbackId, User user, String comment) {
        this.feedbackId = feedbackId;
        this.user = user;
        this.comment = comment;
    }

    // Getter metotları

    public int getFeedbackId() {
        return feedbackId;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }
}

// PaymentMethods sınıfı ödeme yöntemlerini temsil eder.
class PaymentMethods {
    private int paymentId;
    private String paymentType;

    public PaymentMethods(int paymentId, String paymentType) {
        this.paymentId = paymentId;
        this.paymentType = paymentType;
    }

    // Getter metotları

    public int getPaymentId() {
        return paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }
}

// Coupon sınıfı indirim kuponlarını temsil eder.
class Coupon {
    private int couponId;
    private String couponCode;
    private double discountAmount;

    public Coupon(int couponId, String couponCode, double discountAmount) {
        this.couponId = couponId;
        this.couponCode = couponCode;
        this.discountAmount = discountAmount;
    }

    // Getter metotları

    public int getCouponId() {
        return couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}

// MainPage sınıfı ana sayfayı temsil eder.
class MainPage {
    // Ana sayfa ile ilgili özellikler ve metotlar eklenebilir.
}

// DiscountManagement sınıfı indirim yönetimini temsil eder.
class DiscountManagement {
    // İndirim yönetimi ile ilgili özellikler ve metotlar eklenebilir.
}

// Shipment sınıfı kargo işlemlerini temsil eder.
class Shipment {
    private int shipmentId;
    private String shipmentType;
    private double shipmentCost;

    public Shipment(int shipmentId, String shipmentType, double shipmentCost) {
        this.shipmentId = shipmentId;
        this.shipmentType = shipmentType;
        this.shipmentCost = shipmentCost;
    }

    // Getter metotları

    public int getShipmentId() {
        return shipmentId;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public double getShipmentCost() {
        return shipmentCost;
    }
}

// Seller sınıfı satıcıları temsil eder.
class Seller {
    private int sellerId;
    private String sellerName;

    public Seller(int sellerId, String sellerName) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
    }

    // Getter metotları

    public int getSellerId() {
        return sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }
}

// ShoppingCart sınıfı alışveriş sepetini temsil eder.
class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addItem(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }
}

// Review sınıfı ürün değerlendirmelerini temsil eder.
class Review {
    private int reviewId;
    private Product product;
    private User user;
    private String comment;
    private int rating;

    public Review(int reviewId, Product product, User user, String comment, int rating) {
        this.reviewId = reviewId;
        this.product = product;
        this.user = user;
        this.comment = comment;
        this.rating = rating;
    }

    // Getter metotları

    public int getReviewId() {
        return reviewId;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public int getRating() {
        return rating;
    }
}

// Category sınıfı ürün kategorilerini temsil eder.
class Category {
    private int categoryId;
    private String categoryName;

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    // Getter metotları

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

// CustomerService sınıfı müşteri hizmetlerini temsil eder.
class CustomerService {
    private int serviceId;
    private String serviceName;

    public CustomerService(int serviceId, String serviceName) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    // Getter metotları

    public int getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }
}

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

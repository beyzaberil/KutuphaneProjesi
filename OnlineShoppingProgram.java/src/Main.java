import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

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

class User {
    private int userId;
    private String username;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}

class OnlineShoppingProgram {
    public static void main(String[] args) {
        // Ürünleri tanımlayın
        Product product1 = new Product(1, "Ürün1", 29.99);
        Product product2 = new Product(2, "Ürün2", 39.99);

        // Diğer sınıfları ve nesneleri tanımlayın
        User user = new User(1, "Kullanıcı1");

        // Alışveriş sepetini oluşturun
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1, 2);
        cart.addItem(product2, 1);

        // İncelemeyi oluşturun
        Review productReview = new Review(2001, product1, user, "Harika ürün!", 5);

        // Kategoriyi oluşturun
        Category category = new Category(601, "Elektronik");

        // Müşteri hizmetlerini oluşturun
        CustomerService customerService = new CustomerService(701, "Müşteri Hizmetleri");

        // Daha fazla işlemleri gerçekleştirin
        // ...

        // Kullanıcı ek bilgilerini yazdır
        userAdditionalInfo(user, null, null, null, null, null, null, productReview, category, customerService);
    }

    private static void userAdditionalInfo(User user, Coupon coupon, MainPage mainPage,
                                           DiscountManagement discountManagement, Shipment shipment, Seller seller,
                                           ShoppingCart cart, Review productReview, Category category,
                                           CustomerService customerService) {
        System.out.println("Alışveriş Sepeti:");
        for (Map.Entry<Product, Integer> entry : cart.getItems().entrySet()) {
            System.out.println("  - " + entry.getKey().getProductName() + " | Adet: " + entry.getValue());
        }

        System.out.println("Ürün Değerlendirmesi: " + productReview.getComment() + " | Puan: " + productReview.getRating());
        System.out.println("Ürün Kategorisi: " + category.getCategoryName());
        System.out.println("Müşteri Hizmetleri: " + customerService.getServiceName());
    }
}

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

class Category {
    private int categoryId;
    private String categoryName;

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

class CustomerService {
    private int serviceId;
    private String serviceName;

    public CustomerService(int serviceId, String serviceName) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }
}

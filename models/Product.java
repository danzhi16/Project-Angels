package models;

public class Product {
    private int id;
    private String name;
    private String description;
    private int categoryId;
    private double price;

    public Product() {
    }

    public Product(String name, String description, int categoryId, double price) {
        setName(name);
        setDescription(description);
        setCategoryId(categoryId);
        setPrice(price);
    }

    public Product(int id, String name, String description, int categoryId, double price) {
        this(name, description, categoryId, price);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", price=" + price +
                '}';
    }
}

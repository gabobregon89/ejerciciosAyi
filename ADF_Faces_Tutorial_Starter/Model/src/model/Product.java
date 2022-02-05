package model;

public class Product {
    private Integer id;
    private String name;
    private String shortDesc;
    private float cost;
    private Integer categoryId;
    private Integer rating;
    private String imageLocation;

    public Product() {
    }
    
    public Product(Integer id, String name, String shortDesc, float cost, Integer categoryId, Integer rating,
                   String imageLocation) {
        this.id = id;
        this.name = name;
        this.shortDesc = shortDesc;
        this.cost = cost;
        this.categoryId = categoryId;
        this.rating = rating;
        this.imageLocation = imageLocation;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
   
}

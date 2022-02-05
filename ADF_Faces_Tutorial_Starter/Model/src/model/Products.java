package model;

import java.util.ArrayList;
import java.util.Collection;

import oracle.binding.AttributeContext;
import oracle.binding.RowContext;

public class Products {

    Collection<Product> products = new ArrayList<Product>();


    public Products() {
        //Some Products to start our store.
        Product a = new Product();
        a = new Product(10011, "Bunny Boot", "Beginners ski boot", 175, 2, 4, "bunboot.jpg");
        products.add(a);
        a = new Product(10012, "Ace Ski Boot", "Intermediate ski boot", 229, 2, 2, "aceboot.jpg");
        products.add(a);
        a = new Product(10013, "Pro Ski Boot", "Advanced ski boot", 349, 2, 5, "proboot.jpg");
        products.add(a);
        a = new Product(10021, "Bunny Ski Pole", "Beginner's ski pole", 55, 3, 5, "bunpole.jpg");
        products.add(a);
        a = new Product(10022, "Ace Ski Pole", "Intermediate ski pole", 98, 3, 3, "acepole.jpg");
        products.add(a);
        a = new Product(10023, "Pro Ski Pole", "Advanced ski pole", 245, 3, 4, "propole.jpg");
        products.add(a);
        a = new Product(20106, "Junior Soccer Ball", "Junior soccer ball", 25, 4, 3, "jrsoccerball.jpg");
        products.add(a);
        a = new Product(20108, "World Cup Soccer Ball", "World cup soccer ball", 65, 4, 5, "worldcupsoccerball.jpg");
        products.add(a);
        a = new Product(20201, "World Cup Net", "World cup net", 325, 6, 3, "soccernet.jpg");
        products.add(a);
        a = new Product(20510, "Black Hawk Knee Pads", "Knee pads, pair", 42, 8, 4, "kneepads.jpg");
        products.add(a);
        a = new Product(20512, "Black Hawk Elbow Pads", "Elbow pads, pair", 22, 8, 1, "elbowpads.jpg");
        products.add(a);
        a = new Product(30321, "Grand Prix Bicycle", "Road bicycle", 628, 9, 4, "gpbike.jpg");
        products.add(a);
        a = new Product(30326, "Himalaya Bicycle", "Mountain bicycle", 833, 9, 5, "himbike.jpg");
        products.add(a);
    }

    public void addProduct(Integer id, String name, String shortDesc, float cost, Integer categoryId, Integer rating,
                           String imageLocation) {

        Product a = new Product(id, name, shortDesc, cost, categoryId, rating, imageLocation);
        this.products.add(a);
    }

    public void setProducts(Collection<Product> newproducts) {
        this.products = newproducts;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public boolean isTransactionDirty() {
        return false;
    }

    public void rollbackTransaction() {
    }

    public void commitTransaction() {
    }

    public boolean setAttributeValue(AttributeContext p0, Object p1) {
        return false;
    }

    public Object createRowData(RowContext p0) {
        return null;
    }

    public Object registerDataProvider(RowContext p0) {
        return null;
    }

    public boolean removeRowData(RowContext p0) {
        return false;
    }

    public void validate() {
    }
}

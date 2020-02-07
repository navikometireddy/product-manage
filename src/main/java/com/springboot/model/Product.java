package com.springboot.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Integer productID;
    @Column(name = "url")
    private String url;
    @Column(name = "title")
    private String title;
    @Column(name = "image")
    private String image;
    @Column(name = "category_id")
    private Integer categoryID;
    @Column(name = "price")
    private Integer price;
    @Column(name = "mrcp")
    private String mrsp;
    @Column(name = "available")
    private String available;
    @Column(name = "merchant_id")
    private Integer merchantID;
    @Column(name = "description")
    private String description;
    @Column(nullable = false)


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="merchant_id")
    private List<Merchant> merchantList;



    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private List<Category> categoryList;



    public List<Merchant> getMerchantList() {
        return merchantList;
    }

    public void setMerchantList(List<Merchant> merchantList) {
        this.merchantList = merchantList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getMrsp() {
        return mrsp;
    }

    public void setMrsp(String mrsp) {
        this.mrsp = mrsp;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Integer getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", categoryID=" + categoryID +
                ", price=" + price +
                ", mrsp='" + mrsp + '\'' +
                ", available='" + available + '\'' +
                ", merchantID=" + merchantID +
                ", description='" + description + '\'' +
                '}';
    }
}

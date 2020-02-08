package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "url")
    private String url;
    @Column(name = "title")
    private String title;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private Integer price;
    @Column(name = "mrcp")
    private String mrsp;
    @Column(name = "available")
    private String available;
    @Column(name = "description")
    private String description;

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    @JsonIgnoreProperties(value = {"productSet"})
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchant merchant;

    @JsonIgnoreProperties(value = {"productSet"})
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", mrsp='" + mrsp + '\'' +
                ", available='" + available + '\'' +
                ", description='" + description + '\'' +
                ", merchant=" + merchant +
                ", category=" + category +
                '}';
    }
}

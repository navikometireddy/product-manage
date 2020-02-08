package com.springboot.model;

import javax.persistence.*;

@Entity
@Table(name = "subcategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(name="sub_category_name")
    private String subCategoryName;


    @OneToOne(mappedBy = "subCategory")
    private Category category;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;


public class Product {
    private int pid;
    private String pname;
    private int quantity;
    private double price;
    private String image;
    private String description;
    private boolean status;
    private String cateId;
    private Category1 category;
    private Provider provider;
    private int categoryId;
    private String categoryName;

    
    public Product() {
    }

    public Product(int pid, String pname, int quantity, double price, String image, String description, boolean status, String cateId) {
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
        this.description = description;
        this.status = status;
        this.cateId = cateId;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Category1 getCategory() {
        return category;
    }

    public void setCategory(Category1 category) {
        this.category = category;
    }
    public Product(int pid, String pname, int quantity, double price, String image, String description, boolean status, String cateId, int categoryId, String categoryName) {
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
        this.description = description;
        this.status = status;
        this.cateId = cateId;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    



    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

  
}

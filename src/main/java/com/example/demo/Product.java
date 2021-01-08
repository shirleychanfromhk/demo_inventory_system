package com.example.demo;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="PRODUCTS")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Integer id;

    @Column(name="product_id", nullable = false)
    private String productId;
    
    @Column(name="product_name", nullable = false)
    private String productName;
    
    @Column(name="weight", nullable = false)
    private int weight;
    
    @Column(name="location", nullable = false)
    private String location;
    
    @Column(name="price", nullable = false)
    private BigDecimal price;
    
    @Column(name="quantity", nullable = false)
    private int quantity;

    public Product() {
    	
    }
    
    public Product(String productId, String productName, BigDecimal price, int quantity, int weight, String location) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.weight = weight;
		this.location = location;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
    
}
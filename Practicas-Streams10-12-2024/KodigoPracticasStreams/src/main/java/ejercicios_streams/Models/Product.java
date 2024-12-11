package ejercicios_streams.Models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private int productID;
    private String productName;
    private String category;
    private BigDecimal unitPrice;
    private int unitsInStock;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    @Override
    public String toString() {
        return String.format("ProductID=%d ProductName=%s Category=%s UnitPrice=%.2f UnitsInStock=%d",
                productID, productName, category, unitPrice, unitsInStock);
    }
}


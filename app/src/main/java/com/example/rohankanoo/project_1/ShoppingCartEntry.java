package com.example.rohankanoo.project_1;

/**
 * Created by Rohan Kanoo on 12-03-2017.
 */
public class ShoppingCartEntry {

    private Product mProduct;
    private int mQuantity;

    public ShoppingCartEntry(Product product, int quantity) {
        mProduct = product;
        mQuantity = quantity;
    }

    public Product getProduct() {

        return mProduct;
    }

    public int getQuantity() {
        return mQuantity;
    }

    public void setQuantity(int quantity) {

        mQuantity = quantity;
    }
}

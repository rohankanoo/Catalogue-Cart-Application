package com.example.rohankanoo.project_1;

import android.graphics.drawable.Drawable;

/**
 * Created by Rohan Kanoo on 12-03-2017.
 */
public class Product {

    public String title;
    public Drawable productImage;
    public String description;
    public double price;
    public boolean selected;

    public Product(String title, Drawable productImage, String description,
                   double price) {
        this.title = title;
        this.productImage = productImage;
        this.description = description;
        this.price = price;
    }
}

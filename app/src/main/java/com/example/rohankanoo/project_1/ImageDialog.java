package com.example.rohankanoo.project_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Rohan Kanoo on 15-03-2017.
 */
public class ImageDialog extends Activity {

    private ImageView mDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_dialog_layout);

        mDialog = (ImageView)findViewById(R.id.your_image);
        mDialog.setClickable(true);

        if(getIntent().hasExtra("POSITION_FAUCETS")) {
            List<Product> catalogFaucets = ShoppingCartHelper.getCatalogFaucets(getResources());
            final int productIndex = getIntent().getExtras().getInt("POSITION_FAUCETS");
            final Product selectedProduct = catalogFaucets.get(productIndex);
            mDialog.setImageDrawable(selectedProduct.productImage);
        }
        else if(getIntent().hasExtra("POSITION_SINK")) {
            List<Product> catalogSink = ShoppingCartHelper.getCatalogSink(getResources());
            final int productIndex = getIntent().getExtras().getInt("POSITION_SINK");
            final Product selectedProduct = catalogSink.get(productIndex);
            mDialog.setImageDrawable(selectedProduct.productImage);
        }
        else if(getIntent().hasExtra("POSITION_BATH")) {
            List<Product> catalogBath = ShoppingCartHelper.getCatalogBath(getResources());
            final int productIndex = getIntent().getExtras().getInt("POSITION_BATH");
            final Product selectedProduct = catalogBath.get(productIndex);
            mDialog.setImageDrawable(selectedProduct.productImage);
        }
        else if(getIntent().hasExtra("POSITION_CISTERN")) {
            List<Product> catalogCistern = ShoppingCartHelper.getCatalogCistern(getResources());
            final int productIndex = getIntent().getExtras().getInt("POSITION_CISTERN");
            final Product selectedProduct = catalogCistern.get(productIndex);
            mDialog.setImageDrawable(selectedProduct.productImage);
        }
        else if(getIntent().hasExtra("POSITION_PTMT")) {
            List<Product> catalogPTMT = ShoppingCartHelper.getCatalogPtmt(getResources());
            final int productIndex = getIntent().getExtras().getInt("POSITION_PTMT");
            final Product selectedProduct = catalogPTMT.get(productIndex);
            mDialog.setImageDrawable(selectedProduct.productImage);
        }
        else if(getIntent().hasExtra("POSITION_SHOWERS")) {
            List<Product> catalogShowers = ShoppingCartHelper.getCatalogShowers(getResources());
            final int productIndex = getIntent().getExtras().getInt("POSITION_SHOWERS");
            final Product selectedProduct = catalogShowers.get(productIndex);
            mDialog.setImageDrawable(selectedProduct.productImage);
        }




        //finish the activity (dismiss the image dialog) if the user clicks
        //anywhere on the image
        mDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
package com.example.rohankanoo.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Rohan Kanoo on 12-03-2017.
 */
public class ShoppingCartActivity extends AppCompatActivity {

    private List<Product> mCartList;
    private ProductAdapter mProductAdapter;
    public String finalProductList = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppingcart);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.statusBarColor));
        }

        mCartList = ShoppingCartHelper.getCartList();

        // Make sure to clear the selections
        for(int i=0; i<mCartList.size(); i++) {
            mCartList.get(i).selected = false;
        }

        // Create the list
        final ListView listViewCatalog = (ListView) findViewById(R.id.ListViewCatalog);
        mProductAdapter = new ProductAdapter(mCartList, getLayoutInflater(), true);
        listViewCatalog.setAdapter(mProductAdapter);

        listViewCatalog.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Product selectedProduct = mCartList.get(position);
                if(selectedProduct.selected == true)
                    selectedProduct.selected = false;
                else
                    selectedProduct.selected = true;

                mProductAdapter.notifyDataSetInvalidated();

            }
        });

        Button removeButton = (Button) findViewById(R.id.ButtonRemoveFromCart);
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=mCartList.size()-1; i>=0; i--) {

                    if(mCartList.get(i).selected) {
                        ShoppingCartHelper.removeProduct(mCartList.get(i));
                        mCartList.remove(i);
                        mProductAdapter.notifyDataSetChanged();
                    }
                    mProductAdapter.notifyDataSetChanged();
                }
                //mProductAdapter.notifyDataSetChanged();
            }
        });

        Button proceedButton = (Button) findViewById(R.id.buttonProceed);
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalProductList = "";
                final List<Product> cart = ShoppingCartHelper.getCartList();
                if(cart.size() == 0){
                    Toast.makeText(ShoppingCartActivity.this, "Cart is Empty", Toast.LENGTH_LONG).show();
                }

                else {
                    for(int i=0; i<cart.size(); i++){
                        final Product selectedProduct = cart.get(i);
                        finalProductList = finalProductList + selectedProduct.title + " - " + ShoppingCartHelper.getProductQuantity(selectedProduct);
                        finalProductList = finalProductList + "\n\n";
                    }
                    //Toast.makeText(ShoppingCartActivity.this, finalProductList, Toast.LENGTH_LONG).show();
                    Intent checkout = new Intent(getBaseContext(), CheckoutActivity.class);
                    checkout.putExtra("Product", finalProductList);
                    startActivity(checkout);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.check_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        String title = item.getTitle().toString();

        //noinspection SimplifiableIfStatement
        if (title.equals("Select All")) {
            for(int i=mCartList.size()-1; i>=0; i--) {

                Product selectedProduct = mCartList.get(i);
                selectedProduct.selected = true;

                mProductAdapter.notifyDataSetInvalidated();
                //mProductAdapter.notifyDataSetChanged();
            }
            item.setTitle("Clear All");
        }

        else {
            for(int i=mCartList.size()-1; i>=0; i--) {

                Product selectedProduct = mCartList.get(i);
                selectedProduct.selected = false;

                mProductAdapter.notifyDataSetInvalidated();
                //mProductAdapter.notifyDataSetChanged();
            }
            item.setTitle("Select All");
        }

        return super.onOptionsItemSelected(item);
    }
}

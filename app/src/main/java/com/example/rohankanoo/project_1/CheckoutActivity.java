package com.example.rohankanoo.project_1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Rohan Kanoo on 15-03-2017.
 */
public class CheckoutActivity extends AppCompatActivity {

    public EditText name;
    public EditText phone;
    public EditText firm;
    public String customerName;
    public String customerPhone;
    public String customerFirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.statusBarColor));
        }

        final String finalProductList = getIntent().getExtras().getString("Product");

        TextView product = (TextView) findViewById(R.id.cartItem);
        product.setText(finalProductList);

        Button mailTo = (Button) findViewById(R.id.sendMail);
        mailTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = (EditText) findViewById(R.id.name);
                customerName = name.getText().toString();

                phone = (EditText) findViewById(R.id.phone);
                customerPhone = phone.getText().toString();

                firm = (EditText) findViewById(R.id.firm);
                customerFirm = firm.getText().toString();

                if(customerName.length() == 0 || customerPhone.length() == 0 || customerFirm.length() == 0){
                    Toast.makeText(CheckoutActivity.this, "Fill in all the detail(s)", Toast.LENGTH_LONG).show();
                }

                else {
                    Intent intentMail = new Intent(Intent.ACTION_SENDTO);
                    intentMail.setData(Uri.parse("mailto:navnirmansjth@gmail.com")); // only email apps should handle this
                    intentMail.putExtra(Intent.EXTRA_SUBJECT, customerName+"\n"+customerFirm+"\n"+customerPhone);
                    intentMail.putExtra (Intent.EXTRA_TEXT, finalProductList);
                    startActivity(intentMail);
                }
            }
        });

        Button messageTo = (Button) findViewById(R.id.sendMessage);
        messageTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = (EditText) findViewById(R.id.name);
                customerName = name.getText().toString();

                phone = (EditText) findViewById(R.id.phone);
                customerPhone = phone.getText().toString();

                firm = (EditText) findViewById(R.id.firm);
                customerFirm = firm.getText().toString();

                if(customerName.length() == 0 || customerPhone.length() == 0 || customerFirm.length() == 0){
                    Toast.makeText(CheckoutActivity.this, "Fill in all the detail(s)", Toast.LENGTH_LONG).show();
                }

                else {
                    Uri uri = Uri.parse("smsto:+917376747707");
                    Intent intentMessage = new Intent(Intent.ACTION_SENDTO, uri);
                    intentMessage.putExtra("sms_body", finalProductList+"\nRegards-\n"+customerName+"\n"+customerFirm+"\n"+customerPhone);
                    startActivity(intentMessage);
                }
            }
        });

        Button socialTo = (Button) findViewById(R.id.sendSocial);
        socialTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = (EditText) findViewById(R.id.name);
                customerName = name.getText().toString();

                phone = (EditText) findViewById(R.id.phone);
                customerPhone = phone.getText().toString();

                firm = (EditText) findViewById(R.id.firm);
                customerFirm = firm.getText().toString();

                if(customerName.length() == 0 || customerPhone.length() == 0 || customerFirm.length() == 0) {
                    Toast.makeText(CheckoutActivity.this, "Fill in all the detail(s)", Toast.LENGTH_LONG).show();
                }

                else {
                    Intent intentSocial = new Intent();
                    intentSocial.setAction(Intent.ACTION_SEND);
                    intentSocial.putExtra(Intent.EXTRA_TEXT, finalProductList+"\nRegards-\n"+customerName+"\n"+customerFirm+"\n"+customerPhone);
                    intentSocial.setType("text/plain");
                    startActivity(intentSocial);
                }
            }
        });

    }
}

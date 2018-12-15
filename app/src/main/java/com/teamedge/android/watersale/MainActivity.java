package com.teamedge.android.watersale;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
    Spinner temperatureSpinner;
    Spinner saltSpinner;
    Spinner containerSpinner;
    int quantity = 1;
    int price = 1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

                    //temperature
        setContentView(R.layout.activity_main);
        temperatureSpinner = (Spinner) findViewById(R.id.temperature);

        ArrayAdapter<CharSequence> temperatureAdapter = ArrayAdapter.createFromResource(this,
                R.array.temperature_array, android.R.layout.simple_spinner_item);

        temperatureSpinner.setAdapter(temperatureAdapter);

                        //salt

        saltSpinner = (Spinner) findViewById(R.id.salt);

        ArrayAdapter<CharSequence> saltAdapter  = ArrayAdapter.createFromResource(this,
                R.array.salt_array, android.R.layout.simple_spinner_item);

        saltSpinner.setAdapter(saltAdapter);

                //container

        containerSpinner = (Spinner) findViewById(R.id.container);

        ArrayAdapter<CharSequence> containerAdapter  = ArrayAdapter.createFromResource(this,
                R.array.container_array, android.R.layout.simple_spinner_item);

        containerSpinner.setAdapter(containerAdapter);




    }

    public void submitOrder(View view) {

    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$" + number);
        priceTextView.setTextColor(Color.parseColor("#4AF6B3"));
    }

    public void decrease(View view) {
        quantity = quantity + 1;
         displayPrice(quantity);
    }

    public void increase(View view) {
        quantity= quantity - 1;
        displayPrice(quantity);
    }

    private int calculatePrice(boolean , boolean ) {
        int price = quantity * 2;

        if ( == true) {
            price++;
        }

        if (quantity == true) {
            price++;
        }
        if (quantity == true)
        return price;
    }

}
}
package com.example.saiful.celsiusfahrenheitkelvinconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText celsius;
    TextView fahrenheit, kelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celsius = (EditText) findViewById(R.id.celsius);
        fahrenheit = (TextView) findViewById(R.id.fahrenheit);
        kelvin = (TextView) findViewById(R.id.kelvin);
    }

    public void convert(View view) {
        int cel=Integer.parseInt(celsius.getText().toString());
        float far=32 + (cel * 9 / 5);
        String fa=Float.toString(far);
        fahrenheit.setText(fa);
        //kelvin.setText(fa);    //float kelvin = celsius + 273.15F;
        float kel=cel+273.15F;
        String ke=Float.toString(kel);
        kelvin.setText(ke);

    }
}

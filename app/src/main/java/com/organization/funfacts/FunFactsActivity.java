package com.organization.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG= FunFactsActivity.class.getSimpleName();
    public static final String MenajeADesplegar = "aqui esta el mensaje que quiero";
    // Declarando nuestras variables view
    private TextView factTextView;
    private Button showFactButton;
    private FactBook factBook=new FactBook();
    private ColorWheel colorWheel=new ColorWheel();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Asignando los view
        factTextView= (TextView) findViewById(R.id.factTextView4);
        showFactButton= (Button) findViewById(R.id.showFactButton);
        relativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factTextView.setText(factBook.getFact());
                //relativeLayout.setBackgroundColor(colorWheel.getColor());
                int colorTemp=Color.parseColor(colorWheel.getColorStr());
                relativeLayout.setBackgroundColor(colorTemp);
                showFactButton.setTextColor(colorTemp);
            }
        };
        showFactButton.setOnClickListener(listener);
        Toast.makeText(this, MenajeADesplegar,Toast.LENGTH_SHORT).show();
        Log.d(FunFactsActivity.TAG,MenajeADesplegar);
    }
}

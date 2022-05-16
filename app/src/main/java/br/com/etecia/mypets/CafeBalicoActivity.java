package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CafeBalicoActivity extends AppCompatActivity {



    CardView idCardView;

    Button idHum, idHdois, idHtres, idHquatro, idReserve;

    FloatingActionButton idFABCafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_balico);

        idCardView = findViewById(R.id.idCardView);
        idHum = findViewById(R.id.idHum);
        idHdois = findViewById(R.id.idHdois);
        idHtres = findViewById(R.id.idHtres);
        idHquatro = findViewById(R.id.idHquatro);
        idReserve = findViewById(R.id.idReserve);
        idFABCafe = findViewById(R.id.idFABCafe);

        idFABCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei no FloatingActionButton", Toast.LENGTH_SHORT).show();
            }
        });

        idCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei no CardView", Toast.LENGTH_SHORT).show();
            }
        });

        idHum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 5:30", Toast.LENGTH_SHORT).show();
            }
        });

        idHdois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 7:30", Toast.LENGTH_SHORT).show();
            }
        });

        idHtres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 8:30", Toast.LENGTH_SHORT).show();
            }
        });

        idHquatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em 9:00", Toast.LENGTH_SHORT).show();
            }
        });
        idReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei em reserve", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
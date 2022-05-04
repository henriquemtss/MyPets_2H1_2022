package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgVoltar = findViewById(R.id.imgVoltar);

        //ação do botão
        imgVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //abrindo a janela
                startActivity(new Intent(getApplicationContext(),
                        LoginActivity.class));
                finish();
            }
        });

    }
}
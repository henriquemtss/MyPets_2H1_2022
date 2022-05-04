package br.com.etecia.mypets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //Declarar os componentes que serão utilizados no java
    //Variáveis globais
    EditText edtUsuario, edtSenha;
    Button btnEntrar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //Declarando os componentes do xml para o java
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        //Eventos de clique nos botões

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //Implementando o botão entrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = edtUsuario.getText().toString();
                String email = edtSenha.getText().toString();

                if (nome.equals("etecia") && email.equals("etecia")) {

                    //abrindo outra janela
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Usuário ou senha inválidos!!!",
                            Toast.LENGTH_SHORT).show();
                    //chamando o método limpar tela
                    limparTela();
                }
            }
        });

    }

    //criando o método para limpar a tela
    public void limparTela() {
        edtUsuario.setText("");
        edtSenha.setText("");
        edtUsuario.requestFocus();
    }


    public void acessarJanela(View view) {


    }
}
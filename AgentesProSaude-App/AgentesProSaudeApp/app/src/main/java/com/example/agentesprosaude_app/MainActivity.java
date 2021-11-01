package com.example.agentesprosaude_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //iniciar variáveis
    private TextView titulo1;
    private TextView textoDeLogin;
    private EditText cpfTxt;
    private EditText senhaTxt;
    private Button confirmar;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacionar variáveis
        titulo1 = (TextView) findViewById(R.id.titulo1Txt);
        textoDeLogin = (TextView) findViewById(R.id.textoDeLoginTxt);
        cpfTxt = (EditText) findViewById(R.id.cpfTxt);
        senhaTxt = (EditText) findViewById(R.id.senhaTxt);
        confirmar = (Button) findViewById(R.id.confirmarBtn);

        //mudar para a activity EscolhaQuestionario ao aperta o botão
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarAct = new Intent(MainActivity.this, EscolhaQuestionario.class);
                startActivity(trocarAct);
            }
        });
    }


    /*
    public void eventos(){
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarAct = new Intent(MainActivity.this, Questionario.class);
                trocarAct.putExtra("acao", 0);
                startActivity(trocarAct);
            }
        });
    }*/

}
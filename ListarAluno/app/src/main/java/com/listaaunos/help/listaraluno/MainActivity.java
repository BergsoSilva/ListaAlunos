package com.listaaunos.help.listaraluno;

import android.content.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnAdiconar;
    private EditText edtPequisa;
    private ListView lstAlunos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdiconar= (ImageButton)findViewById(R.id.btnAdiconar);
        btnAdiconar.setOnClickListener(this);
        edtPequisa = (EditText)findViewById(R.id.edtPesquisa);
        lstAlunos= (ListView)findViewById(R.id.lstAlunos);
    }

    @Override
    public void onClick(View view) {
        Intent it= new Intent(this,actCadAlunos.class);
        startActivity(it);
    }
}

package com.listaaunos.help.listaraluno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class actCadAlunos extends AppCompatActivity {
    private EditText edtMatricula;
    private EditText edtNome;
    private EditText edtTelefone;
    private EditText edtEmail;

    private Spinner spnTipoTelefone;

    private ArrayAdapter<String> adptipoTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.act_cad_alunos);

        edtMatricula= (EditText) findViewById(R.id.edtMatricula);
        edtNome= (EditText) findViewById(R.id.edtNome);
        edtTelefone= (EditText) findViewById(R.id.edtTelefone);
        edtEmail= (EditText) findViewById(R.id.edtEmail);

        spnTipoTelefone= (Spinner)findViewById(R.id.spnTipoTelefone);

        adptipoTelefone = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item);
        adptipoTelefone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // associas spine ao arryadpte
        spnTipoTelefone.setAdapter(adptipoTelefone);

        //adicionar tipo telefone

        adptipoTelefone.add("Celular");
        adptipoTelefone.add("Trabalho");
        adptipoTelefone.add("Casa");


    }


    // mostar meu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater infater = getMenuInflater();
        infater.inflate(R.menu.menu_principal,menu);

        return super.onCreateOptionsMenu(menu);
    }

    // mostar itens menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.acao1:
                break;
            case R.id.acao2:
                break;



        }
        return super.onOptionsItemSelected(item);
    }
}

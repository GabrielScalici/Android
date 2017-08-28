package gabrielscalici.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class PrimeiraTela extends AppCompatActivity {

    //Fazendo um botao para trocar de tela
    Button botao_registrar;
    CheckBox mostrarSenha;
    EditText editTextSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);

        //Reclama que os tipos sao diferentes do parametro, entao faz um cast
        botao_registrar = (Button) findViewById(R.id.registrar_principal);
        //mostrarSenha = (RadioButton) findViewById(R.id.mostrarSenha);
        //editTextSenha = (EditText) findViewById(R.id.editTextSenha);


        botao_registrar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent i = new Intent(PrimeiraTela.this, Segunda_Tela.class);
                startActivity(i);
            }

        });

        /*
        mostrarSenha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                if(mostrarSenha.isChecked()){
                    editTextSenha.setTransformationMethod(null);
                }else{
                    editTextSenha.setTransformationMethod(new PasswordTransformationMethod());
                }

            }


        });
        */
    }
}

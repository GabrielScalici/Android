package icmc.usp.br.formularioicmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class PrimeiraTela extends AppCompatActivity {

    Button registrarBtn;
    CheckBox mostrarSenhaCB;
    EditText senhaET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);
s
        registrarBtn = (Button) findViewById(R.id.registrarBtn);
        mostrarSenhaCB = (CheckBox) findViewById(R.id.mostrarSenhaCB);
        senhaET = (EditText) findViewById(R.id.senhaET);

        registrarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrimeiraTela.this,SegundaTela.class);
                startActivity(i);
            }
        });

        mostrarSenhaCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mostrarSenhaCB.isChecked()){
                    senhaET.setTransformationMethod(null);
                }
                else{
                    senhaET.setTransformationMethod(new PasswordTransformationMethod());
                }
            }
        });
    }
}

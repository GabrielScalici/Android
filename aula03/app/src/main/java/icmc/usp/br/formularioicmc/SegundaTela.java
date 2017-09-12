package icmc.usp.br.formularioicmc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Olibario on 22/08/2017.
 */
public class SegundaTela extends AppCompatActivity{

    EditText senhaET;
    EditText confirmarSenhaET;
    Button proximoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);

        senhaET = (EditText) findViewById(R.id.senhaET);
        confirmarSenhaET = (EditText) findViewById(R.id.repetirSenhaET);
        proximoBtn = (Button) findViewById(R.id.proximoBtn);

        proximoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String senha = senhaET.getText().toString();
                String senha_confirmada = confirmarSenhaET.getText().toString();

                if (!senha.equals(senha_confirmada)){
                    Toast.makeText(SegundaTela.this, getString(R.string.erro_senha),Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(SegundaTela.this, TerceiraTela.class);
                    startActivity(intent);
                }
            }
        });
    }
}

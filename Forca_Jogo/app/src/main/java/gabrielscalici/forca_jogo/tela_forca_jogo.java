package gabrielscalici.forca_jogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tela_forca_jogo extends AppCompatActivity {

    //Armazenar a quantidade de erros
    int quantidade_vidas = 6;
    String palavra = "FELIPE";
    int getQuantidade_erros;


    public TextView exibir_vidas;
    public Button btn_submeter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_forca_jogo);

        exibir_vidas = (TextView) findViewById(R.id.txt_vidas);
        exibir_vidas.setText(String.valueOf(quantidade_vidas));

        btn_submeter = (Button) findViewById(R.id.btn_submeter);

        btn_submeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidade_vidas -= 1;
                exibir_vidas.setText(String.valueOf(quantidade_vidas));

                if(quantidade_vidas <= 0){

                    tela_perdeu(v);


                }

            }
        });



    }


    public void tela_perdeu(View view){
        Intent intent = new Intent(tela_forca_jogo.this, Tela_perdeu.class);
        startActivity(intent);
    }


}

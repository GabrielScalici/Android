package gabrielscalici.forca_jogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class tela_forca_jogo extends AppCompatActivity {

    //Armazenar a quantidade de erros
    int quantidade_erros = 0;
    TextView exibir_erros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_forca_jogo);

        exibir_erros = (TextView) findViewById(R.id.txt_tentativas);



    }



}

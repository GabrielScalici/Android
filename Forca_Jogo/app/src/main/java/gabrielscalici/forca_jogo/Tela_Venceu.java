package gabrielscalici.forca_jogo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela_Venceu extends AppCompatActivity {

    public Button btn_voltar;
    public TextView txt_tempo;
    int aux_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_venceu);

        Intent intent = getIntent();
        long tempo = intent.getLongExtra("tempo", -1);
        int index = intent.getIntExtra("indice", -1);

        //Arrumando o indice para mandar de volta
        aux_index = index + 1;

        btn_voltar = (Button) findViewById(R.id.btn_restart);
        txt_tempo = (TextView) findViewById(R.id.txt_timer);

        txt_tempo.setText(String.valueOf(tempo/1000 + " segundos"));

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Tela_Venceu.this, tela_forca_jogo.class);
                intent.putExtra("auxindice", aux_index);
                startActivity(intent);

            }
        });
    }
}

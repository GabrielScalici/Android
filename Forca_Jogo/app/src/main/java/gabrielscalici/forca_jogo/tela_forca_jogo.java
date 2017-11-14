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
    int quantidade_vidas = 7;
    String palavra = "FELIPE";
    String segredo;
    int getQuantidade_erros;
    long startTime;

    public TextView exibir_vidas;
    public TextView txt_segredo;
    public Button btn_submeter;
    public EditText caixa;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_forca_jogo);

        startTime = System.currentTimeMillis();


        exibir_vidas = (TextView) findViewById(R.id.txt_vidas);
        exibir_vidas.setText(String.valueOf(quantidade_vidas));


        caixa = (EditText) findViewById(R.id.edt_palavra);

        btn_submeter = (Button) findViewById(R.id.btn_submeter);
        btn_submeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //quantidade_vidas -= 1;


                //Pegnado o texto
                String txt = caixa.getText().toString();

                if(txt.compareTo(palavra)==0){
                    long estimatedTime = System.currentTimeMillis() - startTime;
                    tela_venceu(v, estimatedTime);

                }else{
                    quantidade_vidas -= 1;
                }


                if(quantidade_vidas <= 0){
                    tela_perdeu(v);
                }

                exibir_vidas.setText(String.valueOf(quantidade_vidas));
            }
        });



    }


    public void tela_perdeu(View view){
        Intent intent = new Intent(tela_forca_jogo.this, Tela_perdeu.class);
        startActivity(intent);
    }

    public void tela_venceu(View view, long time){
        Intent intent = new Intent(tela_forca_jogo.this, Tela_Venceu.class);
        intent.putExtra("tempo", time);
        startActivity(intent);
    }

    public void exibir_palavra(){

    }

}

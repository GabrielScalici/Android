package icmc.usp.br.formularioicmc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Olibario on 29/08/2017.
 */
public class TerceiraTela extends AppCompatActivity implements ListaFragment.OnListaFragmentListener{

    String[] paises = {"Argentina", "Bolívia", "Brasil",
                    "Chile", "Colômbia", "Peru"};
    int[] bandeiras = {R.drawable.argentina, R.drawable.bolivia, R.drawable.brasil,
            R.drawable.chile, R.drawable.colombia, R.drawable.peru};

    ListView lista_paises;

    @Override
    public void getBandeiraSelecionada(int posicao) {
        ImgFragment imgFragment = (ImgFragment)getFragmentManager().
                findFragmentById(R.id.fragmentBottom);
        imgFragment.setBandeira(bandeiras[posicao]);
    }

    @Override
    public ArrayAdapter getAdapter() {
        return new CustomAdapter(TerceiraTela.this, paises, bandeiras);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terceira_tela);

//        lista_paises = (ListView) findViewById(R.id.lista_paises);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(TerceiraTela.this,
//                R.layout.linha_paises, R.id.pais, paises);

//        CustomAdapter adapter = new CustomAdapter(TerceiraTela.this, R.layout.linha_paises,
//                paises, bandeiras);
//
//        lista_paises.setAdapter(adapter);
//
//        lista_paises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ImageView bandeira = (ImageView) findViewById(R.id.bandeira_selecionada);
//                bandeira.setImageResource(bandeiras[position]);
//            }
//        });

    }
}

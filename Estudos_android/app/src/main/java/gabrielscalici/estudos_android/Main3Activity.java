package gabrielscalici.estudos_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {


    String[] paises = {"Argentina", "Brasil", "Chile", "Colombia", "Peru"}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //manda para o id que fez no xml
        //lista_paises = (ListView) findViewById(R.id.lista_paises);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(Main3Activity.this)

    }
}

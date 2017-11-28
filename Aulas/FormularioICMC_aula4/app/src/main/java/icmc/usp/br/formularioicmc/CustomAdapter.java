package icmc.usp.br.formularioicmc;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Olibario on 12/09/2017.
 */
public class CustomAdapter extends ArrayAdapter {
    Activity contexto;
    String[] paises;
    int[] bandeiras;

    public CustomAdapter(Context context, String[] paises, int[] bandeiras) {
        super(context, R.layout.linha_paises, paises);
        this.paises = paises;
        this.bandeiras = bandeiras;
        this.contexto = (Activity) context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View row = inflater.inflate(R.layout.linha_paises, null, true);
        TextView paisDesc = (TextView) row.findViewById(R.id.pais);
        ImageView paisImg = (ImageView) row.findViewById(R.id.imgBandeira);

        paisDesc.setText(paises[position]);
        paisImg.setImageResource(bandeiras[position]);

        return row;
    }

}

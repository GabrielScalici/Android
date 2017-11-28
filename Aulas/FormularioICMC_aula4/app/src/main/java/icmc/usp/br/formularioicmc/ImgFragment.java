package icmc.usp.br.formularioicmc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Olibario on 12/09/2017.
 */
public class ImgFragment extends Fragment {

    ImageView imgBandeira;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.img_fragment, container, false);
        imgBandeira = (ImageView) view.findViewById(R.id.bandeira_selecionada);

        return view;
    }

    public void setBandeira(int bandeira){
        imgBandeira.setImageResource(bandeira);
    }
}

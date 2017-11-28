package icmc.usp.br.formularioicmc;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Olibario on 12/09/2017.
 */
public class ListaFragment extends Fragment {
    ListView lista;
    OnListaFragmentListener listener;

    public interface OnListaFragmentListener{
        public void getBandeiraSelecionada(int posicao);
        public ArrayAdapter getAdapter();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            listener = (OnListaFragmentListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()+ "\nNecessário implementar " +
                                    "métodos da interface");
        }
    }

    @Override
    public void onAttach(Activity context) {
        super.onAttach(context);

        try{
            listener = (OnListaFragmentListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()+ "\nNecessário implementar " +
                    "métodos da interface");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lista_fragment,container, false);
        lista = (ListView) view.findViewById(R.id.lista_paises);

        lista.setAdapter(listener.getAdapter());

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listener.getBandeiraSelecionada(position);
            }
        });

        return view;
    }
}

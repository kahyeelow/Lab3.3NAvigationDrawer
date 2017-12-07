package my.edu.tarc.lab33navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {
    private TextView textViewMessage;

    public ImportFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Link UI to program
        //similar to set content's view to v
        View v = inflater.inflate(R.layout.fragment_import, container, false);

        textViewMessage = (TextView)v.findViewById(R.id.textViewMessage);
        Button buttonCamera = (Button)v.findViewById(R.id.buttonCamera);
        buttonCamera.setOnClickListener(new View.OnClickListener() {

            //when click the button Camera show this onClick
            @Override
            public void onClick(View v) {
                textViewMessage.setText("Say Cheese!!!");
            }
        });

        // Inflate the layout for this fragment
        return v;
    }

}

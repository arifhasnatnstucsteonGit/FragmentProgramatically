package practice.arifhasnat.fragmentprogramatically;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Arif hasnat on 4/5/2016.
 */
public class FragmentTwo extends Fragment {

    Button fragmentOne,mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_two, container, false);

        fragmentOne= (Button) view.findViewById(R.id.buttonFragmentOne_FragmentTwo);
        mainActivity = (Button) view.findViewById(R.id.buttonMainActivity_fragmentTwo);

        fragmentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne newFragment = new FragmentOne();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainerLayout, newFragment);
                transaction.commit();

            }
        });

        mainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(getActivity().getApplicationContext(),MainActivity.class);
                startActivity(intent);


            }
        });

        return view;


    }
}

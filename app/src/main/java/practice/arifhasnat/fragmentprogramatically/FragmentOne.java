package practice.arifhasnat.fragmentprogramatically;

import android.animation.Animator;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.zip.Inflater;

/**
 * Created by Arif hasnat on 4/5/2016.
 */
public class FragmentOne extends Fragment {

    Button fragmentTwo,mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_one, container, false);

        fragmentTwo= (Button) view.findViewById(R.id.buttonFragmentTwo_FragmentOne);
        mainActivity = (Button) view.findViewById(R.id.buttonMainActivity_FragmentOne);

        fragmentTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo newFragment = new FragmentTwo();
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

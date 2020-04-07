package com.t.androidca2project.P2;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.t.androidca2project.R;

public class Main1Fragment extends Fragment {


    SendMessage SM;

    RadioGroup radioGroup;

    RadioButton radioButton,radioButton1,radioButton2,radioButto3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.activity_main1_fragment, container, false);

        return rootView;


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        radioButton = view.findViewById(R.id.radio1);
        radioButton1 = view.findViewById(R.id.radio2);
        radioButton2 = view.findViewById(R.id.radio3);
        radioButto3 = view.findViewById(R.id.radio4);
        radioButton4 = view.findViewById(R.id.radio5);
        radioButton5 = view.findViewById(R.id.radio6);
        radioButton6 = view.findViewById(R.id.radio7);
        radioButton7 = view.findViewById(R.id.radio8);
        radioButton8 = view.findViewById(R.id.radio9);
        radioButton9 = view.findViewById(R.id.radio10);

        radioGroup = view.findViewById(R.id.rg);



        loadSetting();




        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {


                SharedPreferences sharedPreferences= getActivity().getSharedPreferences("gameSetting", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = sharedPreferences.edit();


                // Checked RadioButton ID.
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

                editor.putInt("checkedRadioButtonId", checkedRadioButtonId);

                // Save.
                editor.apply();


                switch (checkedId)
                {
                    case R.id.radio1:

                        SM.sendData(radioButton.getText().toString());



                        break;

                    case R.id.radio2:


                        SM.sendData(radioButton1.getText().toString());


                        break;

                    case R.id.radio3:


                        SM.sendData(radioButton2.getText().toString());


                        break;


                    case R.id.radio4:


                        SM.sendData(radioButto3.getText().toString());


                        break;

                    case R.id.radio5:

                        SM.sendData(radioButton4.getText().toString());



                        break;

                    case R.id.radio6:


                        SM.sendData(radioButton5.getText().toString());


                        break;

                    case R.id.radio7:


                        SM.sendData(radioButton6.getText().toString());


                        break;

                    case R.id.radio8:

                        SM.sendData(radioButton7.getText().toString());



                        break;

                    case R.id.radio9:


                        SM.sendData(radioButton8.getText().toString());


                        break;

                    case R.id.radio10:


                        SM.sendData(radioButton9.getText().toString());


                        break;

                    default:

                }

            }
        });

    }

    interface SendMessage {
        void sendData(String message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            SM = (SendMessage) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException("Error in retrieving data. Please try again");
        }
    }


    private void loadSetting()  {
        SharedPreferences sharedPreferences= getActivity().getSharedPreferences("gameSetting", Context.MODE_PRIVATE);

        if(sharedPreferences!= null) {


            int checkedRadioButtonId = sharedPreferences.getInt("checkedRadioButtonId", R.id.radio1);


            this.radioGroup.check(checkedRadioButtonId);

        }

    }

}


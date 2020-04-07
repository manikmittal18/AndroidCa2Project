package com.t.androidca2project.P2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

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

public class Main2Fragment extends Fragment {




    RelativeLayout relativeLayout;

    RadioGroup radioGroup;

    RadioButton radioButton,radioButton1,radioButton2,radioButto3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,radioButton9;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.activity_main2_fragment, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        relativeLayout = view.findViewById(R.id.rl);

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
    }

    protected void displayReceivedData(String message)
    {
        if (message.equals("Blue")){
            relativeLayout.setBackgroundColor(Color.BLUE);
        }

        else if (message.equals("Yellow")){
            relativeLayout.setBackgroundColor(Color.YELLOW);
        }

        else if (message.equals("Red")){
            relativeLayout.setBackgroundColor(Color.RED);
        }


        else if (message.equals("Black")){
        relativeLayout.setBackgroundColor(Color.BLACK);
    }

    else if (message.equals("Green")){
        relativeLayout.setBackgroundColor(Color.GREEN);
    }

    else if (message.equals("Gray")){
        relativeLayout.setBackgroundColor(Color.GRAY);
    }

    else if (message.equals("White")){
        relativeLayout.setBackgroundColor(Color.WHITE);
    }

    else if (message.equals("Magenta")){
        relativeLayout.setBackgroundColor(Color.MAGENTA);
    }

    else if (message.equals("Cyan")){
        relativeLayout.setBackgroundColor(Color.CYAN);
    }

    else if (message.equals("LTGray")){
        relativeLayout.setBackgroundColor(Color.LTGRAY);
    }
    }


    private void loadSetting()  {
        SharedPreferences sharedPreferences= getActivity().getSharedPreferences("gameSetting", Context.MODE_PRIVATE);

        if(sharedPreferences!= null) {


            int checkedRadioButtonId = sharedPreferences.getInt("checkedRadioButtonId", R.id.radio1);


            this.radioGroup.check(checkedRadioButtonId);

            if (radioButton.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.BLUE);

            }

            else if (radioButton1.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.YELLOW);
            }

            else if (radioButton2.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.RED);
            }

            if (radioButto3.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.BLACK);

            }

            else if (radioButton4.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.GREEN);
            }

            else if (radioButton5.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.GRAY);
            }

            if (radioButton6.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.WHITE);

            }

            else if (radioButton7.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.MAGENTA);
            }

            else if (radioButton8.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.CYAN);
            }

            else if (radioButton9.isChecked())
            {
                relativeLayout.setBackgroundColor(Color.LTGRAY);
            }

        }
    }
}


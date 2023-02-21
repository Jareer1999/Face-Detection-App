package com.example.facereg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;          ////this represent fragment_resultDialog.xml file


public class ResultDialog extends DialogFragment {

    Button btn ;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_resultdialog,container,false);                //linking fragment_resultDialog.xml file
        String text = "";
        btn = view.findViewById(R.id.ok_btn);
        textView = view.findViewById(R.id.dialog);

        // Getting the bundle:

        Bundle bundle = getArguments();
        text = bundle.getString("RESULT_TEXT");
        textView.setText(text);


        //Adding click listeners to btn
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return view;



    }
}

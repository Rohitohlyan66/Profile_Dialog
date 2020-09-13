package com.example.profiledialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder alertDialog;
    Button showProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showProfile = findViewById(R.id.show_profile);

        //Click Listener on Show Dialog Button--------------->
        showProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creating a dialog and showing it-------------->
                alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setView(R.layout.custom_dialog_view);
                final AlertDialog dialog = alertDialog.create();
                dialog.show();

                //Handling outside touch of Dialog---------------->
                dialog.setCanceledOnTouchOutside(false);


                ImageView imageView = dialog.findViewById(R.id.close_dialog);
                Button follow = dialog.findViewById(R.id.follow_button);

                //Closing the Dialog on clicking of the cross image------------->
                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "You Closed the Dialog", Toast.LENGTH_SHORT).show();
                    }
                });

                //Click Listener on Follow Button-------------------->
                follow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Thanks for the Follow", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });


    }
}
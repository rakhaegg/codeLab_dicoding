package org.aplas.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener((View.OnClickListener) this);

        Button btnMovActivityWithData = findViewById(R.id.btn_move_activity_data);
        btnMovActivityWithData.setOnClickListener((View.OnClickListener) this);


        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener((View.OnClickListener) this);



    }

    public void onClick(View v){
        if(v.getId() == R.id.btn_move_activity){
            Intent moveIntent = new Intent(MainActivity.this , MoveActivity.class);
            startActivity(moveIntent);
        }else if( v.getId() == R.id.btn_move_activity_data){
            Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataAcitiy.class);
            moveWithDataIntent.putExtra(MoveWithDataAcitiy.EXTRA_NAME , "DicodingAcademy Boy");
            moveWithDataIntent.putExtra(MoveWithDataAcitiy.EXTRA_AGE, 5);
            startActivity(moveWithDataIntent);
        }else if(v.getId() == R.id.btn_dial_number){
            String phoneNumber = "081210841382";
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
            startActivity(dialPhoneIntent);
        }
    }
}

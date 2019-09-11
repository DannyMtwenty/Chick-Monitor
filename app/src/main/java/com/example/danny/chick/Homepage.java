package com.example.danny.chick;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.Project.minimaltodo.R;
import com.example.danny.chick.Main.MainActivity;

public class Homepage extends AppCompatActivity {
private CardView diseaseCard,vaccinationCard,brooderCard,reminderCard,mapCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        diseaseCard=(CardView)findViewById(R.id.diseasecard);
        vaccinationCard=(CardView)findViewById(R.id.vaccinationcard);
        brooderCard=(CardView)findViewById(R.id.broodercard);
        reminderCard=(CardView)findViewById(R.id.remindercard);
        mapCard=(CardView)findViewById(R.id.mapcard);
reminderCard.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Homepage.this, MainActivity.class);
        startActivity(intent);
    }
});
        mapCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this, Search.class);
                startActivity(intent);
            }
        });

        diseaseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Homepage.this,InitialCheck.class);
                startActivity(intent);
            }
        });
    }

}

package sg.edu.rp.c346.id22012205.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnRevealQ1;

    Button btnRevealQ2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRevealQ1=findViewById(R.id.buttonRevealQ1);
        btnRevealQ2=findViewById(R.id.buttonRevealQ2);
        Log.d("MainActivity","onCreate() called.");
        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("Question","Q1");
                startActivity(intent);
            }
        });
        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this, AnswerActivity.class);
                intent2.putExtra("Question","Q2");
                startActivity(intent2);
            }
        });
    }

}
package th.ac.su.ict.kanyanat.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvoutput1;
    private Button btnBut1;
    private Button btnBut2;
    private Button btnBut3;
    private Button btnBut4;
    private Button btnBut5;
    private Button btnBut6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvoutput1 = findViewById(R.id.tvoutput1);
        btnBut1 = findViewById(R.id.btnBut1);
        btnBut2 = findViewById(R.id.btnBut2);
        btnBut3 = findViewById(R.id.btnBut3);
        btnBut4 = findViewById(R.id.btnBut4);
        btnBut5 = findViewById(R.id.btnBut5);
        btnBut6 = findViewById(R.id.btnBut6);

        btnBut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvoutput1.setText("235-255-221");
                tvoutput1.setBackgroundColor(Color.parseColor("#e9dbdb"));
            }
        });

        btnBut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvoutput1.setText("235-203-202");
                tvoutput1.setBackgroundColor(Color.parseColor("#eccbca"));
            }
        });

        btnBut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvoutput1.setText("255-117-131");
                tvoutput1.setBackgroundColor(Color.parseColor("#7583a5"));
            }
        });



        btnBut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvoutput1.setText("153-169-191");
                tvoutput1.setBackgroundColor(Color.parseColor("#99a9bf"));
            }
        });



        btnBut5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvoutput1.setText("195-204-216");
                tvoutput1.setBackgroundColor(Color.parseColor("#c3ccd8"));
            }
        });




        btnBut6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvoutput1.setText("221-226-269");
                tvoutput1.setBackgroundColor(Color.parseColor("#dadfe3"));
            }
        });

    }
}

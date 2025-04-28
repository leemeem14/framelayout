package kr.ac.kopo.framelayou;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearspring, linearsummer, linearfall, linearwinter;
    Button btnSpring, btnSummer, btnFall, btnWinter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        linearspring = findViewById(R.id.linear_spring);
        linearsummer = findViewById(R.id.linear_summer);
        linearfall = findViewById(R.id.linear_fall);
        linearwinter = findViewById(R.id.linear_winter);

        btnSpring = findViewById(R.id.spring);
        btnSummer = findViewById(R.id.summer);
        btnFall = findViewById(R.id.fall);
        btnWinter = findViewById(R.id.winter);

        btnSpring.setOnClickListener(btnListener);
        btnSummer.setOnClickListener(btnListener);
        btnFall.setOnClickListener(btnListener);
        btnWinter.setOnClickListener(btnListener);

    }
    View.OnClickListener btnListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            linearspring.setVisibility(View.INVISIBLE);
            linearsummer.setVisibility(View.INVISIBLE);
            linearfall.setVisibility(View.INVISIBLE);
            linearwinter.setVisibility(View.INVISIBLE);
            Button btnE = (Button)v;
            if(btnE == btnSpring){
                linearspring.setVisibility(View.VISIBLE);
            } else if(btnE == btnSummer){
                linearsummer.setVisibility(View.VISIBLE);
            } else if(btnE == btnFall){
                linearfall.setVisibility(View.VISIBLE);
            } else {
                linearwinter.setVisibility(View.VISIBLE);
            }
        }
    };
}
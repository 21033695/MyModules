package sg.edu.rp.c346.id21033695.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC206;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC346 = findViewById(R.id.textViewC346);
        tvC206 = findViewById(R.id.textViewC206);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C346");
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Academic Year", 2);
                intent.putExtra("Semester", 2);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module Code", "C206");
                intent.putExtra("Module Name", "Software Development Process");
                intent.putExtra("Academic Year", 2);
                intent.putExtra("Semester", 2);
                intent.putExtra("Module Credit", 4);
                intent.putExtra("Venue", "E66K");
                startActivity(intent);
            }
        });
    }
}
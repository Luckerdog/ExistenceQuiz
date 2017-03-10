package lopez.existencequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GeoQuiz extends AppCompatActivity {

    private Button mA, mB, mC, mD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo_quiz);
        mA = (Button) findViewById(R.id.button_A);
        mA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(GeoQuiz.this,R.string.incorrect_toast,Toast.LENGTH_SHORT);
                toast.setGravity(10,5,5);
                toast.show();
            }
        });
        mB = (Button) findViewById(R.id.button_B);
        mB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(GeoQuiz.this,R.string.correct_toast,Toast.LENGTH_SHORT);
                toast.setGravity(10,5,5);
                toast.show();
            }
        });
        mC = (Button) findViewById(R.id.button_C);
        mC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(GeoQuiz.this,R.string.incorrect_toast,Toast.LENGTH_SHORT);
                toast.setGravity(10,5,5);
                toast.show();
            }
        });
        mD = (Button) findViewById(R.id.button_D);
        mD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(GeoQuiz.this,R.string.incorrect_toast,Toast.LENGTH_SHORT);
                toast.setGravity(10,5,5);
                toast.show();
            }
        });
    }
}

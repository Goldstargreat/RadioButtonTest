package kr.ac.kopo.radiobuttontest;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rbMale, rbFemale;
    TextView textResult;

    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        rbMale = findViewById(R.id.rg_male);
        rbFemale = findViewById(R.id.rg_female);
        textResult = findViewById(R.id.text_result);
        imgv = findViewById(R.id.imgv);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String result = "";
                int imgRes = 0;
                if (checkedId == rbMale.getId())
                {
                    result = "남성";
                    imgRes = R.drawable.male;
                } else
                {
                    result = "여성";
                    imgRes = R.drawable.female;
                }
                textResult.setText(result + "을 선택했습니다.");
                imgv.setImageResource(imgRes);
            }
        });
    }
}
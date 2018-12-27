package helloworld.com.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox chkH,chkG,chkPG,chkPro;
    TextView textViewOut;
    String level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkH = findViewById(R.id.checkBoxHigh);
        chkG = findViewById(R.id.checkBoxGrad);
        chkPG = findViewById(R.id.checkBoxPost);
        chkPro = findViewById(R.id.checkBoxProf);
        textViewOut = findViewById(R.id.textViewOut);
        chkH.setOnCheckedChangeListener(this);
        chkG.setOnCheckedChangeListener(this);
        chkPG.setOnCheckedChangeListener(this);
        chkPro.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        int id = compoundButton.getId();
        switch (id){
            case R.id.checkBoxHigh:
                if (chkH.isChecked()) {
                    textViewOut.setText(level = "High School");
                    }
                break;
            case R.id.checkBoxGrad:
                if (chkG.isChecked()){
                    textViewOut.setText(level = "Graduates");
                }
                break;
            case R.id.checkBoxPost:
                if (chkPG.isChecked()){
                    textViewOut.setText(level = "Post Graduates");
                }
                break;
            case R.id.checkBoxProf:
                if (chkPro.isChecked()){
                    textViewOut.setText(level = "Professional Degree");
                }
                break;
        }
    }
}

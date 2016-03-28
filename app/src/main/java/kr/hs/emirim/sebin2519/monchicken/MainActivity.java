package kr.hs.emirim.sebin2519.monchicken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);//activity_main에서 가져와서 사용 / 타입캐스팅.;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }
}

package kr.hs.emirim.sebin2519.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mirim on 2016-03-28.
 */
public class ResultActivity extends AppCompatActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult=(TextView)findViewById(R.id.result);
        mResult.setText("결과"); //결과 출력


        Intent intent = getIntent();
        String name=intent.getStringExtra("username"); //없을때 저절로 null이 됨
        int age=intent.getIntExtra("age",-1); //없을때 -1을 넘겨줌
        mResult.setText(name+"님, 안녕하세요~!!");
    }


}

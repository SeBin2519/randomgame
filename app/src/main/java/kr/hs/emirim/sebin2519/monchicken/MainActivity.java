package kr.hs.emirim.sebin2519.monchicken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mName;
    Button mBotton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);//activity_main에서 가져와서 사용 / 타입캐스팅.;
        mBotton=(Button) findViewById(R.id.btn_show_me_the_chicken);
        mBotton.setOnClickListener(this);//main_activity는 클릭을 담당할 거에요!
    }

    @Override
    protected void onResume() { //화면이 보여질 떄마다 실행
        super.onResume();
        mName.setText("");
    }

    /** < javaDoc >
     * Called when a view has been clicked.(함수설면)
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        Toast.makeText(this,"**배고파요!(ㅜ. ㅜ)**",Toast.LENGTH_LONG).show();
        //Toast: 밑에 잠깐 나왔다가 사라지는 것(반드시 메소드가 있어야함 / 여러개의 메소드 연결: 체인 메서드
    }
}

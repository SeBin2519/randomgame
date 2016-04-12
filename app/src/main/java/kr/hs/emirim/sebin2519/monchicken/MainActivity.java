package kr.hs.emirim.sebin2519.monchicken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        mName.setText(null);
    }

    /** < javaDoc >
     * Called when a view has been clicked.(함수설면)
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        //누른 순간에 입력한것을 받아옴
        String name=mName.getText().toString();//내용을 읽어오세요: getText() - 단 retun타입이 Editable => toString으로 반환해주어야함

        //name 출력
//        if(name==null) {//이름이 NULL일 경우 예외처리작업
//            Toast.makeText(this,"이름을 입력해 주세요!",Toast.LENGTH_LONG).show();
//        }else {
//            Toast.makeText(this, name + "씨 배고파요!(ㅜ. ㅜ)", Toast.LENGTH_LONG).show(); //상대방이 이름을 입력하지 않을경우 이상한 것이 뜸 => 예외처리해주어야함
//            //Toast: 밑에 잠깐 나왔다가 사라지는 것(반드시 메소드가 있어야함 / 여러개의 메소드 연결: 체인 메서드
//            Intent intent =new Intent(this,ResultActivity.class);//객체 생성==>(문맥 ,넘어갈 엑티비티.확장자)
//            startActivity(intent);//받은 intent, 넘어가주세요!
//        }

        try{//트라이캐치
            Toast.makeText(this, name + "씨 배고파요!(ㅜ. ㅜ)", Toast.LENGTH_LONG).show();
            Intent intent =new Intent(this,ResultActivity.class);
            intent.putExtra("username",name);//Extra: 추가
            intent.putExtra("age",10);//나이 넘기기
            startActivity(intent);
            overridePendingTransition(0, R.anim.zoom_exit);
        }catch(NullPointerException e){
            Toast.makeText(this,"이름을 입력해 주세요!",Toast.LENGTH_LONG).show();
        }catch(Exception e) { //모든 예외(나머지 예외)
            Toast.makeText(this, "뭔지 모르지만 잘 안되네요!(ㅜ. ㅠ)", Toast.LENGTH_LONG).show();
        }
    }
}

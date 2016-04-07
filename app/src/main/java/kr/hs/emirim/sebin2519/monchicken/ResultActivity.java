package kr.hs.emirim.sebin2519.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Mirim on 2016-03-28.
 */
public class ResultActivity extends AppCompatActivity {
    static String TAG="뭔치킨:ResultActivity"; //어디에서 어떻게 ,Activity마다 만들어줘야함
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG,"결과 액티비티 시작!");//v:verBose, 저는 여기서 에러가 나요

        mResult=(TextView)findViewById(R.id.result);
       // mResult.setText("결과"); //결과 출력
        Log.d(TAG,"텍스트뷰 연결 성공!");
        mImageView=(ImageView) findViewById(R.id.imageView);
        Log.d(TAG,"이미지 연결 성공!");

        Random r= new Random(); //랜덤 객체 호출 후
       int result = r.nextInt(5);
        Log.d(TAG,"랜덤값 생성! : "+result);

        /*첫번째 방법
        if(result==0)
            mImageView.setImageResource(R.drawable.ch1);
        else if(result==1)
            mImageView.setImageResource(R.drawable.ch2);
        else if(result==2)
            mImageView.setImageResource(R.drawable.ch3);
        else if(result==3)
            mImageView.setImageResource(R.drawable.ch4);
        else if(result==4)
            mImageView.setImageResource(R.drawable.ch5);
      */

       /*2번째 방법
       switch (result){
            case 0:mImageView.setImageResource(R.drawable.ch1); break;
            case 1:mImageView.setImageResource(R.drawable.ch2); break;
            case 2:mImageView.setImageResource(R.drawable.ch3); break;
            case 3:mImageView.setImageResource(R.drawable.ch4); break;
            case 4:mImageView.setImageResource(R.drawable.ch5); break;
        }*/

        mImageView.setImageResource(R.drawable.ch1+result); //3번째 방법

        Intent intent = getIntent();
        String name=intent.getStringExtra("username"); //없을때 저절로 null이 됨
        Log.d(TAG,"인텐트 값 읽기(name): "+name);

        int age=intent.getIntExtra("age",-1); //없을때 -1을 넘겨줌, 다른 타입을 넘겨받았을 경우는 null
        Log.d(TAG,"인텐트 값 읽기(age): "+age);

        mResult.setText(name+"님, 안녕하세요~!!");
    }


}

package haru.boxy.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Activity 클래스가 인스턴스화 된 후 가장 먼저 호출되는 메소드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //상위 클래스의 메소드를 호출
        super.onCreate(savedInstanceState);
        //화면 출력을 위해서 뷰를 설정하는 메소드
        setContentView(R.layout.activity_main);
    }
}

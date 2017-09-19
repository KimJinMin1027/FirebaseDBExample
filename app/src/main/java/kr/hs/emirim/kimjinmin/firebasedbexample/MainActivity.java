package kr.hs.emirim.kimjinmin.firebasedbexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mNameTextView; //멤버변수 이름 앞엔 m붙여서 보기 편하도록
    private TextView mGithubTextView;
    private ImageView mProfileImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameTextView=(TextView) findViewById(R.id.profile_name);
        mGithubTextView=(TextView) findViewById(R.id.profile_github);
        mProfileImageView=(ImageView) findViewById(R.id.profile_image);


    }
}
